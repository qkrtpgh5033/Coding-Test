package DataStructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 생태학  - 4358번
 */



public class Problem_4358 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String,Integer> hashMap = new HashMap<>();
        int cnt = 0;

        /**
         * 언제 종료하는지 문제에서 주어진게 없음.
         */
        while (true) {
            String str = br.readLine();
            if(str == null || str.equals(""))
                break;

            hashMap.put(str, hashMap.getOrDefault(str, 0) +1);
            cnt++;
        }

        Object[] keySets = hashMap.keySet().toArray();
        Arrays.sort(keySets);

        for(int i = 0; i < keySets.length; i++){
            int value = hashMap.get(keySets[i]);
            double per = (double)(value*100.0) / cnt;
            sb.append(keySets[i] + " " + String.format("%.4f", per) + "\n");
        }
        System.out.println(sb.toString());


    }
}
