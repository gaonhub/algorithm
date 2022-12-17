import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
        
		Deque<Integer> dq = new LinkedList<>();

		int N = input.nextInt();

		for (int i = 0; i < N; i++) {
			String command = input.next();

			switch (command) {
			case "push_front": {
				dq.addFirst(input.nextInt());
				break;
			}
			case "push_back": {
				dq.addLast(input.nextInt());
				break;
			}
			case "pop_front": {
				if (dq.isEmpty()) {
					sb.append(-1).append('\n');

				} else {
					sb.append(dq.removeFirst()).append('\n');
				}
				break;
			}
			case "pop_back": {
				if (dq.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(dq.removeLast()).append('\n');
				}
				break;
			}
			case "size": {
				sb.append(dq.size()).append('\n');
				break;
			}
			case "empty": {
				if (dq.isEmpty()) {
					sb.append(1).append('\n');
				} else {
					sb.append(0).append('\n');
				}
				break;
			}
			case "front": {
				if (dq.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(dq.peekFirst()).append('\n');
				}
				break;
			}
			case "back": {
				if (dq.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(dq.peekLast()).append('\n');
				}
				break;
			}
			default:
				break;
			}
		}
		System.out.println(sb);
	}
}