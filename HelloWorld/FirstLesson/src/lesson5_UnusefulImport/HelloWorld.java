package lesson5_UnusefulImport;

//Одна из функций Import'а - это короткая форма записи при обращении к имени класса
//Недостаток Import'a: может ссылаться на неиспльзуемые классы
//import lesson3_UsingImport.Out.Printer;

//Эта строка приводит к ошибке, связанной с повторным использованием одноименного класса Printer
//import lesson2_MainClassWithBehaviour.Printer;

public class HelloWorld {
    public static void main (String[] args) {
        lesson2_MainClassWithBehaviour.Printer.printHelloWorld();
        lesson2_MainClassWithBehaviour.Printer pr2 = new lesson2_MainClassWithBehaviour.Printer();
        pr2.printHelloWorld2();

        lesson3_UsingImport.Out.Printer.printHelloWorld();
        lesson3_UsingImport.Out.Printer hw = new lesson3_UsingImport.Out.Printer();
        hw.printHelloWorld2();
    }
}
