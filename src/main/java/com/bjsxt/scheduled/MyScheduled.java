package com.bjsxt.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduled {

    @Scheduled(cron="2 * * * * *")
    public   void  aa(){
        //假如这个方法是清除Redis中数据操作
        System.out.println("清除数据");
    }

}
