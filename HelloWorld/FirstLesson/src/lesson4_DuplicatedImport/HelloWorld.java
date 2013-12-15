package lesson4_DuplicatedImport;


import lesson3_UsingImport.Out.Printer;

//Эта строка приводит к ошибке, связанной с повторным использованием одноименного класса Printer
//import lesson2_MainClassWithBehaviour.Printer;

public class HelloWorld {
    public static void main (String[] args) {
        lesson2_MainClassWithBehaviour.Printer.printHelloWorld();
        lesson2_MainClassWithBehaviour.Printer pr2 = new lesson2_MainClassWithBehaviour.Printer();
        pr2.printHelloWorld2();

        Printer.printHelloWorld();
        Printer hw = new Printer();
        hw.printHelloWorld2();
    }
}
