package com.tsvetkov.math;

public class Series {

    public static int nSum(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += i;
            if(i != n) {
                System.out.print(sum + ", ");
            } else {
                System.out.println(sum + ".");
            }
        }

        return sum;
    }

    public static int factorial(int n) {
        int product = 1;

        for(int i = 1; i <= n; i++) {
            product *= i;
            if(i != n) {
                System.out.print(product + ", ");
            } else {
                System.out.println(product + ".");
            }
        }

        return product;
    }

    public static int fibbonaci(int n) {
        int first = 0;
        int second = 1;
        for(int i = 0; i < n - 1; i++) {
            int temp = second;
            second += first;
            first = temp;
        }

        return second;
    }
}
