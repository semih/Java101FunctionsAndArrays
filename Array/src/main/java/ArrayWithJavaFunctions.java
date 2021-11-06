package main.java;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayWithJavaFunctions {

    public static void main(String[] args) {
        char[] a1= {'s','o','l','v','i','a'};
        char[] a2 = {'a','b','c','d','e','f'};
        char[] b2= {'s','o','l','v','i','a'};

        System.arraycopy(a1, 2, a2, 3, 3);
        System.out.println(Arrays.toString(a2));

        char[] b1 = Arrays.copyOf(a1, 7);
        System.out.println(b1[6]);

        String[] numbers = new String[] { "1", "2", "11" };
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int start = Integer.parseInt(o1);
                int end = Integer.parseInt(o2);

                return Integer.compare(start, end);
            }
        });

        System.out.println(Arrays.toString(numbers));
        System.out.println("Array equality :" + Arrays.equals(a1, b2));

    }
}
