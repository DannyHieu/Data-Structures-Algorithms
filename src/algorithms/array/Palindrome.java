package algorithms.array;

/**
 * how to check if a String is a Palindrome (đối xứng) or not
 * Example: - Given String  "madam"
 * Solution: - It should return - true
 */
public class Palindrome {
    public static void main(String[] args) {
        String word = "madam";
        System.out.println(isPalindrome(word));
    }

    static boolean isPalindrome(String  word) {
        char[] wordArray = word.toCharArray();
        System.out.println(wordArray);
        int start = 0;
        int end = wordArray.length - 1;
        while (start < end) {
            if (wordArray[start] != wordArray[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}
