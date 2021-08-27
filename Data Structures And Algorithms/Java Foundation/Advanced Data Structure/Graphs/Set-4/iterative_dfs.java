import java.io.*;
import java.util.*;

public class iterative_dfs {
    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
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
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        int src = Integer.parseInt(br.readLine());

        // write your code here
        Stack<Pair> st = new Stack<>();
        boolean[] visit = new boolean[vtces];
        st.push(new Pair(src, src + ""));

        while (st.size() != 0) {
            Pair p = st.pop();

            if (visit[p.v])
                continue;

            visit[p.v] = true;
            System.out.println(p.v + "@" + p.psf);

            for (Edge e : graph[p.v]) {
                if (!visit[e.nbr]) {
                    st.push(new Pair(e.nbr, p.psf + e.nbr));
                }
            }
        }
    }
}