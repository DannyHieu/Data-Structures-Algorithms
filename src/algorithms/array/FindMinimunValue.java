package algorithms.array;

public class FindMinimunValue {
    
    public static void main(String[] args) {
        int[] arrNumber = {3, 10, -2, 6, 11, 20, -10};
        System.out.println(findMinimunValue(arrNumber));
    }

    static int findMinimunValue(int[] arrNumber) {
        if (arrNumber == null || arrNumber.length == 0) throw new IllegalArgumentException("Invalid input");
        int min = arrNumber[0];

        for (int j : arrNumber) {
            if (j < min) {
                min = j;
            }
        }
         
         return min;
    }
}
