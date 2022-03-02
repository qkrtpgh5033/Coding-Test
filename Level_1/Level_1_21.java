import java.util.*;

class Level_1_21 {
    public int[] solution(int N, int[] stages) {

        // 실패율 

        int[] answer = new int[N];
        int[] stageCount = new int[N];
        Map<Integer, Double> map = new HashMap<>();
        int total = stages.length;

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] == N + 1) { // 마지막 스테이지를 클리어한 것은 제외
                continue;
            }
            stageCount[stages[i] - 1]++;
        }

        for (int i = 0 ; i < stageCount.length; i++) {
            if (total == 0) {
                map.put(i, 0.0);
                continue;
            }
            map.put(i, (double)stageCount[i] / (double)total);
            total -= stageCount[i];
        }

        for (int i = 0; i < N; i++) {
            double max = -1;
            int maxKey = 0;

            for (int key : map.keySet()) {
                if (max < map.get(key)) {
                    max = map.get(key);
                    maxKey = key;
                }
            }

            answer[i] = maxKey + 1;
            map.remove(maxKey);
        }

        return answer;
    }
}
