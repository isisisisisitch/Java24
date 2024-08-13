package ca.bytetube._02_array;

import java.util.Random;

public class Main {


    private int size;
    private int[] array;


    public Main() {
        this.array = getRandArray(100, 9);
        size = array.length >> 1;
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.printArray();
        System.out.println();
        main.clear();
        main.printArray();

        for (int i = 0; i < 15; i++) {
            main.add(100, 3);
        }


        System.out.println();
        main.printArray();
    }

    /**
     * 1.尾部追加(length)
     * 2.普通位置添加（index<=length-1）
     * 3.在添加的过程中，如果容量不够，需要扩容
     */
    public void add(int element, int index) {
        if (index < 0 || index > size) return;
        extendCapacity(size + 1);

        if (index == size) {
            array[size] = element;
        } else {
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = element;
        }
        size++;
        //System.out.println(size);


    }

    public void extendCapacity(int capacity) {
        //1.获取之前的容量
        int old = array.length;

        if (old >= capacity) return;

        //需要扩容
        int newCapacity = 2 * old;
        int[] newArray = new int[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;

    }

    public void clear() {
        int mid = array.length >> 1;
        for (int i = mid; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public int[] getRandArray(int range, int length) {
        if (length < 0) length = 10;
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            int randNum = random.nextInt(range);//[0,100)
            array[i] = randNum;
        }

        return array;

    }


    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) System.out.print(array[i] + " ");
            else System.out.print(array[i]);

        }
    }
}
