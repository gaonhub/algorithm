import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int N = input.nextInt();

    ArrayList<Integer> list = new ArrayList<Integer>();

    for (int i = 0; i < N; i++) {
      list.add(input.nextInt());
    }
    input.close();

//    System.out.println(list);
    Collections.sort(list);

    StringBuilder sb = new StringBuilder();

    for (int sort : list) {
      sb.append(sort).append('\n');
    }
    System.out.println(sb);
  }
}
