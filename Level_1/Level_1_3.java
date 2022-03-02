class Level_1_3 {
    public int solution(int[] nums) {

        int cnt = 0;
        for(int i = 0 ; i < nums.length-2; i++)
        {

            for(int j = i+1 ; j < nums.length-1; j++)
            {
                for(int k = j+1; k < nums.length; k++)
                {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isprime(sum) == true)
                        cnt++;
                }

            }
        }
        return cnt;
    }

    public boolean isprime(int num)
    {
        for(int i = 2; i < num; i++)
        {
            if( num % i == 0)
                return false; // 소수아님
        }
        return true; // 소수
    }
}
