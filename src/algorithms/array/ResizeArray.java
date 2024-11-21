package algorithms.array;

import java.util.Arrays;

public class ResizeArray {

    public static void main(String[] args) {
        int[] arr = {5,3,10,1};
        int[] newArr = resize(arr, 8);
        System.out.println(Arrays.toString(newArr));
    }

    static int[] resize(int[] arr, int capacity){
        if (capacity < arr.length) throw new IllegalArgumentException("Invalid input");
        int[] temp = new int[capacity];

        for (int i = 0; i < arr.length ; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return  arr;
    }
}
