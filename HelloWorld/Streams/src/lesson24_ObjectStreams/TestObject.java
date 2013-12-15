package lesson24_ObjectStreams;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by frizzle on 05.12.13.
 */
public class TestObject implements Serializable {
    private String name;
    private int age;
    private Date date;
    private TestObject2 testObject2;

    public TestObject(String name, int age, Date date, TestObject2 testObject2) {
        this.name = name;
        this.age = age;
        this.date = date;
        this.testObject2 = testObject2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TestObject2 getTestObject2() {
        return testObject2;
    }

    public void setTestObject2(TestObject2 testObject2) {
        this.testObject2 = testObject2;
    }
}
