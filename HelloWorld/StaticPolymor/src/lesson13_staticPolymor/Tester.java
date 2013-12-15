package lesson13_staticPolymor;

/**
 * Created with IntelliJ IDEA.
 * User: frizzle
 * Date: 08.11.13
 * Time: 21:43
 * To change this template use File | Settings | File Templates.
 */
public class Tester {

    //Общий подход: надо выделить остовной метод и реализовать основную логику в нём.
    //Статические полиморфы будут перевызывать этот метод, преобразуя свои параметры к параметрам его сигнатуры
    public byte sum(byte x, byte y) {
        return (byte)sum((int)x, (int)y);
    }

    public int sum(int x, int y) {
        return x + y;
    }

    //В приведённых ниже методах компилятор не всегда сможет корректно выбрать статического полиморфа.
    //Потому что в качестве идентефикационного параметра испльзуются классы, находящиеся в отношении родитель-потомок.
    //Вывод: никогда не использовать статических полиморфов при таком подходе.
    public void doSomething(Cat cat) {
        System.out.println("Cat method");
    }

    public void doSomething(Dog dog) {
        System.out.println("Dog method");
    }


    public void doSomething(Animal animal) {
        System.out.println("Animal method");
    }
        //Возвращаемое значение не используется как индентификатор метода при статическом полиморфизме
//    public long sum(int x, int y) {
//        return (long)(x + y);
//    }
}
