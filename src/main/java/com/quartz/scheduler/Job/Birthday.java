package com.quartz.scheduler.Job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Birthday implements Job {
    public static final Logger Log = LoggerFactory.getLogger(HelloWorld.class);

    @Override
    public void execute(JobExecutionContext context){
        Log.info("Happy Birthday...");
    }
}
