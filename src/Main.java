public class Main {

    public static void main(String[] args) {


        Queue queue = new Queue(5);
        queue.insert(5);
        queue.insert(10);
        queue.insert(23);
        queue.insert(12);
        queue.insert(3);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }

 /*       Stack stack = new Stack(5);
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(9);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        stack.push(20);
        stack.push(10);
        stack.push(1);

        while (!stack.isEmpty()) {
            System.out.println("---"+stack.pop());
        }*/
    }
}
