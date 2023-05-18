package az.atlacademy.lesson15;

public class MyLinkedList<T> {
    private MyNode<T> head;

    public MyLinkedList(T data) {
        this.head = new MyNode<>(data);
    }

    public void addTail(T data) {
        if (head == null) {
            head = new MyNode<>(data);
        }
        return;
    }
}
