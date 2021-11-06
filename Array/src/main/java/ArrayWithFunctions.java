package main.java;

public class ArrayWithFunctions {

    public static void main(String[] args) {
        String[] arr = new String[]{};
        System.out.println("Test edilmeye başlanıyor..");
        throwExceptionIfEmptyArray(arr);
        System.out.println("Testim başarılı");
    }

    public static void throwExceptionIfEmptyArray(String[] stringArray) {
        if (stringArray.length == 0) {
            throw new IllegalStateException("Array is empty");
        }
    }

    public static boolean hasGivenValueInArray(String[] array, String value) {
        throwExceptionIfEmptyArray(array);

        for (String arrayItem : array) {
            if (arrayItem.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static char[] getCharacters(String givenValue) {
        if(givenValue == null && givenValue.isEmpty()) {
            return new char[]{};
        }
        return givenValue.toCharArray();
    }




}
