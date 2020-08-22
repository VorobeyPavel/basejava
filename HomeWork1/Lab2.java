package HomeWork1;

import java.sql.SQLOutput;

public class Lab2 {
    public static void main(String[] args) {
        int a=5;
        int b=2;
        int c=8;
        System.out.println(a + b / c);              //5      (2 делить на 8 = 0; 5 + 0 )
        System.out.println((a + b) / c);            //0      (5 + 2) / 8
        System.out.println((a + b++) / c);          //0      (5 + 2) / 8
        System.out.println( (a + b++) / --c);       //1      (5 + 3) / 8
        System.out.println((a * b >> a++) / --c);   //0      (5 умножить на 2 = (1010) сдвинуть вправо
                                                    //        на 2 разряда = 2 (10) и делить на 7)

        System.out.println((a + 7 > 20 ? 68 : 22 * b >> b++) / --c);   //1      выражение 5 + 7 > 20 false то выполняется выражение
                                                                                // 22 * 2 = 44 (101100)
                                                                                //сдвигается на 2 разряда вправо = (1011) 11 делится на 7)

        // System.out.println((5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> a++) / --b);   //Не разобрался что надо изменить

        System.out.println(6 - 2 > 3 && 12 * 12 <= 119);    //false     выполняется умножение 12*12,вычитание 6-2 ,
                                                                        // сравнение 4 > 3 = true, сравнение 144 <= 119 = false
        System.out.println(true && false);                  //false




    }
}
