package DataStructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * 이중 우선순위 큐  - 7662번
 */



public class Problem_7662 {

    static int removeValue(HashMap<Integer, Integer> hashMap, PriorityQueue<Integer> q) {
        int key;
        while (true){
            key = q.poll();
            int cnt = hashMap.getOrDefault(key, 0);
            if(cnt == 0)
                continue;

            if(cnt == 1)
                hashMap.remove(key);
            else // 중복개수
                hashMap.put(key, cnt - 1);
            break;

        }
        return key;
    }
    static String[] strSplit(String str, String regex){
        return str.split(regex);
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer,Integer> hashMap;
        PriorityQueue<Integer> maxQueue;
        PriorityQueue<Integer> minQueue;

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){

            int testDataCount = Integer.parseInt(br.readLine());
            maxQueue = new PriorityQueue<>(Collections.reverseOrder());
            minQueue = new PriorityQueue<>();
            hashMap = new HashMap<>();
            for(int j = 0; j < testDataCount; j++){
                String str = br.readLine();
                String[] split = strSplit(str, " ");

                char mode = split[0].charAt(0);
                int num = Integer.parseInt(split[1]);


                if(mode == 'I'){
                    maxQueue.add(num);
                    minQueue.add(num);
                    hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);

                }
                else if(mode == 'D'){
                    int removeMode = num;

                    if(hashMap.size() == 0) // 삭제할게 없을 때
                        continue;

                    if(removeMode == 1){
                        removeValue(hashMap, maxQueue);
                    }
                    else if(removeMode == -1){
                        removeValue(hashMap, minQueue);
                    }
                }
            }

            if(hashMap.size() == 0)
                sb.append("EMPTY\n");
            else{
                int res = removeValue(hashMap, maxQueue);
                sb.append(res+" "); // 최댓값
                if(hashMap.size()>0) res = removeValue(hashMap, minQueue);
                sb.append(res+"\n"); // 최솟값
            }

        }

        System.out.println(sb.toString());

    }
}
