package com.uttiya.calc;

import org.junit.Assert;
import org.junit.Test;

public class BasicTest {

    @Test
    public void testAdd(){

        Basic basic=new Basic();
        Assert.assertEquals(basic.add(55.3f, 28.9f),84.2f,0.01f);
        Assert.assertEquals(basic.add(19.62f, 20.12f),39.74f,0.01f);

    }

}