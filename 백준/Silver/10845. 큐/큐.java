import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();

    ArrayDeque<Integer> queue = new ArrayDeque<>();

    int N = input.nextInt();

    for (int i = 0; i < N; i++) {
      String command = input.next();

      switch (command) {
        case "push": {
          queue.offer(input.nextInt());
          break;
        }
        case "pop": {
          if (queue.isEmpty()) {
            sb.append(-1).append('\n');
          } else {
            sb.append(queue.poll()).append('\n');
          }
          break;
        }
        case "size": {
          sb.append(queue.size()).append('\n');
          break;
        }
        case "empty": {
          if (queue.isEmpty()) {
            sb.append(1).append('\n');
          } else {
            sb.append(0).append('\n');
          }
          break;
        }
        case "front": {
          if (queue.isEmpty()) {
            sb.append(-1).append('\n');
          } else {
            sb.append(queue.peekFirst()).append('\n');
          }
          break;
        }
        case "back": {
          if (queue.isEmpty()) {
            sb.append(-1).append('\n');
          } else {
            sb.append(queue.peekLast()).append('\n');
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
