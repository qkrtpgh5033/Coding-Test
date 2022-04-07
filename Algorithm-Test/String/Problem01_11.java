package String;

import java.util.Scanner;

public class Problem01_11 {

    public void solution(String s)
    {
        String str = "";
        s += " ";
        int num = 1;
        for (int i = 0 ; i < s.length()-1; i++)
        {
            char ch = s.charAt(i);

            if(ch == s.charAt(i+1))
                num++;
            else
            {
                str += s.charAt(i);
                if(num > 1)
                    str += num;
                num = 1;
            }

        }

        System.out.println(str);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Problem01_11 T = new Problem01_11();
        T.solution(str);

    }
}
