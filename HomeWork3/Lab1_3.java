package HomeWork3;

public class Lab1_3 {
    public static void main(String[] args) {
        int [] list={20,1,1,2,2,3,3,5,5,4,20,4,5};
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
