package HomeWork1;

import java.util.Scanner;

public class Lab5_else_if {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name=sc.nextLine();
        String a="Вася";
        String b="Анастасия";
        if (name.equals(a)){
            System.out.println("Привет \n"+"Я тебя так долго ждал");
        }   else if (name.equals(b)){
            System.out.println("Я тебя так долго ждал");
        }   else {
            System.out.println("Добрый день, а вы кто?");
        }

        System.out.println("Ваше имя: "+name);
    }
}
