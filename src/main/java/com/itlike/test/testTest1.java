package com.itlike.test;

import com.itlike.service.TeacherService;
import com.itlike.service.impl.TeacherServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class testTest1 {
    private TeacherService teacherService1;
    @Test
    public void test0(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        teacherService1 = ac.getBean(TeacherService.class);
        System.out.println(teacherService1.toString());
        System.out.println(teacherService1.findFields1("teacher").toString());
    }
}