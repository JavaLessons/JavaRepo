package lesson17_TypicalInnerClasses;

/**
Занятие 6
 */
public class List {

    //Таким образом определяется внутренний нестатический класс

    //Использование внутренних классов с модификатором доступа отличным от private идеологически неверно
    //Так как мы предоставляем возможность обратиться к внутренней логике класса,
    //которая, исходя из назначения внутренних классов должна быть скрыта (инкапсулирована)
    public class ListItem {
        private Object data;
        private String label;

        ListItem(Object data, String label) {
            this.data = data;
            this.label = label;

            //Во внутр. нестатич. классе ссылка на объект контейнер передается неявно
            //Доступ к родительскому объекту можно получить с использованием последующего синтаксиса.
            System.out.println(List.this.toString());
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
        items[index] = new ListItem(data, label);
    }
}
