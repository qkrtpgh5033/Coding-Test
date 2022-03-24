package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem01_04 {

    public ArrayList<String> solution(String [] str)
    {
        ArrayList<String> list = new ArrayList<>();

//        for(String s : str) // 함수 사용
//        {
//            String reverse_str = new StringBuilder(s).reverse().toString();
//            list.add(reverse_str);
//        }

        for(String s : str) // 알고리즘 사용 (일일히 뒤집기)
        {
            char[] ch = s.toCharArray();
            int lt = 0;
            int rt = ch.length-1;

            while(lt < rt)
            {
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;

                lt++;
                rt--;
            }

            String reverse_str = String.valueOf(ch);
            list.add(reverse_str);
        }


        return list;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Problem01_04 T = new Problem01_04();


        String[] str = new String[num];
        for(int i = 0; i < num; i++)
        {
            str[i] = sc.next();
        }

        for(String s : T.solution(str)){
            System.out.println(s);
        }

    }
}
