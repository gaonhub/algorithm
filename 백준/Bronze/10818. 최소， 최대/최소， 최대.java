import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int min = 100001, max = -1000001;

        for(int i = 0; i < a; i++) {
            int x = input.nextInt();
            if(x < min) min = x;
            if(x > max) max = x;
        }

        System.out.println(min + " " + max);
    }
}