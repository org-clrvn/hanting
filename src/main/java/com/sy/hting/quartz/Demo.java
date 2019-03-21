package com.sy.hting.quartz;


public class Demo {

	public static void main(String[] args) {
		/*// 1.
		JobDetail jd = JobBuilder.newJob(MyJob.class).withIdentity("job1", "g1").build();
		// 2.
		CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity("t1", "g1")
				.withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?")).build();
		//3.
		StdSchedulerFactory ssf=new StdSchedulerFactory();
		try {
			//调度器
			Scheduler s=ssf.getScheduler();
			s.scheduleJob(jd, trigger);//调度任务(追加)
			s.start();
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
