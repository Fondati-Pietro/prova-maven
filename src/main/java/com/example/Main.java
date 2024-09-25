package com.example;

public class Main {
    public static void main(String[] args) {
        int l = 200;
        MioThread t1 = new MioThread(l);
        MioThread t2 = new MioThread(l);

        //t1.start(); //per utilizzare i metodi del THREAD
        //t2.start();

        new Thread(t1).start(); //per utilizzare i metodi del THREAD
        new Thread(t2).start();
    }
}