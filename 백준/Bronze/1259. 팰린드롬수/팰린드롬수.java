import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    while (true) {
      String str = input.next();

      if (str.equals("0")) {
        break;
      }

      boolean check = true;
        
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
           check = false;
           break;
        }
      }

      if (check == true) {
        System.out.println("yes");
      } else{
        System.out.println("no");
      }
    }
  }
}
