package HomeWork2;

public class Lab3 {
    public static void main(String[] args) {
        int[] arr = {23, 5, 67, -34, 0, 12, -56};
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
            System.out.print(" "+arr[i]);
        }
    }
}