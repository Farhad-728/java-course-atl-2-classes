package az.atlacademy.module01.lesson20;

public class MyThread extends Thread {

    @Override
    public synchronized void start() {
        super.start();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}