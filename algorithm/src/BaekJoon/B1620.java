package BaekJoon;

import java.io.*;
import java.util.*;

public class B1620 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(st.nextToken());

    int M = Integer.parseInt(st.nextToken());

    HashMap<String,String> hashMap = new HashMap<>();

    for (int i = 0; i < N; i++) {
      String s = br.readLine();
      String num = Integer.toString(i+1);

      hashMap.put(s,num);
      hashMap.put(num,s);
    }
    for (int i = 0; i < M; i++) {
      sb.append(hashMap.get(br.readLine())).append('\n');
    }

    System.out.println(sb);
  }
}