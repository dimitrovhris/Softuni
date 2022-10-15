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

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
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
