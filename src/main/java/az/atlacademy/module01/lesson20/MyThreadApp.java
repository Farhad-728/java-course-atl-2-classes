package az.atlacademy.module01.lesson20;

public class MyThreadApp {

    public static void main(String[] args) {
        new MyThread("Samir").start();

        new Thread(new MyThread2()).start();
        new Thread(new MyThread2()).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Name thread :" + Thread.currentThread().getName());
            }
        }).start();

        new Thread(() -> System.out.println("Name thread :" + Thread.currentThread().getName())).start();
    }
}

