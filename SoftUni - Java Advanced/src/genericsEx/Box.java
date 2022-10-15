package genericsEx;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> list;

    Box() {
        list = new ArrayList<>();
    }

    public void add(T string) {
        list.add(string);
    }

    public void swap(int index1, int index2){
        T element1 = list.get(index1);
        T element2 = list.get(index2);
        list.set(index1, element2);
        list.set(index2, element1);
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (T element : list) {
            result.append(String.format("%s: %s%n", element.getClass().getName(), element));
        }
        return result.toString();
    }
}
