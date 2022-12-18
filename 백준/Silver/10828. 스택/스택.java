import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();

    Stack<Integer> stack = new Stack<>();

    int N = input.nextInt();

    for (int i = 0; i < N; i++) {
      String command = input.next();

      switch (command) {
        case "push": {
          stack.push(input.nextInt());
          break;
        }
        case "pop": {
          if (stack.isEmpty()) {
            sb.append(-1).append('\n');
          } else {
            sb.append(stack.pop()).append('\n');
          }
          break;
        }
        case "size": {
          sb.append(stack.size()).append('\n');
          break;
        }
        case "empty": {
          if (stack.isEmpty()) {
            sb.append(1).append('\n');
          } else {
            sb.append(0).append('\n');
          }
          break;
        }
        case "top": {
          if (stack.isEmpty()) {
            sb.append(-1).append('\n');
          } else {
            sb.append(stack.peek()).append('\n');
          }
          break;
        }
        default:
          break;
      }
    }
    System.out.println(sb);
  }
}
