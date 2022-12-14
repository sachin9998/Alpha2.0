public class arrayFucntion {

  public static void update(int marks[]) {
    // Updating array
    for (int i = 0; i < marks.length; i++) {
      marks[i] = marks[i] - 50;
    }
  }

  public static void main(String[] args) {
    int marks[] = { 97, 98, 99 };

    // Calling update function
    update(marks);

    // Printing array
    for (int i = 0; i < marks.length; i++) {
      System.out.println(marks[i]);
    }

  }

}
