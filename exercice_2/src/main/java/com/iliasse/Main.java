package com.iliasse;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws Exception {
        int[] nbrs = new int[9000];
        for (int i=0; i<9000; i++){
            nbrs[i] = 1;
        }

        ExecutorService thread_pool = Executors.newFixedThreadPool(4);
        Sommeur sommeur = new Sommeur(nbrs, 0, nbrs.length);
        Future<?> future = thread_pool.submit(sommeur);

        while(!future.isDone()){ }
        thread_pool.shutdownNow();

        System.out.println("La somme est : " + sommeur.getSomme());
    }
}