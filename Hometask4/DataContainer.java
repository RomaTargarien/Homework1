package Hometask4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T>  {
    private T[] data;

    public DataContainer(T[] data){
        this.data = data;
    }

    public int add(T item) {
        //если есть значения null
        for (int i = 0; i < data.length; i++){
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        //если нулей в контейнере нет
        data = Arrays.copyOf(data, data.length + 1);
        data[data.length-1] = item;
        return data.length - 1;
    }

    public T get(int index){
        return data[index];
    }

    public T[] getItems(){
        return data;
    }

    boolean delete(int index){
        if (index <= data.length - 1 && index >= 0) {
            System.arraycopy(data, 0, data, 0, index);
            for (int i = index; i < data.length; i++){
                if (i == data.length - 1){
                    data = Arrays.copyOf(data, data.length - 1);
                    break;
                }
                data[i] = data[i+1];
            }
            return true;
        }
        return false;
    }

    boolean delete(T item) {
        for (int j = 0; j < data.length; j++) {
            if (data[j] == item) {
                System.arraycopy(data, 0, data, 0, j);
                for (int i = j; i < data.length; i++) {
                    if (i == data.length - 1) {
                        data = Arrays.copyOf(data, data.length - 1);
                        break;
                    }
                    data[i] = data[i + 1];
                }
                return true;
            }
        }
        return false;
    }

    void sort(Comparator<T> comparator){
        for (int i = data.length - 1; i >= 0 ; i--){
            for (int j = 0; j < i; j++){
                if (comparator.compare(data[j],data[j + 1]) > 0){
                    T copy = data[j];
                    data[j] = data[j+1];
                    data[j+1] = copy;
                }
            }
        }
    }


    public static <V extends Comparable> void sort(DataContainer<V> container){
        for (int i = container.data.length - 1; i >= 0 ; i--){
            for (int j = 0; j < i; j++){
                if (container.data[j].compareTo(container.data[j+1]) > 0){
                    V copy = container.data[j];
                    container.data[j] = container.data[j+1];
                    container.data[j+1] = copy;
                }
            }
        }
    }
    public static <V extends Comparable> void sort(DataContainer<V> container, Comparator<V> comparator){
        container.sort(comparator);
    }
    @Override
    public String toString() {
        String result = "DataContainer{data=[";
        for (int i = 0; i < data.length; i++){
            if (data[i] == null){
                delete(i);
                i--;
            }
        }
        for (int i = 0; i < data.length; i++){
                if (i == data.length - 1){
                    result += data[i];
                    break;
                }
               result += data[i] + ",";
        }
        result += "]}";
        return result;
    }
}
