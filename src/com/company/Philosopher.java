package com.company;

public class Philosopher implements Runnable {
    int id;
    public void run(){
//        while(miscsubs.TotalEats < miscsubs.MAX_EATS){
            miscsubs.RandomDelay();
            miscsubs.StartEating(id);
            miscsubs.RandomDelay();
            miscsubs.DoneEating(id);
//        }
    }
    public Philosopher(int idNumber){
        this.id = idNumber;
    }

}