package com.springbootexample.springtest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(Suite.class)
@Suite.SuiteClasses({ RegressionTest0.class })
@SpringBootTest
public class RegressionTest {
}

