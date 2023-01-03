import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num = input.nextInt();

    int[][] arr = new int[num][2];

    for (int i = 0; i < num; i++) {
      arr[i][0] = input.nextInt();
      arr[i][1] = input.nextInt();
    }

    for (int i = 0; i < num; i++) {
      int rank = 1;
      for (int j = 0; j < num; j++) {
        if (i == j) {
          continue;
        } else if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
          rank++;
        }
      }
      System.out.print(rank + " ");
    }
  }
}
