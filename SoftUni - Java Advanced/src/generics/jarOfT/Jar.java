package generics.jarOfT;

import java.util.ArrayDeque;


public class Jar <T>{
    private ArrayDeque<T> list;

    Jar(){
        this.list = new ArrayDeque<>();
    }
    public void add(T element){
        list.push(element);
    }
    public T remove(){
        return list.pop();
    }
}
