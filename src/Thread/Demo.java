package Thread;

class ExtendsThread extends Thread {
    @Override
    public void run() {
        System.out.println();
        for (int i = 1; i <= 3 ; i++) {
            System.out.println(i+ " Thread name: "+Thread.currentThread().getName());
        }
    }
}

class ImplementsThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 3 ; i++) {
            System.out.println(i+ " Thread name: "+Thread.currentThread().getName());
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        ImplementsThread runable = new ImplementsThread();
        Thread r1 = new Thread(runable);
        r1.start();

        ImplementsThread runable2 = new ImplementsThread();
        Thread r2 = new Thread(runable2);
        r2.start();
    }
}
