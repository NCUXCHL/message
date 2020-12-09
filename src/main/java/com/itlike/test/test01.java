package com.itlike.test;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Random;


public class test01 {
    @Test
    public void test1(){
        Random rand = new Random();
        System.out.println(rand.nextInt(1000000000) + 1);

    }


}
