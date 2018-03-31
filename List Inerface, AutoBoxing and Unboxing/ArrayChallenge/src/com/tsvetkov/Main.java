package com.tsvetkov;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = getIntegers(5);
        printArray(myIntArray);

        int[] newIntArray = sortIntegers(myIntArray);
        printArray(newIntArray);

        printArray(myIntArray);
    }

    public static int[] sortIntegers(int[] array) {

//        int[] sortedArray = new int[array.length];
//        for(int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        while(flag) {
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]) {
                    sortedArray[i] += sortedArray[i + 1];
                    sortedArray[i + 1] = sortedArray[i] - sortedArray[i + 1];
                    sortedArray[i] -= sortedArray[i + 1];
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " values for your integer array: \r");
        int[] intArray = new int[number];

        for(int i = 0; i < intArray.length; i++) {
            System.out.print("Enter element " + i + ", value: ");
            intArray[i] = scanner.nextInt();
        }

        return intArray;
    }

    public static void printArray(int[] array) {
        System.out.println();
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " has a value of " + array[i]);
        }
    }
}
