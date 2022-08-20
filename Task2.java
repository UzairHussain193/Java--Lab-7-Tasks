// Lab 07 Q2.	Create three classes, Storage, Counter, and Printer. The Storage class should store an integer. 
// The Counter class should create a thread that starts counting from 0 (i.e. 0,1, 2,3,4….) and stores each value 
// in the Storage class. The Printer class should create a new thread that keeps reading the value in the Storage 
// class and printing it.

class Storage {
    static int[] storage = new int[11];
} // end of class Storage

class Counter extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            // Store i value into storage variable of class Storage
            Storage.storage[i] = i;
        }
    }
} // end of class Counter

class Printer extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            // print storage value
            System.out.println(Storage.storage[i]);
        }
    }
} // end of class Printer

public class Task2 {
    public static void main(String[] args) {

          Counter c = new Counter();
          c.start();
          Printer p = new Printer();
          p.start();


    }        // end of main() method
}            //  end of program
    int i;

    public synchronized void setValue(int i) {
        this.i = i;
    }

    public synchronized int getValue() {
        return this.i;
    }
}