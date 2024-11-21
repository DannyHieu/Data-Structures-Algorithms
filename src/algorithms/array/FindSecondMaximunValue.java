package algorithms.array;

public class FindSecondMaximunValue {

    public static void main(String[] args) {

        int[] arr = {1, 31, -2, 30, 31};

        System.out.println("Second Max Value in Array: " + findSecondMaximunValue(arr));
    }

    static int findSecondMaximunValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("max: " + max);
        System.out.println("second max: " +secondMax);
        return secondMax;
    }
}
