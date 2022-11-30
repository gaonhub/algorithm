package BaekJoon;
import java.util.Scanner;

public class B2739 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    input.close();

    for(int i=1; i<10; i++){
      System.out.println(a + " * " + i + " = " + (a * i));
    }
  }
}
