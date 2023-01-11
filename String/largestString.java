public class largestString {
  public static void main(String[] args) {

    String str1 = "apple";
    String str2 = "mango";
    String str3 = "banana";

    int a = str1.length();
    int b = str2.length();
    int c = str3.length();

    int ans = 0;

    if (a > b && a > c) {
      System.out.println(str1);
    } else if (b > a && b > c) {
      System.out.println(str2);
    } else {
      System.out.println(str3);
    }

    System.out.println("The largest String is " + ans);

    String fruits[] = { "apple", "mango", "banana" };

    String largest = fruits[0];
    for (int i = 0; i < fruits.length; i++) {
      if (largest.compareTo(fruits[i]) < 0) {
        largest = fruits[i];
      }
    }
    System.out.println(largest);
  }
}
