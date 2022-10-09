package workshop1;

import java.util.function.Consumer;

public class SmartArray {
    private int[] data;
    private int capacity = 4;
    private int size = 0;

    SmartArray(){
        this.data = new int[capacity];
    }
    public void add(int element){
        if(size == capacity){
            grow();
        }
        data [size] = element;
        size++;
    }
    public int get(int index){
        return data[index];
    }
    public void remove(int index){
        if (size - 1 - index >= 0) System.arraycopy(data, index + 1, data, index, size - 1 - index);
        data[size - 1] = 0;
        size--;
    }
    public boolean contains(int element){
        for(int num: data){
            if(num == element){
                return true;
            }
        }
        return false;
    }
    public void add (int index, int element){
        int[] rightNums = new int[size - index + 1];
        System.arraycopy(data, index, rightNums, 0, rightNums.length);
        if(size == capacity){
            grow();
        }
        int j = 0;
        for(int i = index; i < size; i++){
            data[i+1] = rightNums[j];
            j++;
        }
        data[index] = element;
        size++;
    }
    public void forEach(Consumer<Integer> consumer){
        for(int i = 0; i < size; i++){
            consumer.accept(data[i]);
        }
    }
    private void grow(){
        capacity *= 2;
        int[] oldArray = data;
        data = new int[capacity];
        if (size >= 0) System.arraycopy(oldArray, 0, data, 0, size);
    }
}
