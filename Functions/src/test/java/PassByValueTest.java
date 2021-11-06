package test.java;

import main.java.PassByValue;

import static org.junit.Assert.*;

public class PassByValueTest {

    @org.junit.Test
    public void passByValue() {

        int a = 10;
        int b = 11;
        PassByValue.passByValue(a, b);

        assertEquals(a, 10);
        assertEquals(b, 11);
    }
}