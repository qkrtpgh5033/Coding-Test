package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 백준 - 트리의 부모 찾기
 *
 * 7
 * 1 6
 * 6 3
 * 3 5
 * 4 1
 * 2 4
 * 4 7
 */
public class Problem_11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());


        // 길이에 +1 해주는 이유 -> 루트 노드는 이미 1로 고정.
        ArrayList<Integer> list[] = new ArrayList[num + 1];
        boolean[] check = new boolean[num + 1];


        // parents[a] = b --> a노드의 부모노드는 b
        int[] parents = new int[num + 1];

        // 루트노드 1이 고정
        for(int i = 1; i <= num; i++){
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < num-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            // 서로 연결 (양방향 매핑)
            list[node1].add(node2);
            list[node2].add(node1);
        }

        for (int i = 1; i <= num; i++){
            if(!check[i]){
                dfs(list, parents, check, i );
            }
        }


        // 루트 노드는 1로 이미 고정이고, 연결된 부모 노드를 출력
        // 1은 루트 노드이기 떄문에 부모 노드가 업고
        // 2는 무조건 루트 노드가 1이기 때문에 이는 고려 X
        // 따라서 문제에서 주어진 예제 출력대로 할려면 인덱스 2번째 부터 해야 됨.
        for(int i = 2; i <= num; i++)
            System.out.println(parents[i]);

    }

    private static void dfs(ArrayList<Integer>[] list, int[] parents, boolean[] check, int i) {
        if(check[i])
            return;
        System.out.println("--------------------------");
        System.out.println("i = " + i);
        check[i] = true;

        for (Integer index : list[i]) {
            System.out.println("i = " + i + ",  index = " + index);
            if (!check[index]) {

                parents[index] = i;
                dfs(list, parents, check, index);
            }
        }

    }

}
