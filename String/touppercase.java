public class touppercase {
  public static void main(String[] args) {

    // To convert each first letter to uppercase
    String a = "hi, i am shradha";

    StringBuilder sb = new StringBuilder("ok");
    // ans.append(a.charAt(0) + 'A' - 'a');
    System.out.println(sb);
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(0) == ' ') {
        sb.append(a);
      }
    }

    // System.out.println(ans);

  }
}
