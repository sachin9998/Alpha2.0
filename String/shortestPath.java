public class shortestPath {

  public static int get_ShortestPath(String str) {

    int x = 0, y = 0;

    for (int i = 0; i < str.length(); i++) {
      char direction = str.charAt(i);

      if (direction == 'S') {
        y--;
      } else if (direction == 'N') {
        y++;
      } else if (direction == 'W') {
        x--;
      } else {
        x++;
      }

    }

    int X2 = x * x;
    int Y2 = y * y;
    int ans = (int) Math.sqrt(X2 + Y2);
    return ans;
  }

  public static void main(String[] args) {

    String path = "WNEENESENNN";
    String ano = "NS";
    int ans = get_ShortestPath(path);
    int ans1 = get_ShortestPath(ano);
    System.out.println("The Shortest path is " + ans);
    System.out.println("The Shortest path is " + ans1);
  }
}
