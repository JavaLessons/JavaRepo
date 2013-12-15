package lesson25_Exceptions;

/**
 * Created by frizzle on 05.12.13.
 */
//Исключения - способ оповещения об ошибке, пришедший на замену методу возврата значений
//Если проектировщик планирует обрабатывать группы исключений одинаково то можно предусмотреть базовый класс исключений для этой группа
//На каждый сценарий поведения нужно генерировать собственный класс исключений, чтобы сохранять свойство самодокументируемости кода
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        //Если мы хотим обработать исключение, то мы должны поместить область, которую мы хотим диагностировать, в блок try
        try {
            System.out.println(calculator.div(10, 1));
            //Список исплючений, который мы будем обрабатывать
            //Порядок имеет значение
        } catch (RuntimeException e) {

            System.out.println("line 0");
            e.printStackTrace();
            //блок finally - код, который будет выполнен в независимости от того, было исключение или нет
            //Пример: освобождение ресурса, закрытие файла, закрытие соединения, откат транзакции.
        } finally {
            System.out.println("line 10");
        }

        try {
            System.out.println(calculator.sqrt(-10));
        } catch (Exception e) {
            System.out.println("line1");
            e.printStackTrace();
            System.out.println("line 2");
        }
    }
}
