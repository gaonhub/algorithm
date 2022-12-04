import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int pnum;
        int cnt=0;
        for(int i=0; i<num; i++){
            pnum = input.nextInt();
            for(int j=2; j<=pnum; j++){
                if(j == pnum){
                    cnt++;
                }
                if(pnum % j == 0){
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}