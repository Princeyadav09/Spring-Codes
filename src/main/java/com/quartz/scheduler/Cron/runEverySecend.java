package com.quartz.scheduler.Cron;

import com.quartz.scheduler.Job.HelloWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class runEverySecend {
    public static final Logger Log = LoggerFactory.getLogger(HelloWorld.class);

    @Scheduled(initialDelay = 1000, fixedRate = 10000)
    public void runEverySeconds(){
        Log.info("Current date is :: " + LocalDate.now());
    }
}
