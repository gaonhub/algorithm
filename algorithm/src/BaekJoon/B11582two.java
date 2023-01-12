package BaekJoon;

import java.util.Scanner;

public class B11582two {
  static int members;
  static int n;
  static String[] sort;

  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    n =  input.nextInt();

    String[] arr = new String[n];

    for(int i = 0; i < n; i++) {
      arr[i] = input.next();
    }

    members = input.nextInt();
    sort = new String[arr.length];

    mergeSort(arr,0,n-1);

    for(int i = 0; i < n; i++) {
      System.out.print(arr[i]+" ");
    }
  }

  public static void merge(String[] arr, int low, int middle, int high) {

    if(high - low > n / members) {
      return;
    }

    int i = low;
    int j = middle + 1;
    int k = low; // 임시 포인터

    while(i <= middle && j <= high) {
      // 왼쪽 부분리스트 i번째 원소가 오른쪽 부분리스트 j번째 원소보다 작거나 같을 경우
      // 왼쪽 i번째 원소를 새 배열에 넣고 i와 k를 1 증가시킨다.
      if(arr[i].compareTo(arr[j]) < 0) {
        sort[k++]=arr[i++];

      // 오른쪽 부분리스트 j번째 원소가 왼쪽 부분리스트 i번째 원소보다 작거나 같을 경우
      // 오른쪽 j번째 원소를 새 배열에 넣고 j와 k를 1 증가시킨다.
      } else {
        sort[k++]=arr[j++];
      }
    }

    // 왼쪽 부분리스트 원소가 아직 남아있을 경우(오른쪽 부분리스트가 먼저 모두 새 배열에 채워졌을 경우), 왼쪽 부분리스트의 나머지 원소들을 새 배열에 채워준다.
    while(i <= middle) {
      sort[k++] = arr[i++];
    }

    // 오른쪽 부분리스트 원소가 아직 남아있을 경우(왼쪽 부분리스트가 먼저 모두 새 배열에 채워졌을 경우), 오른쪽 부분리스트의 나머지 원소들을 새 배열에 채워준다.
    while(j <= high) {
      sort[k++] = arr[j++];
    }

    // 정렬된 새 배열을 기존의 배열에 복사하여 옮겨준다.
    for(int t = 0; t <= high; t++) {
      arr[t] = sort[t];
    }

  }

  public static void mergeSort(String[] arr, int n, int m) {
    if(n < m) {
      int middle = (n + m) / 2;
      mergeSort(arr,n,middle);
      mergeSort(arr,middle+1,m);
      merge(arr,n,middle,m);
    }
  }
}
