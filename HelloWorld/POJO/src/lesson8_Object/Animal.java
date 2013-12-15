package lesson8_Object;

/**
 * Created with IntelliJ IDEA.
 * User: frizzle
 * Date: 24.10.13
 * Time: 21:18
 * To change this template use File | Settings | File Templates.
 */
public class Animal {
    public void say () {
        System.out.println("Hi, I'm animal");
    }

    //Компилятор не обладаем о реальном типе метода, поэтому не считает такое приведение ошибкой.
    public void fakeMethod(Object object) {
        String string = (String)object;
    }


    public void goodMethod(Object object) {
        if (object instanceof String) {
            String string = (String)object;
            System.out.println(string);
        } else {
            //toString() - метод из класса Object
            System.out.println(object.toString());
        }

    }
}
