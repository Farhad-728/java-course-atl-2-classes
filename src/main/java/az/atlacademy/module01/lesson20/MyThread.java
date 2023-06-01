package az.atlacademy.module01.lesson20;

public class MyThread extends Thread {

    @Override
    public synchronized void start() {
        super.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(new MyThread().getClass().getName());
        }

    }
}