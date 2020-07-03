package HomeWork2;

import java.util.Scanner;

public class Lab1_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Введите два числа");

        if (x==0){
            System.out.println("Число не должно быть равно нулю");
            return;
        }
        if (y==0){
            System.out.println("Число не должно быть равно нулю");
            return;
        }
        int result=x;
        for (int i=1; i<y;i++){
            result=result*x;

        }
        System.out.println("result="+result);
    }
}
