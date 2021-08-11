import java.util.Scanner; 

/**
 * flood_fill
 */
public class flood_fill {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }

        int[][] visit = new int[n][m];

        flood(arr,0,0,"",visit);
        scn.close();
    }

    public static void flood(int[][] maze, int r, int c, String ans, int[][] visit)
    {
        if(r<0 || c<0 || r==maze.length || c==maze[0].length || maze[r][c]==1 || visit[r][c]==1)
        {
            return;
        }

        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(ans);
            return;
        }

        visit[r][c] = 1;
        flood(maze,r-1,c,ans+"t",visit);
        flood(maze,r,c-1,ans+"l",visit);
        flood(maze,r+1,c,ans+"d",visit);
        flood(maze,r,c+1,ans+"r",visit);
        visit[r][c] = 0;
    }
}