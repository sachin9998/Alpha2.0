public class palindromString {

  public static boolean checkPalindrome(String s) {

    boolean isPalindrome = true;

    for (int i = 0; i < s.length() / 2; i++) {
      int j = s.length() - i - 1;
      if (s.charAt(i) != s.charAt(j)) {
        isPalindrome = false;
        return isPalindrome;
      }
      j--;
    }

    return isPalindrome;

  }

  public static void main(String[] args) {

    String first = "noon";
    String second = "racpar";

    if (checkPalindrome(first)) {
      System.out.println("String is palindrome");
    } else {
      System.out.println("Stirng is not palindrome");
    }

    if (checkPalindrome(second)) {
      System.out.println("String is palindrome");
    } else {
      System.out.println("Stirng is not palindrome");
    }

  }

}
