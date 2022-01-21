class Level_1_8 {
    public long solution(long n) {

//             방법 1
//         long answer = 0;
//         for(long i = 0 ; i <= n; i++)
//         {

//             if(i*i == n)
//             {
//                 answer = (i+1) * (i+1);
//                 break;
//             }
//             else 
//                 answer = -1;
//         }
//         return answer;

        //방법 2
        double num = Math.sqrt(n); // 제곱근
        if(num % 1 > 0 ) // 제곱근 유무 확인
            return -1;
        else{

            long answer = (long) Math.pow(num+1, 2); //제곱
            return answer;
        }


    }
}