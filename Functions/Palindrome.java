import java.util.Scanner;

public class Palindrome {

  public static void checkPalindrome(int n) {

    int og = n;
    int rev = 0;

    while (n != 0) {
      int lastDigit = n % 10;
      rev = (rev * 10) + lastDigit;
      n = n / 10;
    }

    if (rev == og) {
      System.out.println("The given number " + og + " is a palindrome number");
    } else {
      System.out.println("The given number " + og + " is not a palindrome number");
    }

  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();

    checkPalindrome(num);

  }

}
