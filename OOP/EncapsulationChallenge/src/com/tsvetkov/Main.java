package com.tsvetkov;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(0, true);

        printer.getPagesPrinted();
        printer.print(1,true);

        printer.fillToner(120);
        printer.print(1,true);

        printer.fillToner(100);
        printer.print(3,false);

        printer.print(3,true);

        System.out.println("Pages printed: " + printer.getPagesPrinted());
    }
}
