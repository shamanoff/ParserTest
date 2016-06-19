public class Stack {
    private Deque deque;

    public Stack (int maxSize){

        deque = new Deque(maxSize);

    }

    public void push(int value) {
        deque.insertLeft(value);
    }

    public int pop() {

        return deque.removeLeft();
    }

    public boolean isFull() {
        return deque.isFull();

    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }
}
