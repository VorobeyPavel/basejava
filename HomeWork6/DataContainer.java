package HomeWork6;

import java.util.Arrays;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] initArr){
        this.data = initArr;
    }

    public int add(T item){
        data = Arrays.copyOf(data,data.length + 1);
        int index = this.data.length - 1;
        this.data[index] = item;
        return index;
    }

    public boolean deleteIndex(int index) {
        if (index <= data.length - 1) {
            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        }
        return false;
    }

    public boolean deleteElement(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)) {
                for (int j = i; j < data.length - 1; j++) {
                    data[j] = data[j + 1];
                }
            }
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        }
        return false;
    }

    public T get(int index){
        return this.data[index];
    }

    public T[] getItems() {
        return data;
    }
}