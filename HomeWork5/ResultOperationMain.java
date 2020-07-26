package HomeWork5;

public class ResultOperationMain {
    public static void main(String[] args) {
        CalculatorWithOperator Calculator1=new CalculatorWithOperator();
        CalculatorWithMathCopy Calculator2=new CalculatorWithMathCopy();
        CalculatorWithMathExtends Calculator3=new CalculatorWithMathExtends();

 //     4.1 + 15 * 7 + (28 / 5) ^ 2;

        double result1=Calculator1.division(28,5);
        double result2=Calculator1.multiply(15,7);
        double result3=Calculator1.power(result1,2);
        double result4=Calculator1.sum(4.1,result2);
        double result5=Calculator1.sum(result4,result3);
        double zero1=result5/0.0;
        double zero2=result5/0.0d;

        double result6=Calculator2.division(28,5);
        double result7=Calculator2.multiply(15,7);
        double result8=Calculator2.pow(result1,2);
        double result9=Calculator2.sum(4.1,result2);
        double result10=Calculator2.sum(result4,result3);
        double zero3=result10/0.0;
        double zero4=result10/0.0d;

        double result11=Calculator3.division(28,5);
        double result12=Calculator3.multiply(15,7);
        double result13=Calculator3.power(result1,2);
        double result14=Calculator3.sum(4.1,result2);
        double result15=Calculator3.sum(result4,result3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(zero1);
        System.out.println(zero2);

        System.out.println("------------------");

        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
        System.out.println(result10);
        System.out.println(zero3);
        System.out.println(zero4);
    }
}
