package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
문제
연종이는 엄청난 기억력을 가지고 있다. 그래서 하루 동안 본 정수들을 모두 기억 할 수 있다. 하지만 이를 믿을 수 없는 동규는 그의 기억력을 시험해 보기로 한다. 동규는 연종을 따라 다니며, 연종이 하루 동안 본 정수들을 모두 ‘수첩1’에 적어 놓았다. 그것을 바탕으로 그가 진짜 암기왕인지 알아보기 위해, 동규는 연종에게 M개의 질문을 던졌다. 질문의 내용은 “X라는 정수를 오늘 본 적이 있는가?” 이다. 연종은 막힘없이 모두 대답을 했고, 동규는 연종이 봤다고 주장하는 수 들을 ‘수첩2’에 적어 두었다. 집에 돌아온 동규는 답이 맞는지 확인하려 하지만, 연종을 따라다니느라 너무 힘들어서 여러분에게 도움을 요청했다. 동규를 도와주기 위해 ‘수첩2’에 적혀있는 순서대로, 각각의 수에 대하여, ‘수첩1’에 있으면 1을, 없으면 0을 출력하는 프로그램을 작성해보자.

입력
첫째 줄에 테스트케이스의 개수 T가 들어온다. 다음 줄에는 ‘수첩 1’에 적어 놓은 정수의 개수 N(1 ≤ N ≤ 1,000,000)이 입력으로 들어온다. 그 다음 줄에  ‘수첩 1’에 적혀 있는 정수들이 N개 들어온다. 그 다음 줄에는 ‘수첩 2’에 적어 놓은 정수의 개수 M(1 ≤ M ≤ 1,000,000) 이 주어지고, 다음 줄에 ‘수첩 2’에 적어 놓은 정수들이 입력으로 M개 들어온다. 모든 정수들의 범위는 int 로 한다.

출력
‘수첩2’에 적혀있는 M개의 숫자 순서대로, ‘수첩1’에 있으면 1을, 없으면 0을 출력한다.

예제 입력 1
1
5
4 1 5 2 3
5
1 3 7 9 5

예제 출력 1
1
1
0
0
1
 */
public class B2776 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine()); // 테스트 개수

    for(int a=0; a<T; a++){
      StringBuilder sb = new StringBuilder();
      int note1 = Integer.parseInt(br.readLine()); // 수첩1 정수 개수
      int[] list = new int[note1 + 1];

      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int i=0; i<note1; i++)
        list[i] = Integer.parseInt(st.nextToken());

      Arrays.sort(list);
      int note2 = Integer.parseInt(br.readLine()); // 수첩2 정수 개수

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
