package lesson13_staticPolymor;

public class Cat extends Animal {

    //Инициализация параметров базового класса осуществляется через конструктор дочернего
    public Cat() {
        //Вызов конструктора базового класса - должен всегда идти первым
        super(4);
    }

    @Override
    public void say() {
        System.out.println("Мяу!");
    }
}
