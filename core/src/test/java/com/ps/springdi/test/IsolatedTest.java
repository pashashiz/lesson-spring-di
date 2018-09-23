package com.ps.springdi.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {Parent.class, IsolatedTest.Config.class})
public class IsolatedTest {

    @Configuration
    public static class Config {

        @Bean
        public Child child() {
            return new Child();
        }
    }

    @Autowired
    Parent parent;

    @Test
    public void test() {
        assertNotNull(parent);
        assertNotNull(parent.getChild());
    }
}