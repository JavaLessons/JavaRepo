package lesson10_Cycles_and_Arrays;


public class LinkedList {
    private LinkedListElem head = null;
    private LinkedListElem tail = null;
    private int capacity;

    /**
     * Получить текущий размер списка
     * @return текущий размер списка
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Получить значение элемента по индексу
     * @param index индекс элемента
     * @return значение элемента
     */
    public int getItem(int index) {
        if (index  >= capacity) {
            throw  new ArrayIndexOutOfBoundsException(index);
        }

        LinkedListElem temp = getElementAtIndex(index);

        return temp.getValue();
    }

    /**
     * Добавить значение в начало списка
     * @param value добавляемое значение
     */
    public void add(int value) {
        LinkedListElem newElem = new LinkedListElem(head, null, value);

        if (head != null) {
            head.setPrev(newElem);
        }

        if (tail == null) {
            tail = newElem;
        }

        head = newElem;
        capacity++;
    }

    /**
     * Добавить значение по индексу
     * @param index позиция добавляемого значения
     * @param value добавляемое значение
     */
    public void addAtIndex(int index, int value) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        if (index == 0) {
            this.add(value);
            return;
        }

        if (index  >= capacity) {
            int maxIndex = index - capacity + 1;
            for (int i = 0; i < maxIndex; i++) {
                int newValue = (capacity == index) ? value : 0;
                LinkedListElem newElement = new LinkedListElem(null, tail, newValue);
                tail.setNext(newElement);
                tail = newElement;
            }
        } else {
            LinkedListElem element = getElementAtIndex(index);
            LinkedListElem newElement = new LinkedListElem(element, element.getPrev(), value);

            if (element.getPrev() != null) {
                element.getPrev().setNext(newElement);
            }
            element.setPrev(newElement);

            if (head.equals(element)) {
                head = newElement;
            }
        }

        capacity++;
    }

    /**
     * Удаление первого элемента
     */
    public void deleteElement() {
        deleteElementAtIndex(0);
    }

    /**
     * Удаление элемента по заданной позиции
     * @param index позиция удаляемого элемента
     */
    public void deleteElementAtIndex(int index) {
        if (index < 0 || index >= capacity) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        LinkedListElem element = getElementAtIndex(index);
        LinkedListElem prevElem = element.getPrev();
        LinkedListElem nextElem = element.getNext();

        if (prevElem != null) {
            prevElem.setNext(nextElem);
        }

        if (nextElem != null) {
            nextElem.setPrev(prevElem);
        }

        if (element.equals(head)) {
            head = nextElem;
        }

        if (element.equals(tail)) {
            tail = prevElem;
        }

        element.setNext(null);
        element.setPrev(null);

        capacity--;
    }

    /**
     * Получение текущего списка в виде текстовой строки
     * @return результат в виде строки
     */
    public String getOutputString() {
        String result = "";
        LinkedListElem currentElement = head;
        do {
            result += currentElement.getValue();
            if (!currentElement.equals(tail)) {
                result += ", ";
            }
            currentElement = currentElement.getNext();
        } while (currentElement != null);

        return result;
    }

    /**
     * Получить элемент по заданной позиции
     * @param index позиция требуемого элемента
     * @return возвращаемый элемент
     */
    private LinkedListElem getElementAtIndex(int index) {
        if (index < 0 || index >= capacity) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        int middlePosition = capacity / 2;

        LinkedListElem temp;
        if (index < middlePosition) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }
        } else {
            temp = tail;
            int endIndex = capacity - index - 1;
            for (int i = 0; i < endIndex; i++) {
                temp = temp.getPrev();
            }
        }

        return temp;
    }

    void setItem(int index, int value) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        if (index >= capacity) {
            addAtIndex(index, value);
        } else {
            LinkedListElem elem = getElementAtIndex(index);
            elem.setValue(value);
        }
    }
}
