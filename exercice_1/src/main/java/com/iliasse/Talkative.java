package com.iliasse;


public class Talkative implements Runnable {

    private int value;

    public Talkative(int value) {
        this.value = value;
    }

    @Override
    public void run(){
        for (int i=0 ; i < 100; i++){

            //à chque fois qu'un Thread termine l'exécution de la tache on affichera ce message
            if(i == 99){
                System.out.println("Opération terminée " + Thread.currentThread().getName() );
            }
            System.out.println(Thread.currentThread().getName() + " : " + this.value);
        }
    }
}


