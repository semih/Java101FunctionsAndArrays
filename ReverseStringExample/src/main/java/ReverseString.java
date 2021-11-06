package main.java;

//https://examples.javacodegeeks.com/java-reverse-string-example/
//https://javarevisited.blogspot.com/2016/03/how-to-reverse-string-in-place-in-java.html

public class ReverseString {

    public static String reverseArray(String stringArray) {

        char[] characters = stringArray.toCharArray();

        for (int i = 0; i < characters.length/2 ; i++) {
            char temp = characters[i];
            characters[i] = characters[characters.length - 1 - i];
            characters[characters.length - 1 - i] = temp;
        }

        return String.valueOf(characters);
    }
}
