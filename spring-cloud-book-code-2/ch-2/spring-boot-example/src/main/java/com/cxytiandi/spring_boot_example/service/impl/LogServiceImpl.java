package com.cxytiandi.spring_boot_example.service.impl;

import com.cxytiandi.spring_boot_example.config.AsyncTaskExecutePool;
import com.cxytiandi.spring_boot_example.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    AsyncTaskExecutePool asyncTaskExecutePooll;

    @Async
    @Override
    public void saveLog() {
        System.out.println(asyncTaskExecutePooll);
        System.out.println(asyncTaskExecutePooll.getAsyncExecutor());
        System.out.println(Thread.currentThread().getName());
        System.out.println(1 / 0);
    }
}
