import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int N = input.nextInt();
    int M = input.nextInt();
    int max = 0;

    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = input.nextInt();
    }

    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        for (int k = j + 1; k < N; k++) {
          int sum = arr[i] + arr[j] + arr[k];

          if (sum <= M) {
            max = Math.max(max, sum);
          }
        }
      }
    }
    System.out.println(max);
  }
}
