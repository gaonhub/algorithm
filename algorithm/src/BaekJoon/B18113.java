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

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(in.readLine());
      int gb = Integer.parseInt(st.nextToken());

      if (gb > (2 * K)) {
        list.add(gb-(2*K));
      }
      if (2*K > gb && gb>K) {
        list.add(gb-K);
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
