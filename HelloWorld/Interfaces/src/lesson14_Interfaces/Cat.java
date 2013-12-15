package lesson14_Interfaces;

/**
 * Created with IntelliJ IDEA.
 * User: frizzle
 * Date: 08.11.13
 * Time: 22:09
 * To change this template use File | Settings | File Templates.
 */
public class Cat implements Printable, Sayable {

    @Override
    public void print() {
        System.out.println("Cat");
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }
}
