package Thread;

public class ThreadDemo implements Runnable  {
    private String threadName;

    ThreadDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i >= 1; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread: " + threadName + " interrupted");
        }
        System.out.println("Thread: " + threadName + " exiting");
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread Running...");
        ThreadDemo runable = new ThreadDemo("Thread-1-Play-Music");
        Thread r1 = new Thread(runable);
        ThreadDemo runable2 = new ThreadDemo("Thread-2-Send-Email");
        Thread r2 = new Thread(runable2);
/*        r1.setPriority(Thread.MAX_PRIORITY);*/
        r1.start();
/*        try {
            r1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        r2.start();
    }
}