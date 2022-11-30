import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();

    for(int i=0; i<n; i++){
      int num = input.nextInt();
      String str = input.next();

      for(int j=0; j<str.length(); j++){
        for(int k=0; k<num; k++){
          System.out.print(str.charAt(j));
        }
      }
      System.out.println();
    }
  }
}