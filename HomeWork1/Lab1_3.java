package HomeWork1;

public class Lab1_3 {
    public static void main(String[] args) {
        int a = -42;
        int b = -15;
        System.out.println(~-42 + " " + ~-15);   //101001   1110
        System.out.println(-42 & -15);  //-110000
        System.out.println(-42 | -15);  //-1001
        System.out.println(-42 ^ -15);  //100111
        System.out.println((-42 >> 15)+" "+(-15>> 42));     //-1    -1
        System.out.println((-42 >>> 15)+" "+(-15 >>> 42));  //11001100110011 1111111111111111111111
        System.out.println((-42 << 15)+" "+(-15<< 42));     //-11010111000010   -11110000000000
        System.out.println((a >>= 15)+" "+(b >>= 42));      //-1    -1
        a = -42; b = -15;
        System.out.println((a &= -15)+" "+(b &= -42));      //-110000   -110000
        a = -42; b = -15;
        System.out.println((a |= -15)+" "+(b |= -42));      //-1001 -1001
        a = -42; b = -15;
        System.out.println((a ^= -15)+" "+(b ^= -42));    //100111  100111
        a = -42; b = -15;
        System.out.println((a>>=15)+" "+(b>>=42));  //-1    -1
        a = -42; b = -15;
        System.out.println((a<<=15)+" "+(b<<=42));  //-11010111000010   -11110000000000
        a = -42; b = -15;
        System.out.println((a>>>=15)+" "+(b>>>=42));    //11001100110011    1010001111010111
    }
}