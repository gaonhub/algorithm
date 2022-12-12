import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int N = input.nextInt();

    String arr[][] = new String[N][2];

    for (int i = 0; i < arr.length; i++) {
      arr[i][0] = input.next();
      arr[i][1] = input.next();
    }

    Arrays.sort(arr, new Comparator<String[]>() {
      @Override
      public int compare(String[] o1, String[] o2) {
        return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
      }
    });

    for (int i = 0; i < N; i++) {
      System.out.println(arr[i][0] + " " + arr[i][1]);
    }
  }
}
