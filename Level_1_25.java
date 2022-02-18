import java.util.*;
class Level_1_25 {
    public int solution(int[][] board, int[] moves) {

        //크레인 인형뽑기 게임
        int top = 0;
        int answer = 0;
        Stack <Integer> stack = new Stack<>();

        //인덱스 맞추기
        for(int i = 0 ; i < moves.length; i++)
        {
            moves[i] = moves[i] - 1;
        }

        //인형 뽑기
        for(int i = 0; i < moves.length; i++)
        {
            boolean flag = false;
            int col = moves[i];

            if(stack.size() >0)
                top = stack.peek();

            for(int j = 0; j < board.length; j++)
            {

                if(board[j][col] > 0)
                {
                    stack.push(board[j][col]);
                    board[j][col] = 0;
                    flag = true;
                    break;
                }
            }

            if(flag)
            {
                int now = stack.peek();

                if(top == now)
                {
                    stack.pop();
                    stack.pop();
                    answer+=2;
                }

            }

        }
        return answer;
    }
}
