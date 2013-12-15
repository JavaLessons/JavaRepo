package lesson16_StaticInnerClasses;

/**
Занятие 6
 */
public class List {

    //Таким образом определяется внутренний статический класс

    //Использование внутренних классов с модификатором доступа отличным от private идеологически неверно
    //Так как мы предоставляем возможность обратиться к внутренней логике класса,
    //которая, исходя из назначения внутренних классов должна быть скрыта (инкапсулирована)
    public static class ListItem {
        private List parentList;
        private Object data;
        private String label;

        //Допустим нам необходимо передать ссылку на родительский объект.
        //В случае статических внутренних классов нам необходимо осуществить передачу ссылки на родительский объект вручную.
        //Что приводит к громоздкому избыточному коду
        ListItem(Object data, String label, List parentList) {
            this.data = data;
            this.label = label;
            this.parentList = parentList;
        }

        Object getData() {
            return data;
        }

        void setData(Object data) {
            this.data = data;
        }

        String getLabel() {
            return label;
        }

        void setLabel(String label) {
            this.label = label;
        }
    }

    private ListItem[] items = new ListItem[10];

    public ListItem[] getItems() {
        return items;
    }

    public void setItem(Object data, String label, int index) {
        //Статические внутренние классы используются внутри класса контейнера без каких-либо дополнительных синтаксических конструкций
        items[index] = new ListItem(data, label, this);
    }
}
