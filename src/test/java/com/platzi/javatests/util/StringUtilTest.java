package com.platzi.javatests.util;

public class StringUtilTest {

    public static void main(String[] args) {

        String result = StringUtil.repeat("Hola Mundo ", 3);
        // System.out.println(result);
        if (result.equals("Hola Mundo Hola Mundo Hola Mundo ")) {
            System.out.println("Ok");
        }
        if (!result.equals("Hola Mundo Hola Mundo Hola Mundo ")) {
            System.out.println("ERROR");
        }

        String result1 = StringUtil.repeat("Hola Mundo Java ", 1);
        // System.out.println(result1);
        if (result1.equals("Hola Mundo Java ")) {
            System.out.println("Ok Java");
        }
        if (!result1.equals("Hola Mundo Java ")) {
            System.out.println("ERROR");
        }
    }
}