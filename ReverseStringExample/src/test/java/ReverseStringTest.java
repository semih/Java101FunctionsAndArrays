package test.java;

import main.java.ReverseString;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @org.junit.Test
    public void reverseArray() {

        String str = "String array";
        assertEquals(ReverseString.reverseArray(str),"yarra gnirtS");
    }
}