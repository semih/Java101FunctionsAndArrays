package test.java;

import main.java.ArrayWithFunctions;
import org.junit.Test;


import static org.junit.Assert.*;

public class ArrayWithFunctionsTest {

    String[] daysOfWeek = {"PAZARTESİ", "SALI", "ÇARŞAMBA", "PERŞEMBE", "CUMA", "CUMARTESİ", "PAZAR"};

    @org.junit.Test
    public void throwExceptionIfEmptyArray() {
        String[] emptyArray = new String[]{};
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            ArrayWithFunctions.throwExceptionIfEmptyArray(emptyArray);
        });

        String exceptedMessage = "Array is empty";
        assertTrue(exception.getMessage().contains(exceptedMessage));
    }


    @org.junit.Test
    public void hasGivenValueInArray() {
        String[] stringArray = new String[] {"java", "c#", "python"};
        assertTrue(ArrayWithFunctions.hasGivenValueInArray(stringArray, "c++"));
    }

    @org.junit.Test
    public void getCharacters() {
        char[] characters = ArrayWithFunctions.getCharacters(daysOfWeek[0]);
        //assertEquals(String.valueOf(characters), "PAZARTESİ");
        assertArrayEquals(characters, "PAZARTESİ".toCharArray());
    }
}