package lesson12_Inheritance;

public class Dog extends Animal {

    public Dog() {
        super(4);
    }

    @Override
    public void say() {
        System.out.println("Гав!");
    }
}
