class Level_1_2 {
    public int solution(int[] numbers) {
        int [] arr = {0,1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int i = 0 ; i < arr.length; i++)
        {
            boolean flag = false;
            for(int j = 0; j < numbers.length; j++)
            {
                if(arr[i] == numbers[j])
                {
                    flag = true;
                }
            }
            if(!flag)
                sum += arr[i];
        }
        return sum;
    }
}
