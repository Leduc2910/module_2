package Thread;

public class TimedWaiting {
    public static void main(String[] args) {
        Thread sleepingThread = new Thread(new SleepingTask());
        sleepingThread.start();

/*        try {
            // Chờ 2 giây
            Thread.sleep(2000);

            // Sau 2 giây, đánh thức luồng sleepingThread
            sleepingThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}

class SleepingTask implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread is going to sleep for 5 seconds");
            Thread.sleep(5000);
            System.out.println("Thread woke up");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted while sleeping");
        }
    }
}
