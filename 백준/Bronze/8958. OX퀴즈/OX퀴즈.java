import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr[] = new String[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            int resultNum = 0;
            int tempNum = 0;
            for(int j = 0; j < arr[i].length(); j++) {
                char tempChar = arr[i].charAt(j);
                if(tempChar == 'O') {
                    tempNum++;
                } else if(tempChar == 'X') {
                    tempNum = 0;
                }
                resultNum += tempNum;
            }
            System.out.println(resultNum);
        }

    }
}