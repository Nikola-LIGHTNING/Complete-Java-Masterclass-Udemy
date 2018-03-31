package com.tsvetkov;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//        while(count != 6) {
//            System.out.println("Count value in while loop " + count);
//            count++;
//        }
//
//        count = 1;
//        while(true) {
//            if(count == 6) {
//                break;
//            }
//
//            System.out.println("Count value in while infinite loop " + count);
//            count++;
//        }
//
//        count = 6;
//        do {
//            System.out.println("Count value in do loop " + count);
//            count++;
//
//            if(count > 100) {
//                break;
//            }
//        } while(count != 6);

        int number = 4;
        int finishNumber = 20;
        int evenNumbers = 0;

        while(number <= finishNumber) {
            number++;
            if(!isEven(number)) {
                continue;
            }

            System.out.println("Even: " + number);

            evenNumbers++;
            if(evenNumbers >= 5) {
                break;
            }
        }
        System.out.println("Number of even numbers: " + evenNumbers);

    }

    public static boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }

}
