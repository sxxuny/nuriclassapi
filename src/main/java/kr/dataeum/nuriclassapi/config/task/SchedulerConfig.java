package kr.dataeum.nuriclassapi.config.task;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

@Configuration
public class SchedulerConfig implements SchedulingConfigurer {

	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
		threadPoolTaskScheduler.setPoolSize(10);
		threadPoolTaskScheduler.setThreadNamePrefix("device-scheduled-task-pool-");
		threadPoolTaskScheduler.initialize();

		taskRegistrar.setTaskScheduler(threadPoolTaskScheduler);
	}
}
