package recrusive;

public class palindrome {
    public static void main(String[] args) {
        String word = "madam";
        int n = word.length();
        boolean isPalindrome = isPalindrome(word, 0, n-1);
        if (isPalindrome) {
            System.out.println("The word is palindrome");
        } else {
            System.out.println("The word is not palindrome");
        }
    }

    public static boolean isPalindrome(String word, int start, int end){
        if (start >= end) {
            return true;
        }
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }
        return isPalindrome(word, start+1, end-1);
    }
}
