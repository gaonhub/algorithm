package BaekJoon;

import java.util.Scanner;
/*
문제
자연수 N과 정수 K가 주어졌을 때 이항 계수
\(\binom{N}{K}\)를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 \(N\)과 \(K\)가 주어진다. (1 ≤ \(N\) ≤ 10, 0 ≤ \(K\) ≤ \(N\))

출력

\(\binom{N}{K}\)를 출력한다.

예제 입력 1
5 2
예제 출력 1
10

 */
public class B11050 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int N = input.nextInt();
    int K = input.nextInt();

    System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
  }

  private static int factorial(int n) {
    if (n <= 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }
}
