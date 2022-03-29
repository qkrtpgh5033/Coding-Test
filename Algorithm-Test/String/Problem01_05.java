package String;

import java.util.Scanner;

public class Problem01_05 {

    public void solution(String str)
    {
        /**
         * reverse
         */
        StringBuilder s = new StringBuilder(); // reverse용
        StringBuilder result = new StringBuilder(); // 결과

        for(char ch  : str.toCharArray())
        {
            //대소문자 or 대문자
            if(Character.isLetter(ch)){
                s.append(String.valueOf(ch));
            }
        }
        s = s.reverse(); // 문자 뒤집기
        int i = 0; // 인덱스

        for(char ch : str.toCharArray())
        {
            if(Character.isLetter(ch)){
                result.append(String.valueOf(s.charAt(i++)));
            }
            else{
                result.append(String.valueOf(ch));
            }

        }

        System.out.println(result.toString());

        /**
         * lt, rt 사용
         */
        int lt = 0;
        int rt = str.length()-1;
        char[] arr = str.toCharArray();

        while(lt < rt)
        {
            char ltChar = arr[lt];
            char rtChar = arr[rt];

            if(!Character.isLetter(ltChar))
                lt++;
            else if(!Character.isLetter(rtChar))
                rt--;
            else
            {
                char temp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = temp;
                lt++;
                rt--;
            }
        }
//        String s = String.valueOf(arr);
        System.out.println(s);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Problem01_05 T = new Problem01_05();
        T.solution(str);


    }
}
