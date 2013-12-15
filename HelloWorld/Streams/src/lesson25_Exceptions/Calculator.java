package lesson25_Exceptions;

/**
 * Created by frizzle on 05.12.13.
 */
public class Calculator {
    public double sum(double left, double right) {
        return left + right;
    }

    public double sub(double left, double right) {
        return left - right;
    }

    public double mul(double left, double right) {
        return left * right;
    }

    //runtime-исключения не требуют указания дополнительных синтаксических выражений
    //Считается, что такие исключительный ситуации разработчик не может обработать в своём коде
    public double div(double left, double right) {
        if (right == 0) {
            throw new RuntimeConditionByZeroException();
        }
        return left/right;
    }

    //Compile-исключения должны быть явно перечислены в сигнатуре метода с помощью конструкции throws
    //таким образом проектировщик библиотеки указывает, что разработчик может и должен предусмотреть обработку этого случая
    public double sqrt(double val) throws NegativeNumberException {
        if (val < 0) {
            throw new NegativeNumberException();
        }
        return Math.sqrt(val);
    }
}
