package lesson21_WorkWithStringBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: frizzle
 * Date: 14.11.13
 * Time: 22:21
 * Класс StringBuilder используется при необходимости многократно модифицировать строку символов.
 * Принцип работы схож с принципом представления строк в c++ - строки представляются как массив символов
 * При расширении границ  массива его величина увеличивается в 2 раза.
 * При преобразовании объекта в строку создается ещё один вспомогательный объект
 * Существует системныый метод, позволяющий сделать это за одну итерацию
 * В нашем примере было создано всего 3 объекта String
 */
public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("HelloWorld");
        for (int i = 0; i < 10; i++) {
            builder.append(i);
        }
        System.out.println(builder.toString());
    }
}
