import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Stack<Integer> stack = new Stack<Integer>();

    int K = input.nextInt();

    for(int i = 0; i < K; i++) {
      int number = input.nextInt();

      if(number == 0) {
        stack.pop();
      }
      else {
        stack.push(number);
      }
    }
    int sum = 0;

    for(int o : stack) {
      sum += o;
    }

    System.out.println(sum);
  }
}
