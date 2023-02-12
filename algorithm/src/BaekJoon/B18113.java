package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
/*
문제
정래는 김밥가게 “그르다 김가놈”에 납품할 김밥을 만드는 김밥 공장을 운영한다. 정래는 김밥 양쪽 끝을 “꼬다리”라고 부른다. 그리고 꼬다리를 잘라낸 김밥을 “손질된 김밥”이라고 부른다.

공장에서는 김밥 N개에 대해서, 김밥 꼬다리를 잘라내고 손질된 김밥을 김밥조각으로 만드는 작업을 한다. 꼬다리를 잘라낼 때에는 양쪽에서 균일하게 K cm만큼 잘라낸다. 만약 김밥의 길이가 2K cm보다 짧아서 한쪽밖에 자르지 못한다면, 한쪽만 꼬다리를 잘라낸다. 김밥 길이가 K cm이거나 그보다 짧으면 그 김밥은 폐기한다.

손질된 김밥들은 모두 일정한 길이 P로 잘라서 P cm의 김밥조각들로 만든다. P는 양의 정수여야 한다. 정래는 일정한 길이 P cm로 자른 김밥조각을 최소 M개 만들고 싶다. P를 최대한 길게 하고 싶을 때, P는 얼마로 설정해야 하는지 구하시오.

입력
첫 번째 줄에 손질해야 하는 김밥의 개수 N, 꼬다리의 길이 K, 김밥조각의 최소 개수 M이 주어진다. (1 ≤ N ≤ 106, 1 ≤ K, M ≤ 109, N, K, M은 정수)

두 번째 줄부터 김밥의 길이 L이 N개 주어진다. (1 ≤ L ≤ 109, L은 정수)

출력
김밥조각의 길이 P를 최대로 할 때, P를 출력한다. 만족하는 P가 없는 경우, -1을 출력한다.

예제 입력 1
3 6 4
20
10
3
예제 출력 1
2

예제 입력 2
3 8 1
16
7
8
예제 출력 2
-1
 */
public class B18113 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(in.readLine());

    int N = Integer.parseInt(st.nextToken()); // 김밥의 개수
    int K = Integer.parseInt(st.nextToken()); // 꼬다리의 길이
    int M = Integer.parseInt(st.nextToken()); // 최소 개수
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(in.readLine());
      int length = Integer.parseInt(st.nextToken());

      if (length > (2 * K)) {
        list.add(length - (2 * K));
      }
      if (2 * K > length && length > K) {
        list.add(length - K);
      }
    }

    int start = 1, end = 1000000000;
    int ans = -1;

    while (start <= end) {
      int mid = (start + end) / 2;

      int sum = 0;
      for (int k : list) {
        sum += (k / mid);
      }

      if (sum >= M) {
        ans = mid;
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    System.out.println(ans);
  }
}
