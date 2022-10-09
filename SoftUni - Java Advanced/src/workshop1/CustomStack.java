package workshop1;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class CustomStack {
    private int[] data;
    private int size = 0;
    private int capacity = 4;

    CustomStack() {
        data = new int[capacity];
    }

    public void push(int element) {
        if (size == capacity) {
            grow();
        }
        data[size] = element;
        size++;
    }

    public int pop() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("CustomStack is empty");
        } else {
            int num = data[size - 1];
            data[size - 1] = 0;
            size--;
            return num;
        }
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = size - 1; i >= 0; i--) {
            consumer.accept(data[i]);
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("CustomStack is empty");
        } else {
            return data[size - 1];
        }
    }

    private void grow() {
        capacity *= 2;
        int[] oldArray = data;
        data = new int[capacity];
        if (size >= 0) System.arraycopy(oldArray, 0, data, 0, size);
    }

    private boolean isEmpty() {
        return size == 0;
    }
}
