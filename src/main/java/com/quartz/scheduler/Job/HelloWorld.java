package com.quartz.scheduler.Job;

import com.quartz.scheduler.info.TimerInfo;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld implements Job {
    public static final Logger Log = LoggerFactory.getLogger(HelloWorld.class);

    @Override
    public void execute(JobExecutionContext context){
        JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
        TimerInfo info = (TimerInfo) jobDataMap.get(HelloWorld.class.getSimpleName());
        Log.info("Remaining fire count is '{}'", info.getRemainingFireCount());
    }
}
