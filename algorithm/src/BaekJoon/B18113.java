package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

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
