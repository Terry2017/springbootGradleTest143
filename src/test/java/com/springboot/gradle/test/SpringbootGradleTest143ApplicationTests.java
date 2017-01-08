package com.springboot.gradle.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootGradleTest143ApplicationTests {

	@Test
	public void contextLoads() {
        System.out.println(" *MyLog* : SpringBoot 1.4.3.RELEASE Version for Test.");
        System.out.println(" *MyLog* : RunAs Gradle Test.");
        assertEquals("TestAssert!", 0, 0);
	}

}
