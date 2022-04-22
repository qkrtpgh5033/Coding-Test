import java.util.Scanner;

public class Problem02_09 {

    public void solution(int [][] arr)
    {
        int[][] sum = new int[2][arr.length];
        int daegok1 =0;
        int daegok2 =0;

        for(int i = 0 ;i  < arr.length; i++)
        {
            for(int j = 0 ; j < arr.length; j++)
            {
                sum[0][i] += arr[i][j];
                sum[1][i] += arr[j][i];

                if(i == j)
                {
                    daegok1 += arr[i][j];
                }
                if(i+j == arr.length-1)
                {
                    daegok2 += arr[i][j];
                }
            }
        }
//
//        System.out.println("행의 합");
//
//        for(int i = 0 ; i < arr.length; i++)
//        {
//            System.out.print(sum[0][i]+" ");
//        }
//        System.out.println("\n열의 합");
//        for(int i = 0 ; i < arr.length; i++)
//        {
//            System.out.print(sum[1][i]+ " ");
//        }

        int max1 = 0;
        int max2 = 0;

        for(int i = 0 ; i < arr.length; i++)
        {
            if(max1 < sum[0][i])
                max1 = sum[0][i];
            if(max2 < sum[1][i])
                max2 = sum[1][i];
        }

//        System.out.println("max1 = " + max1);
//        System.out.println("max2 = " + max2);
//        System.out.println("daegok1 = " + daegok1);
//        System.out.println("daegok2 = " + daegok2);

        int max = Math.max(max1, max2);
        max = Math.max(max, daegok1);
        max = Math.max(max, daegok2);

        System.out.println(max);



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        for(int i = 0 ; i < arr.length; i++)
        {
            for(int j = 0 ; j < arr.length; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        Problem02_09 T = new Problem02_09();
        T.solution(arr);
    }
}