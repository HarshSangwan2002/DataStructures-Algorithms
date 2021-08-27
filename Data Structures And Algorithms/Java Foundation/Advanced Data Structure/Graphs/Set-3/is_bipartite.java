import java.io.*;
import java.util.*;

public class is_bipartite {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static class Pair {

        int v;
        String psf;
        int lvl;

        Pair(int v, String psf, int lvl) {

            this.v = v;
            this.psf = psf;
            this.lvl = lvl;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        // write your code here
        int[] visit = new int[vtces];
        Arrays.fill(visit, -1);

        for (int v = 0; v < vtces; v++) {
            if (visit[v] == -1) {
                if (bfs(graph, v, visit) == false) {
                    System.out.println("false");
                    System.exit(0);
                }
            }
        }

        System.out.println("true");
    }

    public static boolean bfs(ArrayList<Edge>[] graph, int src, int[] visit) {

        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(src, src + "", 0));

        while (q.size() != 0) {
            Pair rm = q.remove();

            if (visit[rm.v] != -1) {
                if (visit[rm.lvl] != rm.lvl)
                    return false;
            }

            else {
                visit[rm.v] = rm.lvl;
            }

            for (Edge e : graph[rm.v]) {
                if (visit[e.nbr] == -1) {
                    q.add(new Pair(e.nbr, rm.psf + e.nbr, rm.lvl + 1));
                }
            }
        }

        return true;
    }
}