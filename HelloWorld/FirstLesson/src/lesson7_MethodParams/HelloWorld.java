package lesson7_MethodParams;

public class HelloWorld {
    public static void main (String[] args) {
        HelloWorld hw = new HelloWorld();
        hw.methodWithOneParam("Hello");
        hw.methodWithTwoParams("Hello", "World!");
    }

    public void methodWithOneParam(String operand1) {
        System.out.println(operand1);
    }

    public void methodWithTwoParams(String operand1, String operand2) {
        System.out.println(operand1 + " " + operand2);
    }
}
