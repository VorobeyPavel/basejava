package HomeWork2;

public class Lab1_3 {
    public static void main(String[] args) {
        int[] arr=new int[args.length];
        for (int i=0; i<args.length; i++){
            arr[i]=Integer.parseInt(args[i]);
        }
        int result=1;
        for (int i=0;i<arr.length; i++){
            result=result*arr[i];
        }
        System.out.println(result);
    }
}
