package com.quartz.scheduler.TimerService;

import com.quartz.scheduler.Job.HelloWorld;
import com.quartz.scheduler.Utils.TimerUtil;
import com.quartz.scheduler.info.TimerInfo;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.quartz.*;
import org.quartz.impl.matchers.GroupMatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class SchedulerService {
    public static final Logger Log = LoggerFactory.getLogger(HelloWorld.class);

    private final Scheduler scheduler;

    @Autowired
    public SchedulerService(Scheduler scheduler){
        this.scheduler=scheduler;
    }

    public <T extends Job> void schedule(final Class<T> jobClass, final TimerInfo info) {
        final JobDetail jobDetail = TimerUtil.buildJobDetail(jobClass, info);
        final Trigger trigger = TimerUtil.buildTrigger(jobClass, info);

        try {
            scheduler.scheduleJob(jobDetail, trigger);
        } catch (SchedulerException e) {
            Log.error(e.getMessage(), e);
        }
    }

    public <T extends Job> void scheduleEmail(final Class<T> jobClass) {
        final JobDetail jobDetail = JobBuilder.newJob(jobClass).withIdentity("myJob", "group1").build();
        Trigger cronTrigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger1", "group1")
                .withSchedule(CronScheduleBuilder.cronSchedule("0 0/1 * 1/1 * ? *"))
                .forJob(jobDetail)
                .build();

        try {
            scheduler.scheduleJob(jobDetail, cronTrigger);
        } catch (SchedulerException e) {
            Log.error(e.getMessage(), e);
        }
    }

    public <T extends Job> void scheduleBirthday(final Class<T> jobClass) {
        final JobDetail jobDetail = JobBuilder.newJob(jobClass).withIdentity("birthday", "group1").build();
        Trigger cronTrigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger2", "group1")
                .withSchedule(CronScheduleBuilder.cronSchedule("0 0/2 * 1/1 * ? *"))
                .forJob(jobDetail)
                .build();

        try {
            scheduler.scheduleJob(jobDetail, cronTrigger);
        } catch (SchedulerException e) {
            Log.error(e.getMessage(), e);
        }
    }

    public List<TimerInfo> getAllRunningTimers() {
        try {
            return scheduler.getJobKeys(GroupMatcher.anyGroup())
                    .stream()
                    .map(jobKey -> {
                        try {
                            final JobDetail jobDetail = scheduler.getJobDetail(jobKey);
                            return (TimerInfo) jobDetail.getJobDataMap().get(jobKey.getName());
                        } catch (final SchedulerException e) {
                            Log.error(e.getMessage(), e);
                            return null;
                        }
                    })
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
        } catch (final SchedulerException e) {
            Log.error(e.getMessage(), e);
            return Collections.emptyList();
        }
    }

    public TimerInfo getRunningTimer(final String timerId) {
        try {
            final JobDetail jobDetail = scheduler.getJobDetail(new JobKey(timerId));
            if (jobDetail == null) {
                Log.error("Failed to find timer with ID '{}'", timerId);
                return null;
            }

            return (TimerInfo) jobDetail.getJobDataMap().get(timerId);
        } catch (final SchedulerException e) {
            Log.error(e.getMessage(), e);
            return null;
        }
    }

    public void updateTimer(final String timerId, final TimerInfo info) {
        try {
            final JobDetail jobDetail = scheduler.getJobDetail(new JobKey(timerId));
            if (jobDetail == null) {
                Log.error("Failed to find timer with ID '{}'", timerId);
                return;
            }

            jobDetail.getJobDataMap().put(timerId, info);

            scheduler.addJob(jobDetail, true, true);
        } catch (final SchedulerException e) {
            Log.error(e.getMessage(), e);
        }
    }

    public Boolean deleteTimer(final String timerId) {
        try {
            return scheduler.deleteJob(new JobKey(timerId));
        } catch (SchedulerException e) {
            Log.error(e.getMessage(), e);
            return false;
        }
    }

    @PostConstruct
    public void init() {
       try {
            scheduler.start();
//            scheduler.getListenerManager().addTriggerListener(new SimpleTriggerListener(this));
       } catch (SchedulerException e){
           Log.error(e.getMessage(), e);
       }
    }

    @PreDestroy
    public void preDestroy(){
        try {
            scheduler.shutdown();
        } catch (SchedulerException e){
            Log.error(e.getMessage(), e);
        }
    }
}
