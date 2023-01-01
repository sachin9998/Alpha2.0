import java.util.ArrayList;

public class arrayListOperations {
  public static void main(String[] args) {

    // Declaring ArrayList
    ArrayList<Integer> list = new ArrayList<>();

    // Add Element Opration
    list.add(10);
    list.add(20);
    list.add(30);

    // list[] = {10, 20, 30};
    // .add(index, element)
    list.add(1, 9); // 10 9 20 30

    // Adding Element at Particular index

    // Get Element Operation
    int element = list.get(1);
    System.out.println(element); // 9

    // Remove Element
    list.remove(0); // 10 will be removed
    // 9 20 30

    // Set Element at index
    list.set(1, 50);
    // arr[] = {9, 50, 30};

    // Contains Element
    System.out.println(list.contains(50)); // true

    System.out.println(list); // 9 50 30
  }
}
 