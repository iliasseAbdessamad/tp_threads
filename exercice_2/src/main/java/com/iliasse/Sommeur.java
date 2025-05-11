package com.iliasse;
public class Sommeur implements Runnable {

    private int[] nbrs;
    private int debut, fin, somme;

    public Sommeur(int[] nbrs, int debut, int fin){
        this.nbrs = nbrs;
        this.debut = debut;
        this.fin = fin;
    }

    public int getSomme(){ return this.somme; }

    @Override
    public void run(){
        try{
            for(int i = debut; i <= fin; i++){
                synchronized (this){
                    somme += nbrs[i];
                }
            }
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
    }
}
