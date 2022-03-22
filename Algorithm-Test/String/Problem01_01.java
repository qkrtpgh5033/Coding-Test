package String;

import java.util.Scanner;

public class Problem01_01 {

    public int solution(String str, char t)
    {
        int result = 0;
        for(char ch : str.toCharArray())
        {
            if(ch == t)
                result++;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        String str = sc.next();
        str = str.toLowerCase();

        char t = sc.next().charAt(0);
        t = Character.toLowerCase(t);

        Problem01_01 T = new Problem01_01();
        System.out.println(T.solution(str, t));
    }
}