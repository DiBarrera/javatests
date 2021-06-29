package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeat() {

        Assert.assertEquals("Hola Mundo Hola Mundo Hola Mundo ", StringUtil.repeat("Hola Mundo ", 3));
        Assert.assertEquals("Hola Mundo Java ", StringUtil.repeat("Hola Mundo Java ", 1));
    }
/*
    private static void assertEquals(String actual, String expected) {

        if (!actual.equals(expected)) {
            throw new RuntimeException(actual + " is not equal to expected " + expected);
        }
    }
 */
}