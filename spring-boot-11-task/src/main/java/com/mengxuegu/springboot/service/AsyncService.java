package com.mengxuegu.springboot.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Async //标识此方法会异步处理   在cotroller 会直接先返回
public class AsyncService {
    public void  batadd(){
        try {
            Thread.sleep(3*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("批量新增数据");
    }
}
