import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
  private static StringBuilder sb = new StringBuilder();

  private static boolean[][] arr;
  private static boolean[] dCheck;
  private static boolean[] bCheck;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int node = Integer.parseInt(st.nextToken());
    int line = Integer.parseInt(st.nextToken());
    int start = Integer.parseInt(st.nextToken());
    arr = new boolean[node + 1][node + 1];
    dCheck = new boolean[node + 1];
    bCheck = new boolean[node + 1];

    int tempA;
    int tempB;
    for (int i = 0; i < line; i++) {
      st = new StringTokenizer(br.readLine());
      tempA = Integer.parseInt(st.nextToken());
      tempB = Integer.parseInt(st.nextToken());

      arr[tempA][tempB] = true;
      arr[tempB][tempA] = true;
    }
    br.close();

    dfsRecursion(start);
    System.out.println(sb);

    bfs(start);

  }

  private static void dfsStack(int start) {
    StringBuilder sb = new StringBuilder();
    Stack<Integer> st = new Stack<>();
    st.push(start);
    dCheck[start] = true;
    sb.append(start).append(' ');

    while (!st.isEmpty()) {
      int temp = st.peek();
      boolean flag = false;

      for (int i = 0; i < arr.length; i++) {
        if (arr[temp][i] && !dCheck[i]) {
          st.push(i);
          sb.append(i).append(' ');
          dCheck[i] = true;
          flag = true;
          break;
        }
      }
      if (!flag) {
        st.pop();
      }
    }
    System.out.println(sb);
  }

  private static void dfsRecursion(int start) {
    dCheck[start] = true;
    sb.append(start).append(' ');

    for (int i = 0; i < arr.length; i++) {
      if (arr[start][i] && !dCheck[i]) {
        dfsRecursion(i);
      }
    }
  }

  private static void bfs(int start) {
    StringBuilder sb = new StringBuilder();
    Queue<Integer> q = new LinkedList<>();
    q.offer(start);
    bCheck[start] = true;

    while (!q.isEmpty()) {
      int temp = q.poll();
      sb.append(temp).append(' ');

      for (int i = 0; i < arr.length; i++) {
        if (arr[temp][i] && !bCheck[i]) {
          q.offer(i);
          bCheck[i] = true;
        }
      }
    }
    System.out.println(sb);
  }
}