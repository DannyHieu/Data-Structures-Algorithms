package algorithms.array;

/**
 * Given an array of n-1 distinct (riêng biệt) numbers in the range of 1 to n. Find the missing number in it
 * arr[]{2,4,1,8,6,3,7} -> output: 5
 * The sum of first n natural number = 1+2+3+...+n = n*(n+1)/2
 */

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {2,4,1,8,6,3,7};
        System.out.println(findMissingNumber(arr));
    }

    static int findMissingNumber(int[] arr) {
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }
        return sum;
    }
}
