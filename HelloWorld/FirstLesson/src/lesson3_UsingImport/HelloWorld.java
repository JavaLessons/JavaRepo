package lesson3_UsingImport;

import lesson3_UsingImport.Out.Printer;

public class HelloWorld {
    public static void main (String[] args) {
        Printer.printHelloWorld();

        Printer hw = new Printer();
        hw.printHelloWorld2();
    }
}
