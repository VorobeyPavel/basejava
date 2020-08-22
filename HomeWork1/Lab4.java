package HomeWork1;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите день");
        int dayOfWeek=sc.nextInt();

        if(dayOfWeek<1 || dayOfWeek>7){
            System.out.println("Вы ввели неправильный день недели");
            return;
        }

        System.out.println("Введите месяц");
        int month=sc.nextInt();
        if (month<1 || month>12){
            System.out.println("Вы ввели неверный месяц");
        }

        if (sleepIn( dayOfWeek<6, month==7)){
            System.out.println("Можно спать");
        } else System.out.println("Надо вставать");
    }

    public static boolean sleepIn(boolean weekday, boolean month){
        if (!weekday || month){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isDayOfWeek (int dayOfWeek) {
        switch (dayOfWeek){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            case 6:
            case 7:
                return false;
        }
        return false;
    }

    public static boolean  isMonth(int month) {
        switch (month) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return false;
            case 7:
                return true;
        }
        return false;
    }
}
