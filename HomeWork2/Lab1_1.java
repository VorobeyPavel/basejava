package HomeWork2;
public class Lab1_1 {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int y = 2; y <= 5; y++) {
                if (y == 5) {
                    System.out.println(y + "*" + x + "=" + (y * x) + "\t");
                } else {
                    System.out.print(y + "*" + x + "=" + (y * x) + "\t");
                }
            }
        }
        System.out.println();
        for (int a = 1; a <= 10; a++) {
            for (int b = 6; b <= 9; b++) {
                if (b == 9) {
                    System.out.println(b + "*" + a + "=" + (b * a) + "\t");
                } else {
                    System.out.print(b + "*" + a + "=" + (b * a) + "\t");
                }
            }
        }
    }
}