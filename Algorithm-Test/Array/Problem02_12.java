package Array;

public class Problem02_12 {

    public static void main(String[] args) {


        for(int num = 2; num <= 100; num++)
        {
            boolean flag = true;
            for(int j = 2; j < num; j++){
                if( num % j == 0) // 소수가 아닐때
                {
                    flag = false;
                    break;
                }

            }

            if(flag){
                System.out.println(num+"은 소수입니다.");
            }
        }

    }
}
