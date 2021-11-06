package main.java;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        scan.close();
        
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}