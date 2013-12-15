package lesson13_staticPolymor;

/**
 * Created with IntelliJ IDEA.
 * User: frizzle
 * Date: 08.11.13
 * Time: 21:46
 * To change this template use File | Settings | File Templates.
 */
public class StaticPolymorMain {
    public static void main(String[] args) {
        Tester tester = new Tester();
        Cat cat = new Cat();
        Dog dog = new Dog();

        tester.doSomething(cat);
        tester.doSomething(dog);

        Animal animals[] = new Animal[]{cat, dog};
        for (Animal animal:animals) {
            tester.doSomething(animal);
        }
    }
}
