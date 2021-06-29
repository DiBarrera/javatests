package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_string_once() {
        Assert.assertEquals("Hola Mundo Java ", StringUtil.repeat("Hola Mundo Java ", 1));
    }

    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals("Hola Mundo Hola Mundo Hola Mundo ", StringUtil.repeat("Hola Mundo ", 3));
    }

    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("Hola Mundo ", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtil.repeat("Hola Java ", -1);
    }
}