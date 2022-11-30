import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arr = new int[8];
    String res= "";

    for(int i=0; i<arr.length; i++) {
      arr[i] = input.nextInt();
    }

    for(int i=0; i<arr.length-1; i++) {
      if(arr[i + 1] == arr[i] + 1) {
        res = "ascending";
      }else if(arr[i + 1]==arr[i] - 1) {
        res = "descending";
      }else {
        res = "mixed";
        break;
      }
    }
    System.out.println(res);
  }
}