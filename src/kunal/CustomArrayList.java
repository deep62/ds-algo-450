package kunal;

import java.util.Arrays;

public class CustomArrayList {
    int[] data;
    public static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        this.data[size++] = num;
    }
    // remove item
    public int remove(){
        return data[--size];
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
        int[] temp = new int[2*data.length];
        // copy existing array in to new temporary array
        for(int i=0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(5);
        list.add(9);

        for(int i=0; i < 14; i++){
            list.add(2*i);
        }
        System.out.println(list);

    }
}
