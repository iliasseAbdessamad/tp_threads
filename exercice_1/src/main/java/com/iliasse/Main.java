package com.iliasse;

import java.util.List;
import java.util.ArrayList;

//<>
public class Main {

    public static void main(String[] args) {

        System.out.println("Start program");
        List<Thread>  threads = new ArrayList<>();

        for (int i=1; i<=10; i++){
            Thread t = new Thread(new Talkative(i + 100), "T"+i);

            //ici on donne une priorité maximale à T9
            if(i == 9){
                t.setPriority(Thread.MAX_PRIORITY);
            }
            else{
                t.setPriority(Thread.MIN_PRIORITY);
            }
            threads.add(t);
        }

        threads.forEach(t -> t.start());
    }
}


