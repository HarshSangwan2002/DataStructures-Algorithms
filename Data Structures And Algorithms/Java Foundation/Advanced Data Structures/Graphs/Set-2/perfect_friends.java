import java.io.*;
import java.util.*;

public class perfect_friends {

    public static class Edge {

        int src;
        int nbr;

        Edge(int src, int nbr) {

            this.src = src;
            this.nbr = nbr;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        // write your code here

        ArrayList<Edge>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int e = 0; e < k; e++) {
            String line = br.readLine();
            int v1 = Integer.parseInt(line.split(" ")[0]);
            int v2 = Integer.parseInt(line.split(" ")[1]);

            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        boolean[] visit = new boolean[n];

        for (int v = 0; v < n; v++) {
            if (!visit[v]) {
                ArrayList<Integer> list = new ArrayList<>();
                dfs(graph, v, list, visit);
                comps.add(list);
            }
        }

        int pairs = 0;

        for (int i = 0; i < comps.size(); i++) {
            for (int j = i + 1; j < comps.size(); j++) {
                int ct = comps.get(i).size() * comps.get(j).size();
                pairs += ct;
            }
        }

        System.out.println(pairs);
    }

    public static void dfs(ArrayList<Edge>[] graph, int src, ArrayList<Integer> list, boolean[] visit) {
        visit[src] = true;
        list.add(src);

        for (Edge e : graph[src]) {
            if (!visit[e.nbr]) {
                dfs(graph, e.nbr, list, visit);
            }
        }
    }
}