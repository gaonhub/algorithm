import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num = input.nextInt();
    int count = 0;

    if (num < 100) {
      System.out.println(num);
    } else {
      count = 99;

      for (int i = 100; i <= num; i++) {
        int hundreds = i / 100;
        int tens = (i/10) % 10;
        int ones = i % 10;

        if (hundreds - tens == tens - ones) {
          count++;
        }
      }
      System.out.println(count);
    }
  }
}
