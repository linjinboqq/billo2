package com.mengxuegu.springboot02config02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02Config02ApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println(System.getProperty("uer.dir"));
    }

}
