package main.java;

public class ReverseArray {

    public static int[] reverseArray (int[] reversedArray) {

        for (int i = 0; i < reversedArray.length/2; i++) {
            int temp = reversedArray[i];
            reversedArray[i] = reversedArray[reversedArray.length-1-i];
            reversedArray[reversedArray.length-1-i] = temp;
        }

        return  reversedArray;
    }

}
