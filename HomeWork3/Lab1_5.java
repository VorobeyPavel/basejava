package HomeWork3;

public class Lab1_5 {
    public static void main(String[] args) {
        int [] list={1,1,1,1,1,1,10,1,1,1,1};
        for (int i = 0; i < list.length; i++) {
            int result = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    result += 1;
                }
            }
            if (!(result % 2 == 0)) {
                System.out.println(list[i]);
                break;
            }
        }
    }
}
