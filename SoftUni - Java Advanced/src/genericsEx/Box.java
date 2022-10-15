package genericsEx;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Box<T extends Comparable<T>> {
    private List<T> list;

    Box() {
        list = new ArrayList<>();
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
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
    public int countStrings(List<T> list, T compareValue){
            list = list.stream()
                    .filter(e-> e.compareTo(compareValue) > 0)
                    .collect(Collectors.toList());
            return list.size();
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
