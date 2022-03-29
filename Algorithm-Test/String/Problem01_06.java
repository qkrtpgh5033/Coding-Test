package String;

import java.util.Scanner;

public class Problem01_06 {

    public void solution(String str)
    {
        StringBuilder strBuilder = new StringBuilder();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(str.indexOf(ch) == i)
                strBuilder.append(String.valueOf(ch));
        }

        String result = strBuilder.toString();
        System.out.println(result);
//        char [] arr = str.toCharArray();
//
//        for(int i = 0 ; i < str.length(); i++)
//        {
//            char ch = arr[i];
//            if(ch != '0')
//            {
//                for(int j = i+1; j < str.length(); j++)
//                {
//
//                    if(ch == str.charAt(j))
//                    {
//                        arr[j] = '0';
//                    }
//                }
//            }
//        }
//
//        StringBuilder builder = new StringBuilder();
//
//        for(int i = 0; i < arr.length; i++)
//        {
//            if(arr[i] != '0')
//            {
//                builder.append(arr[i]);
//            }
//
//        }
//
//        String result = builder.toString();
//        System.out.println(result);



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Problem01_06 T = new Problem01_06();
        T.solution(str);


    }
}
