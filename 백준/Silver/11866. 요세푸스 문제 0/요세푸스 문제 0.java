import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int N = input.nextInt();
    int K = input.nextInt();

    Queue<Integer> queue = new LinkedList<>();

    for (int i = 1; i <= N; i++) {
      queue.add(i);
    }

    StringBuilder sb = new StringBuilder();
    sb.append('<');

    while (queue.size() > 1) {
      for (int i = 0; i < K - 1; i++) {
        int num = queue.poll();
        queue.offer(num);
      }

      sb.append(queue.poll()).append(", ");
    }

    sb.append(queue.poll()).append('>');
    System.out.println(sb);
  }
}
