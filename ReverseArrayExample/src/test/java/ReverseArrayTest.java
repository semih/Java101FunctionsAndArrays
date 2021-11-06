package test.java;

import main.java.ReverseArray;

import static org.junit.Assert.*;

public class ReverseArrayTest {

    @org.junit.Test
    public void reverseArray() {

        int[] array = {1,2,3,4,5};
        int[] expectedArray = {5,4,3,2,1};

        assertArrayEquals(ReverseArray.reverseArray(array), expectedArray);

    }
}