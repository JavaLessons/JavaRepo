package lesson12_Inheritance;

/**
 * Created with IntelliJ IDEA.
 * User: frizzle
 * Date: 02.11.13
 * Time: 22:41
 * To change this template use File | Settings | File Templates.
 */
public class SayPrinter {
    static public void say(Animal[] animals) {
        for(Animal animal:animals) {
            animal.say();
        }
    }
}
