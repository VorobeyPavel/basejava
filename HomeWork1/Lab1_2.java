package HomeWork1;

public class Lab1_2 {
    public static void main(String[] args) {
        int a=42;   //101010
        int b=15;   //1111
        System.out.println(~42+" "+~15);            //-101011   -10000
        System.out.println(42&15);  //1010
        System.out.println(42|15);  //101111
        System.out.println(42^15);  //100101
        System.out.println((42>>1)+" "+(15>>1));    //10101 111
        System.out.println((42>>>1)+" "+(15>>>1));  //10101 111
        System.out.println((42<<1)+" "+(15<<1));    //1010100   11110
        System.out.println((a>>=1)+" "+(b>>=1));    //10101 111
        a=42;  b=15;
        System.out.println((a&=15)+" "+(b&=42));    //1010  1010
        a=42;  b=15;
        System.out.println((a|=15)+" "+(b|=42));    //101111    101111
        a=42;  b=15;
        System.out.println((a^=15)+" "+(b^=42));    //100101    100101
        a=42;  b=15;
        System.out.println((a>>=1)+" "+(b>>=1));    //10101 111
        a=42;  b=15;
        System.out.println((a<<=1)+" "+(b<<=1));    //1010100   11110
        a=42;  b=15;
        System.out.println((a>>>=1)+" "+(b>>>=1));  //10101 111



    }
}
