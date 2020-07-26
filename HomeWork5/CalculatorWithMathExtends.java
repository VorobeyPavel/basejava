package HomeWork5;

public class CalculatorWithMathExtends extends CalculatorWithOperator{

    @Override
    public double division(int a, int b) {
        return super.division(a, b);
    }

    @Override
    public int multiply(int a, int b) {
        return super.multiply(a, b);
    }

    @Override
    public int subtraction(int a, int b) {
        return super.subtraction(a, b);
    }

    @Override
    public double sum(double a, double b) {
        return super.sum(a, b);
    }

    @Override
    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public double module(double a) {
        return Math.abs(a);
    }
}
