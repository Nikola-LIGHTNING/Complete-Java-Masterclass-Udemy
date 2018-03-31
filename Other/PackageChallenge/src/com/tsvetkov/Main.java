package com.tsvetkov;

import com.tsvetkov.math.Series;

public class Main {

    public static void main(String[] args) {
        Series.nSum(10);
        Series.factorial(10);
        System.out.println("n-th element in a fibbonaci row: " + Series.fibbonaci(10));
    }
}
