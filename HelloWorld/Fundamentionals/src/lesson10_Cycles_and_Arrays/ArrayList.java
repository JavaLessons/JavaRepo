package lesson10_Cycles_and_Arrays;

public class ArrayList {
    //baseAddress + sizeof(int)
    private int simpleVar;

    //baseAddress + sizeof(int) * index
    //все элементы массива в памяти хранятся непрерывно.
    //а память для массива должна выделяться разом.
    //Квадратные скобки после названия типа указывают компилятору, что необходимо использовать массив
    private int[] data;

    //ЗАдание константы
    //Это объект в Java, значение которого не может быть изменено
    //Для обозначения констант используется слово final
    //Константа создается в единственном экземпляре для всех объектов
    public static final int DEFAULT_CAPACITY = 10;

    /**
     * Метод копирования массива в другой массив
     * @param source исходный массив
     * @param destination финальный массив
     */
    private void copy (int[] source, int[] destination) {
        if (source.length > destination.length) {
            throw new ArrayIndexOutOfBoundsException(source.length);
        }

        //Пример цикла со счётчиком
        for(int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
    }

    /**
     * Сместить данные на заданное количество шагов от начала массива к его концу
     * @param shiftNumber число шагов смещения
     */
    private void shiftForward(int shiftNumber) {
        for (int i = getCapacity() - 1; i >= shiftNumber; i--) {
            setItem(i, getItem(i - shiftNumber));
        }

        for (int i = 0; i < shiftNumber; i ++) {
            setItem(i, 0);
        }
    }

    /**
     * Увеличить размер массива
     * @param newCapacity новый размер массива
     */
    private void increaseCapacity(int newCapacity) {
        if (newCapacity < data.length) {
            return;
        }

        int[] newData = new int[newCapacity];
        copy(data, newData);
        data = newData;
    }


    /**
     * конструктор по-умолчанию
     */
    public ArrayList() {
        data = new int[DEFAULT_CAPACITY];
    }

    /**
     * Конструктор
     * @param capacity размер массива на старте
     */
    public ArrayList(int capacity) {
        data = new int[capacity];
    }

    /**
     * Получить текущий размер списка
     * @return возвращает размер списка
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * Установка значение списка по заданному индексу
     * @param index индекс устанавливаемого значения
     * @param value устанавливаемое значение
     */
    public void setItem(int index, int value) {
        if (index >= data.length) {
            this.increaseCapacity(index + 1);
        }

        //Установка значение осуществляется при помощи оператора [], где в качестве параметра указан индекс элемента.
        data[index] = value;
    }

    /**
     * Добавить число в начало массива
     * @param value добавляемое число
     */
    public void addItem(int value) {
        increaseCapacity(getCapacity() + 1);
        shiftForward(1);
        setItem(0, value);
    }

    /**
     * Возвращает значение по индексу
     * @param index
     * @return
     */
    public int getItem(int index) {
        if (index > data.length) {

        }
        return data[index];
    }

    /**
     * Удаление значение по заданной позиции
     * @param index позиция удаляемого значения
     */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= getCapacity()) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        int[] newData = new int[getCapacity() - 1];

        int maxIndex = getCapacity() - 1;
        for (int i = 0; i < maxIndex; i++) {
            if (i < index) {
                newData[i] = getItem(i);
            } else {
                newData[i] = getItem(i + 1);
            }
        }

        data = newData;
    }
}
