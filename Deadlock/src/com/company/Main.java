package com.company;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private Lock lockA = new ReentrantLock();
    private Lock lockB = new ReentrantLock();

    private void execute() {
        new Thread(this::processThis).start();
        new Thread(this::processThat).start();
    }

    public void processThis() {
        lockA.lock();
        System.out.println("A Locked");
        lockB.lock();
        System.out.println("B Locked");

        lockA.unlock();
        System.out.println("Released A");
        lockB.unlock();
        System.out.println("Released B");
    }

    public void processThat() {
        lockB.lock();
        System.out.println("B locked");
        lockA.lock();
        System.out.println("A locked");

        lockB.unlock();
        System.out.println("Released B");
        lockA.unlock();
        System.out.println("Released A");
    }

    public static void main(String[] args) {
        Main c = new Main();

        c.execute();
    }
}
