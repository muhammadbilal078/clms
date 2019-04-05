package com.carloanmanagementsystem;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@ComponentScan(basePackages = "com.carloanmanagementsystem")
@EnableAutoConfiguration
@SpringBootApplication
public class Application extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//	@Override
//	public Executor getAsyncExecutor() {
//		// TODO Auto-generated method stub
//		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//		executor.setCorePoolSize(100);
//		executor.setMaxPoolSize(150);
//		executor.setQueueCapacity(150);
//		executor.setThreadNamePrefix("CLMSAsyncTasks-");
//		executor.initialize();
//		return executor;
//		//return null;
//	}

//	@Override
//	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}