
public class String_Compression {

  // public static String Compressed(String str) {
  //   StringBuilder ans = new StringBuilder("");
  //   Integer count = 1;

  //   for (int i = 0; i < str.length(); i++) {

  //     while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
  //       count++;
  //       i++;
  //     }

  //     ans.append(str.charAt(i));

  //     if (count > 1) {
  //       ans.append(count.toString());
  //     }

  //   }

  //   return ans.toString();
  // }

  // public static String compression(String str) {

  //   String s = str.charAt(0) + "";
  //   Integer count = 1;
  //   for (int i = 1; i < str.length(); i++) {

  //     char curr = str.charAt(i);
  //     char prev = str.charAt(i - 1);

  //     if (curr == prev) {
  //       count++;
  //     } else {

  //       if (count > 1) {
  //         s += count.toString();
  //         count = 1;
  //       }
  //       s += curr;
  //     }

  //   }

  //   return s;
  // }

  public static String HybridSolution(String str) {

    String ans = "";
    Integer count = 1;

    for (int i = 0; i < str.length(); i++) {

      if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
        count++;
        i++;
      }
      ans = ans + str.charAt(i);

      if (count > 1) {
        ans = ans + count.toString();
        count = 1;
      }

    }

    return ans;

  }

  public static void main(String[] args) {

    String str = "aaabbcccdd";

    System.out.println("OK");

   // System.out.println(compression(str));

    System.out.println(HybridSolution(str));
  }
}