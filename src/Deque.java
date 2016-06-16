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
    public boolean isEmpty() {
        return (numItem == 0);
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
//
    public String removeLeft(int value) {

        int[] leftInt = new int[value];
        for (int i = 0; i < value; i++) {


        if(!isEmpty()){
            leftInt[i] = deque[left];
            deque[left] = 0;

        }else System.out.println("is empty");
        numItem--;
        left--;
        }
        String outLeft = Arrays.toString(leftInt) ;
        return outLeft;

    }





/*    public void removeLeft(int value) {


        for (int i = 0; i <value ; i++) {


            int leftInt=0;
            if(!isEmpty()){
            leftInt = deque[left];
                deque[left] = 0;
            }else System.out.println("is empty");
            numItem--;
            left--;
        }


    }*/

    @Override
    public String toString() {
        return "Deque " +
                 Arrays.toString(deque) ;
    }
}
