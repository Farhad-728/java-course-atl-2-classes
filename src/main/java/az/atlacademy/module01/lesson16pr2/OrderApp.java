package az.atlacademy.module01.lesson16pr2;

import java.util.LinkedList;
import java.util.Queue;

public class OrderApp {

    public static void main(String[] args) {
        Queue<Order> orders = new LinkedList<>();
        makeOrder(orders);
        makeOrder(orders);
        makeOrder(orders);
        makeOrder(orders);
        makeOrder(orders);
        makeOrder(orders);
        makeOrder(orders);

        System.out.println(orders);

        prosessOrder(orders);

        System.out.println(orders);

    }

    public static void makeOrder(Queue<Order> orders) {
        orders.add(new Order((int) (Math.random() * 100)));
    }

    public static void prosessOrder(Queue<Order> orders) {
        orders.poll();
    }
}
