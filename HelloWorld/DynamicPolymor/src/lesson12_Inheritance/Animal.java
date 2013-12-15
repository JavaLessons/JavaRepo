package lesson12_Inheritance;

public abstract class Animal {
    //Защищенные поля и методы не доступны в приватных методах
    private int countPaw;

    //Объявление переменной в области видимости по-умолчанию.
    //Данная переменная доступна во всех классах пакета.
    //Никогда не использовать. Является дырой в безопасности.
    int myVar;

    //Объявление переменной с защищенным на уровне наследования спецификатором доступа
    //Данная переменная доступна во всех классах пакета и дочерних классах
    //Никогда не использовать для
    protected int myProtectedVar;

    int getMyVar() {
        return myVar;
    }

    //best practics использования спецификатора доступа Protected
    //Резюме: спецификатор доступа protected необходимо использовать
    //только по отношению к методам и только в дочерних классах
    protected int getMyProtectedVar() {
        return myProtectedVar;
    }

    //Конструктор c параметрами
    public Animal(int countPaw) {
        this.countPaw = countPaw;
    }


    abstract public void say();

    //Абстрактный класс содержит логику общую для всех дочерних классов. Не требует переопределения.
    public int getCountPaw() {
        return countPaw;
    }
}
