package lesson1_MonoliteMainClass;

public class HelloWorld {
    public static void main (String[] args) {
        printHelloWorld();

        HelloWorld hw = new HelloWorld();
        hw.printHelloWorld2();
    }

    // Вызов статического метода при помощи однострочного комментария
    public static void printHelloWorld() {
        System.out.println(HelloWorld.class.getName() + " Hello world1!!!");
    }

    /**
     * Вызов нестатического метода.
     */
    public void printHelloWorld2() {
        System.out.println(HelloWorld.class.getName() + " Hello world2!!!");
    }
}
