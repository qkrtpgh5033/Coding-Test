class Level_1_26 {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        // 비밀지도 (수정)

        String[] answer = new String[n];

        for(int i = 0 ; i < arr1.length; i++)
        {

            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);

            if(binary.length() < n)
            {
                int length = n - binary.length();
                for(int j = 0 ; j < length; j++)
                {
                    binary = "0" + binary;
                }
            }

            answer[i] = binary.replaceAll("1","#").replaceAll("0"," ");

        }
        return answer;
    }
}

