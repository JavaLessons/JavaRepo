package lesson10_Cycles_and_Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: frizzle
 * Date: 28.10.13
 * Time: 21:56
 * To change this template use File | Settings | File Templates.
 */
public class LinkedListElem {
    private  LinkedListElem next;
    private  LinkedListElem prev;

    private int value;

    public LinkedListElem(LinkedListElem next, LinkedListElem prev, int value) {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedListElem getNext() {
        return next;
    }

    public void setNext(LinkedListElem next) {
        this.next = next;
    }

    public LinkedListElem getPrev() {
        return prev;
    }

    public void setPrev(LinkedListElem prev) {
        this.prev = prev;
    }
}
