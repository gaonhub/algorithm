import java.util.Scanner;
import java.util.Stack;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.println(pCheck(input.next()));
		}
	}
 
	public static String pCheck(String p) {
 
		Stack<Character> stack = new Stack<>();
 
		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == '(') {
				stack.push(p.charAt(i));
			} else if (stack.empty()) {
				return "NO";
			} else {
				stack.pop();
			}
		}
 
		if (stack.empty()) {
			return "YES";
		} else {
			return "NO";
		}
	}
}