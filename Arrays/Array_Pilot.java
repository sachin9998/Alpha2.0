import java.util.Scanner;

public class Array_Pilot {
  public static void main(String[] args) {

    int marks[] = new int[5];
    Scanner scan = new Scanner(System.in);

    // Taking input
    for (int i = 0; i < marks.length; i++) {
      marks[i] = scan.nextInt();
    }

    // Printing whole array
    for (int i = 0; i < marks.length; i++) {
      System.out.println(marks[i]);
    }
  }
}
