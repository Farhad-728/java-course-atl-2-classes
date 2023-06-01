package az.atlacademy.module01.lesson20;

public class MyThread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Name thread: " + Thread.currentThread().getName());
    }
}
