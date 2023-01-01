import java.util.ArrayList;

public class Classroom {

  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();

    list.add(51);
    list.add(55);
    list.add(54);
    list.add(365);
    list.add(5547);

    // Find size of ArrayList
    System.out.println(list.size());

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

  }
}
