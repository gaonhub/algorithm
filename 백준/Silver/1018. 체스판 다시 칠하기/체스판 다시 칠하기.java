import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // input 받기
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        input.nextLine();

        String[] board = new String[row];
        for (int i = 0; i < row; i++) board[i] = input.nextLine();

        // 체스판 자르기
        int sol = Integer.MAX_VALUE;
        for (int i = 0; i <= row - 8; i++) {
            for (int j = 0; j <= col - 8; j++) {
                // 체스판의 최소 비용 구하기
                int curSol = getSolution(i, j, board);
                // 전체 최적의 값과 비교하여 갱신하기
                if (sol > curSol) sol = curSol;
            }
        }

        System.out.println(sol);
        input.close();
    }
    
    public static int getSolution(int initRow, int initCol, String[] board) {
        String[] originBoard = {"WBWBWBWB", "BWBWBWBW"};
        int whiteSol = 0;
        for (int i = 0; i < 8; i++) {
            int row = initRow + i;
            for (int j = 0; j < 8; j++) {
                int col = initCol + j;
                if (board[row].charAt(col) != originBoard[row % 2].charAt(j)) whiteSol++;
            }
        }

        return Math.min(whiteSol, 64 - whiteSol);
    }
}
