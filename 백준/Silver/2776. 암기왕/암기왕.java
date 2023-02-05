import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());

    for(int a=0; a<T; a++){
      StringBuilder sb = new StringBuilder();
      int note1 = Integer.parseInt(br.readLine());
      int[] list = new int[note1 + 1];

      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int i=0; i<note1; i++)
        list[i] = Integer.parseInt(st.nextToken());

      Arrays.sort(list);
      int note2 = Integer.parseInt(br.readLine());

      st = new StringTokenizer(br.readLine());
      for(int i=0; i<note2; i++){

        int left = 0, right = note1, val = Integer.parseInt(st.nextToken());
        boolean find = false;

        while(left <= right){
          int mid = (left + right) / 2;

          if(list[mid] == val){
            find = true;
            break;
          }
          else if(list[mid] < val)
            left = mid + 1;
          else
            right = mid - 1;
        }

        sb.append(find? 1 : 0).append("\n");
      }

      System.out.print(sb);
    }
  }
}
