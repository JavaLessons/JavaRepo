/**
 *
 */
package lesson18_AnonymousClasses;

public class Main {

    private String testVar = null;
    private String testVar2 = null;

    public static void main(String[] args) {
        Main main = new Main();
        main.testVar = "testVar";

        Animalable animalable = main.createAnonymousAnimal("Meow");
        animalable.say();

    }


    private Animalable createAnonymousAnimal (final String voice) {
        String innerVoice = "Гав";

        //Анонимный класс - это класс, который используется в том случае, если реализацию некоторого интерфейса (абстрактного класса)
        //необходимо создавать только в одном единственном методе. В этом случае, это механизм является выразительным инструментом разработчика
        Animalable animalable = new Animalable() {
            @Override
            public void say() {
                String testVar2 = "testVar2";

                //Из реализации метода внутреннего класса нельзя получить доступ к локальным переменным или входным параметрам, если они не помечены модификатором final
                System.out.println(voice);

                //Если метод, в котором объявляется реализация анонимного класса является не статическим, то можно использовать
                System.out.println(testVar);

                //В аномнимных классах, как и в внутренних классах неявно передаётся ссылка на класс контейнер.
                //Синтаксис анологичен синтаксису используемому во внутренних классах
                System.out.println(Main.this.testVar2);
            }
        };

        return animalable;
    }
}
