package HomeWork1;

public class Lab1_2 {
    public static void main(String[] args) {
        int a=42;   //101010
        int b=15;   //1111
        int c=0;
        System.out.println((c=~42)+" "+Integer.toBinaryString(c));      //-43   11111111111111111111111111010101
        System.out.println((c=~15)+" "+Integer.toBinaryString(c));      //-16   11111111111111111111111111110000
        System.out.println((c=42&15)+" "+Integer.toBinaryString(c));    //10  1010
        System.out.println((c=42|15)+" "+Integer.toBinaryString(c));    //47 101111
        System.out.println((c=42^15)+" "+Integer.toBinaryString(c));    //37 100101
        System.out.println((c=42>>15)+" "+Integer.toBinaryString(c));   //0
        System.out.println((c=42>>>15)+" "+Integer.toBinaryString(c));  //0
        System.out.println((c=42<<15)+" "+Integer.toBinaryString(c));   //1376256 101010000000000000000
        System.out.println((c=a>>=15)+" "+Integer.toBinaryString(c));   //0
        a=42;
        System.out.println((c=a&=15)+" "+Integer.toBinaryString(c));    //10 1010
        a=42;
        System.out.println((c=a|=15)+" "+Integer.toBinaryString(c));    //47 101111
        a=42;
        System.out.println((c=a^=15)+" "+Integer.toBinaryString(c));    //37 100101
        a=42;
        System.out.println((c=a>>=15)+" "+Integer.toBinaryString(c));   //0
        a=42;
        System.out.println((c=a<<=15)+" "+Integer.toBinaryString(c));   //1376256 101010000000000000000
        a=42;
        System.out.println((c=a>>>=15)+" "+Integer.toBinaryString(c));  //0
    }
}
