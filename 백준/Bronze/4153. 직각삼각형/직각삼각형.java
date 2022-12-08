import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int hypotenuse;
    int sideA;
    int sideB;

    while (true) {

      int a = input.nextInt();
      int b = input.nextInt();
      int c = input.nextInt();

      if (a == 0 && b == 0 && c == 0) {
        break;
      }

      if (a >= b && a >= c) {
        hypotenuse = a;
        sideA = b;
        sideB = c;
      } else if (b >= a && b >= c) {
        hypotenuse = b;
        sideA = a;
        sideB = c;
      } else {
        hypotenuse = c;
        sideA = a;
        sideB = b;
      }

      if (Math.pow(hypotenuse, 2) == (Math.pow(sideA, 2)) + (Math.pow(sideB, 2))) {
        System.out.println("right");
      } else {
        System.out.println("wrong");
      }
    }
    input.close();
  }
}
