import java.util.*;

public class gold_mine {
    static int max = 0;

    public static void getMaxGold(int[][] arr) {
        // write your code here

        boolean[][] visit = new boolean[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 0 && !visit[i][j]) {
                    ArrayList<Integer> bag = new ArrayList<>();

                    dfs(arr, i, j, bag, visit);

                    int s = 0;
                    for (int val : bag)
                        s += val;

                    if (s > max)
                        max = s;
                }
            }
        }
    }

    public static void dfs(int[][] arr, int i, int j, ArrayList<Integer> bag, boolean[][] visit) {

        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == 0 || visit[i][j])
            return;

        visit[i][j] = true;
        bag.add(arr[i][j]);

        dfs(arr, i + 1, j, bag, visit);
        dfs(arr, i - 1, j, bag, visit);
        dfs(arr, i, j - 1, bag, visit);
        dfs(arr, i, j + 1, bag, visit);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        getMaxGold(arr);
        System.out.println(max);

        scn.close();
    }

}