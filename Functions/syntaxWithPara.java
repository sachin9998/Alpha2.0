import java.util.Scanner;

public class syntaxWithPara {

  public static int sum(int a, int b) {
    int total = a + b;
    return total;
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt();
    int y = scan.nextInt();

    int ans = sum(x, y);

    System.out.println("The addition of X and Y is " + ans);

  }
}
