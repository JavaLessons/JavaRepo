package lesson17_TypicalInnerClasses;

/**
 * Created with IntelliJ IDEA.
 * User: frizzle
 * Date: 14.11.13
 * Time: 21:17
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {
        List list = new List();
        list.setItem("Item 1 data", "Item 1 Label", 0);

        //Экземпляер внутреннего нестатического класса нельзя создать извне класса

        //List.ListItem[] items = list.getItems();
        //items[1] = new List.ListItem("Item 2 data", "Item 2 Label", list);

        //Таким образом можно обратиться ко внутреннему статическому класса
        for (List.ListItem item: list.getItems()) {
            System.out.println(item.getLabel());
        }


    }
}
