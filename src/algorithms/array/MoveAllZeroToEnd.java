package algorithms.array;

import java.util.Arrays;

public class MoveAllZeroToEnd {

    public static void main(String[] args) {
        int[] arr = {0, 1, 10, 0, 9, 5, 8};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveZeros(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Invalid input");
        int j = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] != 0 && arr[j] ==0){
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j] = temp;
                System.out.println("Array change: " + Arrays.toString(arr));
            }
            if (arr[j] != 0) j++;
        }

    }
}
