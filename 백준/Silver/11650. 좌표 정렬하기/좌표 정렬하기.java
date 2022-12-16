import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int N = input.nextInt();

    int[][] array = new int[N][2];

    for(int i = 0; i < N; i++) {

      array[i][0] = input.nextInt();
      array[i][1] = input.nextInt();
    }
    Arrays.sort(array, new Comparator<int[]>() {

      @Override
      public int compare(int[] o1, int[] o2) {
        if(o1[0] == o2[0])
          return o1[1] - o2[1];
        else
          return o1[0] - o2[0];
      }
    });
    for(int i = 0; i < N; i++) {
      System.out.println(array[i][0] + " " + array[i][1]);
    }
    input.close();
  }
}
