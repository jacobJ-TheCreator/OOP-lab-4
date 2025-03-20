package exercise2;

public class MyDList<E> {
    private MyNode<E> head;
    private MyNode<E> tail;
    private int size;

    public MyDList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public MyNode<E> getHead() {
        return head;
    }

    public void addFirst(E item) {
        MyNode<E> newNode = new MyNode<>(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(E item) {
        MyNode<E> newNode = new MyNode<>(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        E data = head.element;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return data;
    }

    public E removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        E data = tail.element;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
