package DeliveryHero;

import java.util.Arrays;

public class N2 {
    public int[] solution(String[] B) {
        int row = B.length;
        int col = B[0].length();
        String[][] board = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                board[i][k] = Arrays.toString(B[i].split(""));
            }
        }
        int[] R = new int[3];
        //R[0] Patrol Boats
        //R[1] Submarins
        //R[2] Destoryers
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                if (board[i][k].equals("#") && isEmpty(board, i + 1, k, row, col)
                        && isEmpty(board, i, k + 1, row, col)) {

                }
            }
        }
        
    }

    private boolean isEmpty(String[][] board, int i, int k, int row, int col) {
        if (i < 0 || k < 0 || i >= row || k >= col) {
            return true;
        }

        return board[i][k].equals(".");
    }
}
}
