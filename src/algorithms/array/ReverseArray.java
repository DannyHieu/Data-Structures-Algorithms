package algorithms.array;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arrNumber = {8, 3, 6, 1, 10, 4, 2};
        reverseArray(arrNumber, 0, arrNumber.length-1);
    }

    static void reverseArray(int[] arrNumber, int start, int end) {
        while(start < end) {
            int temp = arrNumber[start];
            arrNumber[start] = arrNumber[end];
            arrNumber[end] = temp;
            start++;
            end--;
        }
    }
}
