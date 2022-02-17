import java.util.*;
class Level_1_23 {
    public int solution(int[] nums) {

        // 폰켓몬 (ArrayList 풀이)
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : nums)
        {
            if(!list.contains(i)) // 핵심
                list.add(i);
        }

        int selectLen = nums.length / 2;


        if(list.size() >= selectLen)
            return selectLen;
        else
            return list.size();


    }
}