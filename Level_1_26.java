class Level_1_26 {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        // 비밀지도

        String[] answer = new String[n];

        for(int i = 0 ; i < arr1.length; i++)
        {

            String binary1 = Integer.toBinaryString(arr1[i]);
            String binary2 = Integer.toBinaryString(arr2[i]);

            String binary1_m = "";
            String binary2_m = "";

            if(binary1.length() < n)
            {
                int length = n - binary1.length();
                for(int j = 0 ; j < length; j++)
                {
                    binary1_m += "0";
                }
                binary1 = binary1_m + binary1;
            }

            if(binary2.length() < n)
            {
                int length = n - binary2.length();
                for(int j = 0 ; j < length; j++)
                {
                    binary2_m += "0";
                }
                binary2 = binary2_m + binary2;
            }


            String secret = "";
            for(int j = 0; j  < n; j++)
            {
                if(binary1.charAt(j) == '1' || binary2.charAt(j) == '1')
                    secret += "#";
                else
                    secret += " ";
            }

            answer[i] = secret;


        }
        return answer;
    }
}

