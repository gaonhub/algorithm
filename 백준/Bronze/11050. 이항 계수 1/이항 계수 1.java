import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int N = input.nextInt();
    int K = input.nextInt();

    System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
  }

  private static int factorial(int n) {
    if (n <= 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }
}
