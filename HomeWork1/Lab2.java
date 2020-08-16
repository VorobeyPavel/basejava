package HomeWork1;

import java.sql.SQLOutput;

public class Lab2 {
    public static void main(String[] args) {
        int a = 2; int b=8;
        System.out.println(5 + 2 / 8);         //5
        System.out.println((5 + 2) / 8);       //0
        System.out.println((5 + a++) / 8);     //0
        System.out.println( (5 + a++) / --b);   //1
        System.out.println((5 * 2 >> a++) / --b);   //0
        System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> a++) / --b);   //0
        // System.out.println((5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> a++) / --b);   //Не разобрался что надо изменить
        System.out.println(6 - 2 > 3 && 12 * 12 <= 119);    //false
        System.out.println(true && false);                  //false




    }
}
