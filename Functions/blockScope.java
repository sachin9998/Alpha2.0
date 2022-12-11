public class blockScope {
  public static void main(String[] args) {

    {

      int s = 45;
      System.out.println(s);
    }

    System.out.println(s);

  }
}
