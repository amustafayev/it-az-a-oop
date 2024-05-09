package lesson8.generics;

public class MyList<T> {

    T[] storage = (T[]) new Object[100];
    private int index = 0;

    public void add(T data){
        storage[index] = data;
        index++;
    }

    public T get(int index){
        return storage[index];
    }

    public int size(){
        return this.index; // + 1;
    }

}
