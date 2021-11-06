package main.java;

import java.util.Arrays;

public class DuplicateValues {


    public static int[] removeDuplicate(int[] numbersWithDuplicates) {
        Arrays.sort(numbersWithDuplicates); // 1, 1, 2, 2, 3, 4, 5
        int length = numbersWithDuplicates.length;

        int previous = numbersWithDuplicates[0];
        int previousIndex = 0;

        for (int i = previousIndex+1; i < length; i++) {
            int current = numbersWithDuplicates[i];

            if(previous == current) {
                numbersWithDuplicates[i] = 0;
            }

            previousIndex++;
            previous = current;
        }

        return numbersWithDuplicates;

    }

}

