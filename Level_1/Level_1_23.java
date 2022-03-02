import java.util.*;
class Level_1_23 {
    public int solution(int[] nums) {

        // 폰켓몬 (Set 풀이)
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums)
        {
            set.add(i);
        }

        int selectLen = nums.length / 2;


        if(set.size() >= selectLen)
            return selectLen;
        else
            return set.size();


    }
}
