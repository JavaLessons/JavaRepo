package lesson24_ObjectStreams;

import java.io.Serializable;

/**
 * Created by frizzle on 05.12.13.
 */
public class TestObject2 implements Serializable {
    private String name;

    public TestObject2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
