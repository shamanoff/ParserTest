public class Queue {

    private Deque deque;

    public Queue(int maxSize) {
        deque = new Deque(maxSize);
    }

    public void insert(int value) {
       deque.insertLeft(value);
    }

    public int remove() {
        return deque.removeRight();
    }

    public boolean isEmpty() {
      return   deque.isEmpty();

    }

    public boolean isFull() {
      return   deque.isFull();
    }
}
