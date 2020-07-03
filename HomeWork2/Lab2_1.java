package HomeWork2;

import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите 4 элемента массива");
        int [] arr=new int[4];
        int i;
        for (i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for (i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for (int i1 : arr) {
            System.out.println(i1);
        }

        int a=0;
        while (a<4){
            System.out.println(arr[a]);
            a++;
        }

        int b=0;
        do {
            System.out.println(arr[b]);
            b++;
        }while (b<4);
    }
}
