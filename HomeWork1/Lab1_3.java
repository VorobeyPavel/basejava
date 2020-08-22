package HomeWork1;

public class Lab1_3 {
    public static void main(String[] args) {
        int a = -42;
        int b = -15;
        int c=0;
        System.out.println((c=~-42)+" "+Integer.toBinaryString(c));      //41 101001
        System.out.println((c=~-15)+" "+Integer.toBinaryString(c));      //14 1110
        System.out.println((c=-42&-15)+" "+Integer.toBinaryString(c));    //-48 11111111111111111111111111010000
        System.out.println((c=-42|-15)+" "+Integer.toBinaryString(c));    //-9 11111111111111111111111111110111
        System.out.println((c=-42^-15)+" "+Integer.toBinaryString(c));    //39 100111

        System.out.println((c=-42>>-15)+" "+Integer.toBinaryString(c));   //-1 11111111111111111111111111111111
        System.out.println((c=-42>>>-15)+" "+Integer.toBinaryString(c));  //32767 111111111111111
        System.out.println((c=-42<<-15)+" "+Integer.toBinaryString(c));   //-5505024 11111111101011000000000000000000

        System.out.println((c=a>>=-15)+" "+Integer.toBinaryString(c));   //-1 11111111111111111111111111111111
        a=42;
        System.out.println((c=a&=-15)+" "+Integer.toBinaryString(c));    //32 100000
        a=42;
        System.out.println((c=a|=-15)+" "+Integer.toBinaryString(c));    //-5 11111111111111111111111111111011
        a=42;
        System.out.println((c=a^=-15)+" "+Integer.toBinaryString(c));    //-37 11111111111111111111111111011011
        a=42;
        System.out.println((c=a>>=-15)+" "+Integer.toBinaryString(c));   //0
        a=42;
        System.out.println((c=a<<=-15)+" "+Integer.toBinaryString(c));   //5505024 10101000000000000000000
        a=42;
        System.out.println((c=a>>>=-15)+" "+Integer.toBinaryString(c));  //0
    }
}