import java.util.*;
class Level_1_25 {
    public int solution(int[][] board, int[] moves) {

        //크레인 인형뽑기 게임 (코드 간결화)
        int answer = 0;
        Stack <Integer> stack = new Stack<>();

        //인덱스 맞추기
        for(int i = 0 ; i < moves.length; i++)
        {
            moves[i] = moves[i] - 1;
        }

        //인형 뽑기
        for(int i : moves)
        {

            for(int j = 0; j < board.length; j++)
            {

                if(board[j][i] > 0)
                {

                    // 스택에 값 존재 x
                    if(stack.isEmpty())
                    {
                        stack.push(board[j][i]);

                    }
                    //스택 값 존재
                    else
                    {
                        int top = stack.peek();
                        int now = board[j][i];

                        if(top == now)
                        {
                            stack.pop();
                            answer+=2;
                        }
                        else
                            stack.push(now);
                    }

                    board[j][i] = 0;
                    break;
                }
            }


        }
        return answer;
    }
}