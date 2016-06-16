public class Main {

    public static void main(String[] args) {

        Deque deque = new Deque(5);

        deque.insertRight(1);
        deque.insertRight(2);
        deque.insertRight(8);

        deque.insertLeft(3);
        deque.insertLeft(6);
        deque.insertLeft(5);
        deque.insertLeft(10);

        System.out.println(deque.toString());

        deque.removeLeft(5);
        System.out.println(deque.toString());





    }
}
