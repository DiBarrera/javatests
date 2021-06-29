package com.platzi.javatests.util;

public class StringUtilTest {

    public static void main(String[] args) {

        String result = StringUtil.repeat("Hola Mundo ", 3);

        assertEquals(result, "Hola Mundo Hola Mundo Hola Mundo ");

        // System.out.println(result);
        // if (result.equals("Hola Mundo Hola Mundo Hola Mundo ")) {
        //      System.out.println("Ok");
        // }
        // if (!result.equals("Hola Mundo Hola Mundo Hola Mundo ")) {
        //      System.out.println("ERROR");
        // }

        String result1 = StringUtil.repeat("Hola Mundo Java ", 1);

        assertEquals(result1, "Hola Mundo Java ");

        // if (!result1.equals("Hola Mundo Java ")) {
        //     throw new RuntimeException("ERROR");
        // }

        // System.out.println(result1);
        // if (result1.equals("Hola Mundo Java ")) {
        //      System.out.println("Ok Java");
        // }
        // if (!result1.equals("Hola Mundo Java ")) {
        //      System.out.println("ERROR JAVA");
        // }
    }

    private static void assertEquals(String actual, String expected) {

        if (!actual.equals(expected)) {
            throw new RuntimeException(actual + " is not equal to expected " + expected);
        }
    }
}