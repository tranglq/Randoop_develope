package com.springbootexample.springtest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@SpringBootTest
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        Class<?> wildcardClass2 = obj0.getClass();
        Class<?> wildcardClass3 = obj0.getClass();
        Class<?> wildcardClass4 = obj0.getClass();
        Class<?> wildcardClass5 = obj0.getClass();
        Class<?> wildcardClass6 = obj0.getClass();
        Class<?> wildcardClass7 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        SpringtestApplication springtestApplication0 = new SpringtestApplication();
        Class<?> wildcardClass1 = springtestApplication0.getClass();
        Class<?> wildcardClass2 = springtestApplication0.getClass();
        Class<?> wildcardClass3 = springtestApplication0.getClass();
        Class<?> wildcardClass4 = springtestApplication0.getClass();
        Class<?> wildcardClass5 = springtestApplication0.getClass();
        Class<?> wildcardClass6 = springtestApplication0.getClass();
        Class<?> wildcardClass7 = springtestApplication0.getClass();
        Class<?> wildcardClass8 = springtestApplication0.getClass();
        Class<?> wildcardClass9 = springtestApplication0.getClass();
        Class<?> wildcardClass10 = springtestApplication0.getClass();
        Class<?> wildcardClass11 = springtestApplication0.getClass();
        Class<?> wildcardClass12 = springtestApplication0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}

