package main.java;

// https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        int count = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        for(int i=0; i<n; i++) {
            int sum = 0;
            for (int j=i; j<n; j++) {
                sum = a[j]+sum;
                if (sum<0) count++;
            }
        }

        System.out.println(count);
    }
}
