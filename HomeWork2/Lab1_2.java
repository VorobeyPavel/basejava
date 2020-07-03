package HomeWork2;

public class Lab1_2 {
    public static void main(String[] args) {
        int []arr=new int[1];
        arr[0]=Integer.parseInt(args[0]);

        if (arr[0]==0){
            System.out.println("число не должно равняться нулю");
            return;
        }
        if (arr[0]>0) {
            int result = 1;
            for (int i = 1; i < arr[0]; i++) {
                result = result * (i + 1);
            }
            System.out.println("result=" + result);
        }
        if (arr[0]<0){
            int result = 1;
            for (int i = 1; i >=arr[0]; i--) {
                if (i==0)
                    continue;
                result = result * (i );
            }
            System.out.println("result=" + result);
        }

    }
}


