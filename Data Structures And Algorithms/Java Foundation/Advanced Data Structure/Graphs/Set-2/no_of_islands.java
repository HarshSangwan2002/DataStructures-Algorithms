import java.io.*;
import java.util.*;

public class no_of_islands {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            String parts = br.readLine();
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
            }
        }

        // write your code here
        boolean[][] visit = new boolean[arr.length][arr[0].length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    if (!visit[i][j]) {
                        dfs(arr, i, j, visit);
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

    public static void dfs(int[][] arr, int i, int j, boolean[][] visit) {

        if (i < 0 || j < 0 || i == arr.length || j == arr[0].length || arr[i][j] == 1 || visit[i][j] == true)
            return;

        visit[i][j] = true;

        dfs(arr, i + 1, j, visit);
        dfs(arr, i - 1, j, visit);
        dfs(arr, i, j + 1, visit);
        dfs(arr, i, j - 1, visit);
    }

}