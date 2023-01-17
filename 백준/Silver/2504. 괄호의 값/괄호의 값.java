import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.next();
 
    Stack<Integer> st = new Stack<>();

    int temp = 1;
    int ans = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i)=='(') {
        st.add(2);
        temp *= 2;
      } else if (str.charAt(i)=='[') {
        st.add(3);
        temp *= 3;
      } else {
        if (st.size()==0) {
          ans=0;
          break;
        }

        if (str.charAt(i)!=']' && str.charAt(i)!=')') {
          ans=0;
          break;
        }

        if ((str.charAt(i)==']' && st.peek()==2) || (str.charAt(i)==')' && st.peek()==3)) {
          ans=0;
          break;
        }

        int cur=2;
        if (str.charAt(i)==']') {
          cur=3;
        }

        if (st.size()==0 || (str.charAt(i-1)=='(' && cur==2) || (str.charAt(i-1)=='[' && cur==3)) {
          ans+=temp;
        }
        st.pop();
        temp /= cur;

      }

    }

    if (st.size()!=0) {
      ans=0;
    }

    System.out.println(ans);
  }
}
