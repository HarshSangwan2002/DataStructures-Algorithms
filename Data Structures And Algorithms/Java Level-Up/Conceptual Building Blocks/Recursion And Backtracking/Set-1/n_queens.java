import java.util.*;

public class n_queens {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean[][] board = new boolean[n][n];
        // write your code here

        boolean[] cols = new boolean[n];
        boolean[] nd = new boolean[2 * n - 1];
        boolean[] rd = new boolean[2 * n - 1];

        solve(board, 0, cols, nd, rd, "");

        scn.close();
    }

    public static void solve(boolean[][] board, int r, boolean[] cols, boolean[] nd, boolean[] rd, String ans) {

        if (r == board.length) {
            System.out.println(ans + ".");
            return;
        }

        for (int c = 0; c < board[0].length; c++) {
            if (!cols[c] && !nd[r + c] && !rd[r - c + board.length - 1]) {
                board[r][c] = true;
                cols[c] = true;
                nd[r + c] = true;
                rd[r - c + board.length - 1] = true;
                solve(board, r + 1, cols, nd, rd, ans + r + "-" + c + ", ");
                cols[c] = false;
                nd[r + c] = false;
                rd[r - c + board.length - 1] = false;
                board[r][c] = false;
            }
        }
    }

}