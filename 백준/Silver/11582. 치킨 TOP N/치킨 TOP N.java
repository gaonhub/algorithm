import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(Integer.parseInt(st.nextToken()));
    }
    int k = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i += n / k) {
      list.subList(i, i + n / k).sort(Comparator.naturalOrder());
    }

    for (int i : list) {
      bw.write(i + " ");
    }
    bw.flush();
    br.close();
    bw.close();
  }
}
