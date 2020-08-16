package HomeWork1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ведите день");
        int dayOfWeek=sc.nextInt();

        if(dayOfWeek<1 || dayOfWeek>7){
            System.out.println("Вы ввели неправильный день недели");
            return;
        }
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Встаем");
                break;
            case 6:
            case 7:
                System.out.println("Спим");
                break;
            default:
                System.out.println("Неизвестный день");
                break;
        }


        sleepIn( dayOfWeek<6);
    }
    public static boolean sleepIn(boolean weekday){
        if (!weekday){
           return true;
        }else {
            return false;
        }
    }
}
