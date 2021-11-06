package test.java;

import main.java.DuplicateValues;

import static org.junit.Assert.*;

public class DuplicateValuesTest {


    @org.junit.Test
    public void removeDuplicate() {

        int[] numbersWithDuplicates = {1, 5, 2, 2, 3, 4, 1};
        int[] expectedArray = {1, 0, 2, 0, 3, 4, 5};
        assertArrayEquals(DuplicateValues.removeDuplicate(numbersWithDuplicates),expectedArray);

    }
}