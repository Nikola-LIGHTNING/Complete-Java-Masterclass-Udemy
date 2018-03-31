package com.tsvetkov;

public class Main {

    public static void main(String[] args) {
        System.out.println("10000 at 2% interest " + calculateInterest(10000, 2));
        System.out.println("10000 at 3% interest " + calculateInterest(10000, 3));
        System.out.println("10000 at 4% interest " + calculateInterest(10000, 4));
        System.out.println("10000 at 5% interest " + calculateInterest(10000, 5));

        for(int i=2; i<9; i++) {
            System.out.println("10000 at " + i + "% interest = "
                    + String.format("%.2f", calculateInterest(10000, i)));
        }

        System.out.println("**********************");

        for(int i=8; i>=2; i--) {
            System.out.println("10000 at " + i + "% interest = "
                    + String.format("%.2f", calculateInterest(10000, i)));
        }

        System.out.println("**********************");

        int primeCounter = 0;
        for(int i = 150; i < 200; i++) {
            if(isPrime(i)) {
                primeCounter++;
                System.out.println("Prime: " + i);
            }

            if(primeCounter == 10) {
                System.out.println("Exiting for loop");
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int number) {
        if(number == 1) {
            return false;
        }

        for(int i=2; i <= (int) Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
