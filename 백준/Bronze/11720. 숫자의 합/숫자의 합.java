import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        String str = input.next();
        int sum = 0;

        for(int i = 0; i< str.length(); i++){
            sum += str.charAt(i) - '0';
        }

        System.out.println(sum);

    }
}