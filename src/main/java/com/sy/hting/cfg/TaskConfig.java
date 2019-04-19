package com.sy.hting.cfg;

import com.sy.hting.biz.xmh.MerchantEnterAndServiceBiz;
import com.sy.hting.util.redis.RedisBaseOps;
import com.sy.hting.vo.xmh.ServicesVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;


@Configuration
@EnableScheduling
public class TaskConfig {
    @Autowired
    private RedisBaseOps rbo;
    @Autowired
    private MerchantEnterAndServiceBiz merchantEnterAndServiceBiz;

	// 实现【定时从mysql中查询所有消息信息，然后循环插入redis（Hashes）中，完成读写分离同步】
	@Scheduled(cron = "01 00 00 * * ?")
	public void doSynRedis() {
        List<ServicesVO> list=merchantEnterAndServiceBiz.queryServices();
        for(ServicesVO se:list){
            rbo.getRedisTemplate().opsForSet().add("set:service",se);
        }
	}

}
