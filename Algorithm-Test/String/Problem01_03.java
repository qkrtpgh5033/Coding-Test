package String;

import java.util.Scanner;

public class Problem01_03 {

    public String solution(String msg)
    {
        String[] split = msg.split(" ");
        String result = "";
        int maxLen = split[0].length();

        for(String str : split) // 각 배열중 가장 긴 값 찾기
        {
            if(maxLen < str.length())
                maxLen = str.length();
        }

        for(String str : split) // 가장 긴 배열 리턴
        {
            if(maxLen == str.length())
            {
                result = str;
                break;
            }
        }

        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Problem01_03 T = new Problem01_03();
        System.out.println(T.solution(str));

    }
}
