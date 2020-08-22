package HomeWork1;

import java.util.Scanner;

public class Lab5_switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ведите имя");
        String name=sc.nextLine();
        switch (name) {
            case "Вася":
                System.out.println("Привет \n"+"Я тебя так долго ждал");
                break;
            case "Анастасия":
                 System.out.println("Я тебя так долго ждал");
            default:
                 System.out.println("Добрый день, а вы кто?");
                 System.out.println("Ваше имя: "+name);
          }
    }
}
