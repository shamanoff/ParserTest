import java.util.Arrays;

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
        deque[left] = value;
            }else System.out.println("is full - " + value + " not added");
         numItem++;
         left++;
    }

    public void insertRight(int value) {
        if(!isFull()){
            deque[right] = value;
        }else System.out.println("is full - " + value + " not added");
        numItem++;
        right--;
    }

    @Override
    public String toString() {
        return "Deque{" +
                "deque=" + Arrays.toString(deque) +
                '}';
    }
}
