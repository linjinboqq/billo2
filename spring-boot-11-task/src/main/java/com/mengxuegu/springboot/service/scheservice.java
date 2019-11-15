package com.mengxuegu.springboot.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class scheservice {
    private  static  int count =1;

    @Scheduled(cron ="*/3 * * * * MON-FRI")
    public  void  datacount(){
        System.out.println("数据统计"+count++ +"次");
    }
}
