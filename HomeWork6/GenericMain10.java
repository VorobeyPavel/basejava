package HomeWork6;

import java.util.Arrays;

public class GenericMain10 {
    public static void main(String[] args) {

        DataContainer<String> data = new DataContainer<>(new String[0]);

        int index1 = data.add("Asdasd");
        int index2 = data.add("asdas22");
        int index3 = data.add("j6573123sd");
        int index4= data.add("133hgh");

        System.out.println(Arrays.toString(data.getItems()));

        System.out.println(data.get(index1));
        System.out.println(data.get(index2));
        System.out.println(data.get(index3));
        System.out.println(data.get(index4));

        data.deleteIndex(0);
        data.deleteElement("133hgh");

        System.out.println(Arrays.toString(data.getItems()));
    }
}
