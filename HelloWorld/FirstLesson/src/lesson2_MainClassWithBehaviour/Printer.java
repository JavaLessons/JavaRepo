package lesson2_MainClassWithBehaviour;

/**
 * Created with IntelliJ IDEA.
 * User: frizzle
 * Date: 21.10.13
 * Time: 21:46
 * To change this template use File | Settings | File Templates.
 */
public class Printer {

    public static void printHelloWorld() {
        System.out.println(Printer.class.getName() + " Hello world1 from lesson 2!!!");
    }

    /**
     * Вызов нестатического метода.
     */
    public void printHelloWorld2() {
        System.out.println(Printer.class.getName() + " Hello world2 from lesson 2!!!");
    }
}
