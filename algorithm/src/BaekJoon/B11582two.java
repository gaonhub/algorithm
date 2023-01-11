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
    int k = low;

    while(i <= middle && j <= high) {
      if(arr[i].compareTo(arr[j]) < 0) {
        sort[k++]=arr[i++];
      } else {
        sort[k++]=arr[j++];
      }
    }

    while(i <= middle) {
      sort[k++] = arr[i++];
    }
    while(j <= high) {
      sort[k++] = arr[j++];
    }

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
