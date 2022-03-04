class Level_2_2 {
    public long solution(int w, int h) {

        // 멀쩡한 사각형

        long answer = 1;
        long width = Long.valueOf(w);
        long height = Long.valueOf(h);

        answer = width * height - (width + height - gcm(width,height));
        return answer;
    }


    long gcm(long w, long h)
    {

        long small = h;
        long big = w;

        if(big < small)
        {
            big = h;
            small = w;
        }

        long temp =0;

        while(small > 0 ){

            temp = big % small;

            big = small;
            small = temp;
        }

        return big;


    }
}

