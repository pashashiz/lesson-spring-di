package com.ps.springdi.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class FullScanTest {

    @Autowired
    Parent parent;

    @Test
    public void test() {
        assertNotNull(parent);
        assertNotNull(parent.getChild());
    }
}