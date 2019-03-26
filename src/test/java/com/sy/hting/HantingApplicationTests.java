package com.sy.hting;

import com.sy.hting.biz.tj.UserBiz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HantingApplicationTests {

    @Autowired
    private UserBiz biz;


    @Test
    public void contextLoads() {
        System.out.println(biz.findUserById(24));
    }

}
