import java.io.*;
import java.util.*;

public class is_cylic {
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

        Pair(int v, String psf) {
            this.v = v;
            this.psf = psf;
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

        boolean[] visit = new boolean[vtces];

        for (int v = 0; v < vtces; v++) {
            if (!visit[v]) {
                if (bfs(graph, v, visit)) {
                    System.out.println("true");
                    System.exit(0);
                }
            }
        }

        System.out.println("false");
    }

    public static boolean bfs(ArrayList<Edge>[] graph, int src, boolean[] visit) {
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(src, src + ""));

        while (q.size() != 0) {
            Pair r = q.remove();

            if (visit[r.v])
                return true;

            else {
                visit[r.v] = true;

                for (Edge e : graph[r.v]) {
                    if (!visit[e.nbr]) {
                        q.add(new Pair(e.nbr, r.psf + e.nbr));
                    }
                }
            }
        }

        return false;
    }
}