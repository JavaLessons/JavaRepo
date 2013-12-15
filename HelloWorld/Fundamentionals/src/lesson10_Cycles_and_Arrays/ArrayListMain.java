package lesson10_Cycles_and_Arrays;

/**
 * Homework
 * Дописать недостающие методы для Array addItem
 * Для списка setItem
 * Удаление элемента для обоих
 * Сделать LinkedList двусвязным
 * Сделать несколько функций main для демонстрации новых методов
 */

import java.util.Date;

public class ArrayListMain {
    public static void main(String[] args) {
        testArrayListAddItem();
        //testBasic();
        //testLinkedList();
    }

    static void testLinkedList() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("Linked list before addItem: " + list.getOutputString());

        list.addAtIndex(6,100);
        System.out.println("Linked list after addItem: " + list.getOutputString());

        list.deleteElement();
        System.out.println("Linked list after deleteElement: " + list.getOutputString());


        list.deleteElementAtIndex(5);
        System.out.println("Linked list after deleteElementAtIndex: " + list.getOutputString());

        list.setItem(6, 22);
        System.out.println("Linked list after setValue: " + list.getOutputString());
    }

    static void testArrayListAddItem() {
        ArrayList array = new ArrayList(1);
        array.setItem(0,2);
//        array.setItem(1,3);
//        array.setItem(2,4);
//        array.setItem(3,5);
        System.out.println("Array before adding item:");
        for (int i = 0; i < array.getCapacity(); i++) {
            System.out.println(array.getItem(i));
        }

        array.addItem(1);
        System.out.println("Array after adding item:");
        for (int i = 0; i < array.getCapacity(); i++) {
            System.out.println(array.getItem(i));
        }

        array.deleteAtIndex(1);
        System.out.println("Array after deleting item:");
        for (int i = 0; i < array.getCapacity(); i++) {
            System.out.println(array.getItem(i));
        }
    }

    static void testBasic() {
        ArrayList defaultCapacityList = new ArrayList();
        ArrayList customCapacityList = new ArrayList(200);

        System.out.println("Default list capacity " + defaultCapacityList.getCapacity());
        System.out.println("Custom list capacity " + customCapacityList.getCapacity());

        defaultCapacityList.setItem(0, 200);
        customCapacityList.setItem(201, 1241);

        System.out.println("Default list item 0 is " + customCapacityList.getItem(201));

        Date startDate = new Date();

        int i = 1;

        while (i < 20000) {
            defaultCapacityList.setItem(i, i);
            i++;
        }

        Date endDate = new Date();
        long time = endDate.getTime() - startDate.getTime();
        System.out.println("ArrayList set with capacity increase total time is " + time);

        ArrayList bigCapacityList = new ArrayList(20000);
        startDate = new Date();
        i = 1;
        while (i < 20000) {
            bigCapacityList.getItem(i);
            i++;
        }
        endDate = new Date();

        time = endDate.getTime() - startDate.getTime();
        System.out.println("ArrayList simple get total time is " + time);

        LinkedList newList = new LinkedList();

        startDate = new Date();
        i = 0;
        while (i < 20000) {
            newList.add(i);
            i++;
        }
        endDate = new Date();

        time = endDate.getTime() - startDate.getTime();
        System.out.println("LinkedList increase total time is " + time);


        System.out.println("capacity - " + newList.getCapacity());
        startDate = new Date();
        i = 0;
        while (i < 20000) {
            newList.getItem(i);
            i++;
        }
        endDate = new Date();

        time = endDate.getTime() - startDate.getTime();
        System.out.println("LinkedList get total time is " + time);
    }


}
