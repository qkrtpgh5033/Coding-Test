package String;

import java.util.Scanner;

public class Problem01_09 {

    public String solution(String str)
    {
        StringBuilder strBuilder = new StringBuilder();
        String reuslt = "";
        for(char ch : str.toCharArray())
        {
            boolean isDigit = Character.isDigit(ch);
            if(isDigit)
                strBuilder.append(ch);
        }
        reuslt = strBuilder.toString();

        /**
         * 그냥 Integer.parseInt() 쓰면 자연수로 반환해줌 ( 앞자리 0을 생략 )
         */
        if(strBuilder.charAt(0) == '0')
        {
            int len = 0;
            for(int i = 0 ; i < strBuilder.length(); i++)
            {
                if(strBuilder.charAt(i) != '0')
                {
                    len = i;
                    break;
                }
            }
            reuslt = strBuilder.substring(len, strBuilder.length());
        }

        return reuslt;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Problem01_09 T = new Problem01_09();
        System.out.println(T.solution(str));

    }
}
