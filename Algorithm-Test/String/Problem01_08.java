package String;

import java.util.Scanner;

public class Problem01_08 {

    public String solution(String str)
    {

        String s = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reverseStr = new StringBuilder(s).reverse().toString();
        if(s.equalsIgnoreCase(reverseStr))
            return "YES";
        else
            return "NO";



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Problem01_08 T = new Problem01_08();
        System.out.println(T.solution(str));



    }
}
