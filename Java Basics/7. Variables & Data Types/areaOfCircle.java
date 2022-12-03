import java.util.Scanner;

public class areaOfCircle {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    float r = scan.nextFloat();

    float area = r * r * 3.14f;

    System.out.println(area);

  }
}
