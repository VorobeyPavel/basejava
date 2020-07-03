package HomeWork2;
import java.util.Scanner;

public class Lab3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ведите 10 элементов массива");
        int[] arr = new int[10];
        for (int i=0; i<10; i++) {
            arr[i]=sc.nextInt();
        }
        for (int a = 1; a < arr.length; a++) {
            for (int b = arr.length - 1; b >= a; b--) {
                if (arr[b - 1] > arr[b]) {
                    int t = arr[b - 1];
                    arr[b - 1] = arr[b];
                    arr[b] = t;
                }
            }
        }
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}