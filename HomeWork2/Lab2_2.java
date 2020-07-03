package HomeWork2;

public class Lab2_2 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,0};
        for (int i=0;i<arr.length;i++){
            if (i%2==0)
                continue;
            System.out.print(arr[i]+", ");
        }
    }
}
