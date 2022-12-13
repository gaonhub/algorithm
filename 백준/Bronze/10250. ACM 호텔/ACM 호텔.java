import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num = input.nextInt();

    for (int i = 0; i < num; i++) {
      int H = input.nextInt();
      int W = input.nextInt();
      int N = input.nextInt();

      if(N % H == 0) {
        System.out.println((H * 100) + (N / H));

      } else {
        System.out.println(((N % H) * 100) + ((N / H) + 1));
      }
    }
  }
}
