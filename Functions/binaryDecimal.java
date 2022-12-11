public class binaryDecimal {

  public static void binaryToDecimal(int binNum) {

    int pow = 0;
    int myNum = binNum;
    int decNumber = 0;

    while (binNum > 0) {
      int lastDigit = binNum % 10;
      decNumber = decNumber + (lastDigit * (int) Math.pow(2, decNumber));
      pow++;
      binNum /= 10;
    }

    System.out.println("Decimal of " + myNum + " = " + decNumber);
  }

  public static void main(String[] args) {

    // Binary to decimal
    int n = 101;

    binaryToDecimal(n);

  }
}
