package com.platzi.javatests.util;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeatStringMultipleTimes (){

        Assert.assertEquals("holaholahola",StringUtil.repeat("hola", 3));
    }
    @Test
    public void repeatStringOnce (){

       Assert.assertEquals("holahola",StringUtil.repeat("hola", 2));
    }
    @Test
    public void repeatStringZeroTimes (){

        Assert.assertEquals("",StringUtil.repeat("hola", 0));
    }
    @Test(expected = IllegalArgumentException.class)
    public void repeatStringNegativeTimes (){

        StringUtil.repeat("hola", -1);
    }

}