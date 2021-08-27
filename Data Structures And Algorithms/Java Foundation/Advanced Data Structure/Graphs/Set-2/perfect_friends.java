import java.io.*;
import java.util.*;

public class perfect_friends {

    public static class Edge {

        int v;
        int n;

        Edge(int v, int n) {

            this.v = v;
            this.n = n;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        // write your code here
        ArrayList<Edge>[] graph = new ArrayList[n];

        for (int v = 0; v < n; v++) {
            graph[v] = new ArrayList<>();
        }

        for (int i = 0; i < k; i++) {
            String line = br.readLine();
            int v1 = Integer.parseInt(line.split(" ")[0]);
            int v2 = Integer.parseInt(line.split(" ")[1]);

            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        boolean[] visit = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                ArrayList<Integer> list = new ArrayList<>();
                dfs(graph, i, visit, list);
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

    public static void dfs(ArrayList<Edge>[] graph, int src, boolean[] visit, ArrayList<Integer> list) {

        visit[src] = true;
        list.add(src);

        for (Edge e : graph[src]) {
            if (!visit[e.n]) {
                dfs(graph, e.n, visit, list);
            }
        }
    }

}