package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    private int id;
    private int priority;

    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }

    public int getId(){
        return id;
    }

    public int getPriority(){
        return priority;
    }
}

public class Problem05_08 {

    public void solution(int [] arr, int key ) {
        Queue<Person> queue = new LinkedList<>();
        int answer = 1;
        for (int i = 0; i < arr.length; i++) {
            queue.offer(new Person(i,arr[i]));
        }

        while(!queue.isEmpty()){
            Person poll = queue.poll();
            for (Person person : queue) {
                    if(poll.getPriority() < person.getPriority()){
                        queue.offer(poll);
                        poll = null;
                        break;
                    }
            }

            if(poll != null){
                if(poll.getId() == key){
                    System.out.println(answer);
                    return;
                }
                else
                 answer++;

            }
        }
        System.out.println(answer);







    }

    public static void main(String[] args){

        Problem05_08 T = new Problem05_08();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int key = sc.nextInt();

        int [] arr = new int[num];
        for(int i = 0 ;i  < arr.length; i++)
            arr[i] = sc.nextInt();


        T.solution(arr, key);



    }
}
