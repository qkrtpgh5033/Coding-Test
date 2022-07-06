package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 7
 * 1 6
 * 6 3
 * 3 5
 * 4 1
 * 2 4
 * 4 7
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        ArrayList<Integer> list[] = new ArrayList[num + 1];
        boolean[] check = new boolean[num + 1];
        int[] parents = new int[num + 1];

        for(int i = 1; i <= num; i++){
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < num-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            list[node1].add(node2);
            list[node2].add(node1);
        }

        for (int i = 1; i <= num; i++){
            if(!check[i]){
                dfs(list, parents, check, i );
            }
        }

        for(int i = 2; i <= num; i++)
            System.out.println(parents[i]);

    }

    private static void dfs(ArrayList<Integer>[] list, int[] parents, boolean[] check, int i) {
        if(check[i])
            return;

        check[i] = true;
        for (Integer index : list[i]) {

            if (!check[index]) {
                parents[index] = i;
                dfs(list, parents, check, index);
            }
        }
    }

}
