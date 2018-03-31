package com.tsvetkov;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if(value == 1) {
//            System.out.println("Value is 1");
//        } else if(value == 2) {
//            System.out.println("Value is 2");
//        } else {
//            System.out.println("Value is unknown");
//        }

        int switchValue = 5;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Value is 3, 4 or 5");
                System.out.println("Actually, it was " + switchValue);
                break;

            default:
                System.out.println("Value is unknown");
                break;
        }

        char message = 'F';

        switch (message) {
            case 'A':
                System.out.println("The message is A");
                break;
            case 'B':
                System.out.println("The message is B");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("The message is " + message);
                break;

            default:
                System.out.println("Could not find A, B, C, D and E");
                break;
        }

        String month = "july";
        switch(month.toUpperCase()) {
            case "MARCH":
                System.out.println("March");
                break;
            case "JULY":
                System.out.println("July, the birthmonth of Nikola");
                break;

            default:
                System.out.println("I won't tell you a month");
                break;
        }
    }
}
