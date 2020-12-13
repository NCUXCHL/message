package com.itlike.test;

import com.itlike.domain.Notify;
import com.itlike.domain.User;
import com.itlike.service.pullAnnounce;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

class testTest1 {
    private pullAnnounce pullannounce;
    @Test
    public void test0(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        pullannounce = ac.getBean(pullAnnounce.class);
        List<Notify> notifies =pullannounce.PullAnnounce();
        for (Iterator<Notify> iterator = notifies.iterator(); iterator.hasNext(); ) {
            Notify next =  iterator.next();
            System.out.println(next.getSender());

        }

    }
}