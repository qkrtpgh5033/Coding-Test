package String;

import java.util.Scanner;

public class Problem01_02 {

    public String solution(String str)
    {
        String result ="";
        for (char ch : str.toCharArray())
        {
            if(Character.isLowerCase(ch)) // 소문자인 경우
                result += Character.toUpperCase(ch);
            else // 대문자인 경우
                result += Character.toLowerCase(ch);

        }

//        for(int i = 0 ; i < str.length(); i++)
//        {
//            int tmp = (int) str.charAt(i);
//
//            if( tmp >= 65 && tmp <= 90){ // 소문자로 변환
//                result += (char) (tmp+32);
//            }
//
//            else if(tmp >= 97 & tmp <= 122){ // 대문자로 변환
//                result += (char) (tmp-32);
//            }
//        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Problem01_02 T = new Problem01_02();
        System.out.println(T.solution(str));

    }
}
