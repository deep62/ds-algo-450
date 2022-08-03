package kunal;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    Object[] data;
    public static int DEFAULT_SIZE = 10;
    private int size = 0;

    @Override
    public String toString() {
        return "CustomGenericArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public CustomGenericArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        this.data[size++] = num;
    }
    // remove item
    public T remove(){
        return (T)data[--size];
    }

    // get item
    public int get(int index){
        return size;
    }

    // size
    public int size(){
        return data.length;
    }

    // set
    public void set(int index, int value){
        data[index] = value;
    }
    private void resize() {
        System.out.println("resizing");
        Object[] temp = new Object[2*data.length];
        // copy existing array in to new temporary array
        for(int i=0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull() {
        return size == data.length;
    }


    public static void main(String[] args) {
        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<Integer>();
        for(int i=0; i < 14; i++){
            list.add(2*i);
        }
        System.out.println(list);

    }
}
