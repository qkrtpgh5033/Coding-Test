package String;

import java.util.Scanner;

public class Problem01_12 {

    public void solution(String s, int n)
    {
        String [] arrStr = new String[n];
        String answer = "";

        for(int i = 0 ; i < n; i++)
        {
            arrStr[i] = s.substring(i*7, (i+1)*7);
            arrStr[i] = arrStr[i].replace("#", "1");
            arrStr[i] = arrStr[i].replace("*", "0");
            int binTo10 = Integer.parseInt(arrStr[i], 2);
            answer += (char) (binTo10);
        }

        System.out.println(answer);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        Problem01_12 T = new Problem01_12();
        T.solution(str, n);

    }
}
