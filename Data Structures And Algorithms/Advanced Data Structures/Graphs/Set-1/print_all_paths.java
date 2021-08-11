import java.io.*;
import java.util.*;

public class print_all_paths {
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

        int src = Integer.parseInt(br.readLine());
        int dest = Integer.parseInt(br.readLine());

        // write all your codes here
        boolean[] visit = new boolean[vtces];
        printpaths(graph, src, dest, visit, "");
    }

    public static void printpaths(ArrayList<Edge>[] graph, int src, int dest, boolean[] visit, String psf) {

        if (src == dest) {
            psf += src;
            System.out.println(psf);
            return;
        }

        visit[src] = true;

        for (Edge e : graph[src]) {
            if (!visit[e.nbr]) {
                printpaths(graph, e.nbr, dest, visit, psf + e.src);
            }
        }

        visit[src] = false;
    }

}