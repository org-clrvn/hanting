package com.sy.hting;

import com.sy.hting.biz.cy.BusinessBiz;
import com.sy.hting.biz.cy.DriveBiz;
import com.sy.hting.biz.cy.PersonalBiz;
import com.sy.hting.vo.cy.RefundVo;
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
    private BusinessBiz biz;

    @Test
    public void contextLoads() {
        biz.queryBusinessOrder("20190417101238087799",2,24,1,8);
    }

}
