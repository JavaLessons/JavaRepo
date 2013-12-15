package lesson12_Inheritance;

/**
 * Created with IntelliJ IDEA.
 * User: frizzle
 * Date: 02.11.13
 * Time: 22:09
 * To change this template use File | Settings | File Templates.
 */
public class InheritanceMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        Animal[] animals = new Animal[]{cat, dog};
        SayPrinter.say(animals);
    }
}
