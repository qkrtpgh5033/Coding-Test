package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 백준 1931 - 회의실 배정
 */
class Problem_1931 {

    /**
     *
     * 11 개수
     * 1 4  o
     * 3 5 x
     * 0 6 x
     * 5 7 o
     * 3 8 x
     * 5 9 x
     * 6 10 x
     * 8 11 o
     * 8 12 x
     * 2 13 x
     * 12 14 o
     * 회의 가능 : (1,4), (5,7), (8,11), (12,14)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        ArrayList<MeetingTime> list = new ArrayList<>();
        int answer = 1;

        for(int i = 0; i < num; i++){
            StringTokenizer token = new StringTokenizer(br.readLine(), " ");
            int startTime = Integer.parseInt(token.nextToken());
            int endTime = Integer.parseInt(token.nextToken());
            list.add(new MeetingTime(startTime, endTime));
        }

        Collections.sort(list, new Comparator<MeetingTime>() {
            @Override
            public int compare(MeetingTime a, MeetingTime b) {

                return (a.getEndTime() == b.getEndTime()) ? (a.getStartTime() - b.getStartTime()) : (a.getEndTime() - b.getEndTime());
            }

        });

        MeetingTime firstTime = list.get(0);
        int firstEndTime = firstTime.getEndTime();

        for(int i = 1; i< list.size(); i++){
            MeetingTime nextTime = list.get(i);
            int nextStartTime = nextTime.getStartTime();

            if (firstEndTime <= nextStartTime) {
                firstEndTime = nextTime.getEndTime();
                answer++;
            }


        }

        System.out.println(answer);



    }
}

class MeetingTime{
    private int startTime;
    private int endTime;

    public MeetingTime(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }
}