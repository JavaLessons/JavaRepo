package lesson9_StaticPolymor;

/**
 * Использование дебаггера в IntelliJ IDEA.
 * 1. Брейкпоинт можно поставить кликнув на серую область слева от кода напротив той строки, где программа должна остановить своё выполнение
 * 2. Клавиши управления процессом выполнения:
 *  - F7: зайти в метод
 *  - F8: сделать шаг, не заходя в метод
 *  - F9: продолжить выполнение программы
 *  - Alt+F8: Открыть окно Evaluate Value
 */
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setAlive(true);
        cat1.setNameCat("Cat");

        Cat cat2 = new Cat();
        cat2.setAlive(true);
        cat2.setNameCat("Cat");

        Cat cat3 = new Cat();
        cat3.setAlive(true);
        cat3.setNameCat("Another Cat");

        System.out.println("cat1 and cat2 is " + cat1.equals(cat2));
        System.out.println("cat2 and cat3 is " + cat2.equals(cat3));
        System.out.println("cat3 and cat1 is " + cat3.equals(cat1));
    }
}
