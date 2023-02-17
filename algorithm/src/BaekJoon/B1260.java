package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
/*
문제
그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.

입력
첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.

출력
첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.

예제 입력 1
4 5 1
1 2
1 3
1 4
2 4
3 4
예제 출력 1
1 2 4 3
1 2 3 4

예제 입력 2
5 5 3
5 4
5 2
1 2
3 4
3 1
예제 출력 2
3 1 2 5 4
3 1 4 2 5

예제 입력 3
1000 1 1000
999 1000
예제 출력 3
1000 999
1000 999
 */
public class B1260 {
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