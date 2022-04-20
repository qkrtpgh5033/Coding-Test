package String;

import java.util.Scanner;

public class Problem01_07 {

    public String solution(String str)
    {

        String reverseStr = new StringBuilder(str).reverse().toString();
        if(reverseStr.equalsIgnoreCase(str))
            return "YES";
        else
            return "NO";


//        str = str.toLowerCase();
//
//        for(int i = 0 ; i <str.length()/2; i++)
//        {
//            char lt = str.charAt(i);
//            char rt = str.charAt((str.length() - 1 - i));
//            if(lt != rt)
//                return "NO";
//        }
//
//        return "YES";



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Problem01_07 T = new Problem01_07();
        System.out.println(T.solution(str));



    }
}
