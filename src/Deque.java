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
        right = 0;

        numItem = 0;

    }
    public boolean isFull() {
        return (numItem == maxSize);
    }
    public boolean isEmpty() {
        return (numItem == 0);
    }

    public void insertLeft(int value) {
        if (numItem == 0) {
            deque[left] = value;
            numItem++;
        } else {
            if(isFull()){
                System.out.println("is full ");return;}

                for (int i = right; i > -1; i--) {
                    deque[i + 1] = deque[i];
                }
                deque[left] = value;
                right++;
                numItem++;

        }
    }


    public void insertRight(int value) {
        if (isEmpty()) {
            deque[right]=value;
            numItem++;
            return;
        }
        if(!isFull()){
            deque[right+1]=value;
            right++;
            numItem++;

        }
    }

    public int removeLeft (){
        if(isEmpty()){
            System.out.println("is empty ");
            return Integer.MIN_VALUE;
        }
        int temp = deque[left];
        numItem--;
        if(!isEmpty()){
            for (int i = 1; i < right+1; i++) {
                deque[i - 1] = deque[i];
            }
            right--;
        }
        return temp;
    }

    public int removeRight() {
        if(isEmpty()){
            System.out.println("is empty ");
            return Integer.MIN_VALUE;
        }
        int temp = deque[right];
        numItem--;
        if(!isEmpty()){right--;}
        return temp;
    }



    @Override
    public String toString() {
        return "Deque " +
                 Arrays.toString(deque) ;
    }
}
