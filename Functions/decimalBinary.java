public class decimalBinary {

  public static void decToBin(int n) {
    int pow = 0;
    int binNum = 0;

    while (n > 0) {
      int reminder = n % 2;
      binNum += reminder * (int) Math.pow(10, pow);
      pow++;
      n = n / 2;
    }

    System.out.println("The binary format is " + binNum);
  }

  public static void main(String[] args) {
    int n = 5;

    decToBin(n);

  }
}
