public class factorial {

  public static int fact(int n) {

    int ans = 1;
    for (int i = 1; i <= n; i++) {
      ans = ans + (ans * i);
    }

    return ans;
  }

  public static void main(String[] args) {

    int a = 5;
    int num = fact(a);
    System.out.println(" The factorial is " + num);

  }
}
