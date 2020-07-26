package HomeWork5;

public class CalculatorWithOperator {

    public double division(int a, int b) {
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double power(double a, double b) {
        double length = b;
        int result = 1;
        for (b = 0; b < length; b++) {
            result *= a;
        }
        return result;
    }

    public double module(double a) {
        if (a < 0) {
            a=a*(-1);
        }
        if (a>=0){
            a=a*1;
        }
        return a;
    }

}
