import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] arr = new String[Integer.parseInt(br.readLine())];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < arr.length; i++) {
      arr[i] = st.nextToken();
    }

    Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

    if (arr[0].equals("0")) {
      System.out.println(0);
    } else {
      StringBuilder sb = new StringBuilder();
      for (String e : arr) {
        sb.append(e);
      }
      System.out.println(sb);
    }


  }
}
