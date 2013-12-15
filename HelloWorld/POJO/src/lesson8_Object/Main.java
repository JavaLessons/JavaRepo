package lesson8_Object;

/**
 * Created with IntelliJ IDEA.
 * User: frizzle
 * Date: 24.10.13
 * Time: 21:19
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    // Hotkey: psvm + Tab
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.say();
        //Операция приведения к базовому или иному типу
        Object objectAnimal = (Object)animal;

        //Вызов этого метода порождает ошибку приведения типов во время выполнения программы (Runtime Exception)
        //animal.fakeMethod(animal);

        animal.goodMethod(animal);
        animal.goodMethod("test");

    }
}
