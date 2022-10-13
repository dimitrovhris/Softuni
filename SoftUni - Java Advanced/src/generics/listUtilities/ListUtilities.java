package generics.listUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListUtilities<T > {
    private List<T> list;

    ListUtilities(){
        list = new ArrayList<>();
    }
    public static <T extends Comparable<T>> T getMin(List<T> list){
        ensureIsNotEmpty(list);
        return Collections.min(list);
    }
    public static < T extends Comparable<T>> T getMax(List<T> list){
        ensureIsNotEmpty(list);
        return Collections.max(list);
    }

    private static <T> void ensureIsNotEmpty(List<T> list) {
        if(list.isEmpty()){
            throw  new IllegalArgumentException("List is empty");
        }
    }
}
