import java.util.Arrays;
import java.util.Scanner;

  public class Main{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      int N = input.nextInt();
      int M = input.nextInt();

      int arr[][] = new int[N][M];

      for(int i=0; i<N; i++) {
        for(int j=0; j<M; j++) {
          arr[i][j] = input.nextInt();
        }
      }

      for(int i=0; i<N; i++) {
        for(int j=0; j<M; j++) {
          arr[i][j] += input.nextInt();
        }
      }

      for(int i=0; i<N; i++) {
        for(int j=0; j<M; j++) {
          System.out.printf("%d ",arr[i][j]);
        }
        System.out.println();
      }

      input.close();

    }
  }
