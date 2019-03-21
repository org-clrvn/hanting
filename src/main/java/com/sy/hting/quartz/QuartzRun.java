package com.sy.hting.quartz;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import com.sy.hting.quartz.job.MyJob;

public class QuartzRun {

	public static void main(String[] args) throws Exception {
		// 1.配置任务规则
		// 任务明细
//		JobDetail jd = JobBuilder.newJob(MyJob.class).withIdentity("j1", "g1").build();
//		// 触发器
//		Trigger trigger = TriggerBuilder.newTrigger().withIdentity("j1", "g1")
//				.withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?")).build();
		//2.启用调度
		StdSchedulerFactory ssf=new StdSchedulerFactory();
		Scheduler s=ssf.getScheduler();
		//追加任务
		//s.scheduleJob(jd, trigger);
		//暂停
		s.pauseJob(JobKey.jobKey("j1", "g1"));
		//移除
		s.deleteJob(JobKey.jobKey("j1", "g1"));
		//启动
		s.start();
	}

}
