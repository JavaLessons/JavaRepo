package lesson9_StaticPolymor;


//Это POJO (Plain Old Java Object)
//Регламент по построению POJO объектов
// 1 - все переменные члена классе private
// 2 - первое слово в названии переменной пишется с маленькой буквы, каждое следующее с большой
// 3 - для каждой переменной должен быть объявлен акцептор доступа и акцептор модификации (private или public определяется бизнес потребностью)
// 4 - акцепторы формируются, как префиксы get и set перед именами методов + <имя переменной> с большой буквы
// 5 - при использовании типа данных boolean (логический тип) префикс get надо заменить на is
public class Cat {
    private String nameCat;
    private boolean alive;

    //Акцептор модификации (setter)
    public void setNameCat(String nameCat) {
        System.out.println("setNameCat param = " + nameCat);
        this.nameCat = nameCat;
        //nameCat = nameCat; - Ошибка
    }
    //Акцептор доступа (getter)
    public String getNameCat() {
        System.out.println("getNameCat current value = " + nameCat);
        return nameCat;
    }

    //HotKey для быстрого создания акцепторов ALT+Insert -> getter and setter
    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    //HotKey для переопределения методов ALT+Insert -> override methods

    //@override - Это анотация, которая говорит о том, что метод переопределён. Изменено поведение данного метода из базового класса
    //Возможность изменять поведения родительских методов называется Статическим Полиморфизмом
    //(Override methods, переопределение метода)
    //Сигнатура метода - это его шапка (пример:   public boolean equals(Object obj)) (Method Signature)
    @Override
    public boolean equals(Object obj) {
        if ( !(obj instanceof Cat) ) {
            return false;
        }

        Cat objCat = (Cat)obj;
        //&& - логическое "И"
        //вариант неудобен с точки зрения отладки
//        if ( (objCat.isAlive() == this.isAlive()) && (objCat.getNameCat().equals(this.getNameCat())) ) {
//            return true;
//        }

        // Вариант существенно более удобный с точки зрения отладки, так так причина невыполнения или выполнения того или иного условия только одна
        if ( objCat.isAlive() != this.isAlive()) {
            return false;
        }

        if ( !(objCat.getNameCat().equals(this.getNameCat())) ) {
            return false;
        }

        return true;
    }
}
