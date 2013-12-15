package lesson24_ObjectStreams;

import com.sun.corba.se.pept.encoding.InputObject;

import java.io.*;
import java.util.Date;

/**
 * Created by frizzle on 05.12.13.
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("test_lesson_24.txt");
//        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
//
//        TestObject2 testObject2 = new TestObject2("name 2");
//        outputStream.writeObject(testObject2);
//
//        TestObject testObject = new TestObject("name", 16, new Date(), testObject2);
//        outputStream.writeObject(testObject);
//        outputStream.flush();
//        outputStream.close();

        ObjectInputStream istream = new ObjectInputStream(new FileInputStream(file));

        TestObject2 readTestObject2 = (TestObject2)istream.readObject();

        TestObject readObject = (TestObject)istream.readObject();
        System.out.println(readObject.getName() + " " + readObject.getAge() + " " + readObject.getDate());
        System.out.println("testobject 2 - "+readTestObject2.getName());
        System.out.println("isEqual - " + readTestObject2.equals(readObject.getTestObject2()));
        istream.close();
    }
}
