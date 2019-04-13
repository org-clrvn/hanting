package com.sy.hting;

import com.sy.hting.biz.cy.DriveBiz;
import com.sy.hting.biz.cy.PersonalBiz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HantingApplicationTests {

    @Autowired
    private PersonalBiz biz;


    @Test
    public void contextLoads() {
      // biz.orderPay(24,3500,"20181031162123771312");
        biz.queryMyCollectByUid(24,1,2);
    }

}
