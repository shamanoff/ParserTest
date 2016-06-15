public class Deque {

    int[] deque;
    private int left;
    private int right;
    private int maxSize;

    private int numItem;

    public Deque(int maxSize) {

        this.maxSize = maxSize;

        deque = new int[maxSize];
        left = 0;
        right = maxSize-1;

        numItem = 0;

    }
    public boolean isFull() {
        return (numItem == maxSize);
    }
        public void insertLeft(int value) {
            if(!isFull()){
        deque[left] = value;}
    }



}
