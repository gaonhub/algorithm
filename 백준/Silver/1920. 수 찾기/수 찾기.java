import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);

        int M = input.nextInt();

        for (int i = 0; i < M; i++) {
            int answer = 0;
            int start = 0, end = N - 1;
            int x = input.nextInt();
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == x) {
                    answer = 1;
                    break;
                }
                if (arr[mid] > x) end = mid - 1;
                else start = mid + 1;
            }
            System.out.println(answer);
        }
    }
}