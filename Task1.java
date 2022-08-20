// Lab 07 Q1.	Write a program based on threads. Perform multi-threading and print even and such that when the numbers 
// reach at value 30 then give a delay of 5 seconds. After the delay, the program will continue to print the series 
// at the same manner.

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 50; i += 2) {
            if (i % 2 == 0) {
                try {
                    System.out.println(i);
                    if (i == 30) {
                        Thread.sleep(5000);
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
