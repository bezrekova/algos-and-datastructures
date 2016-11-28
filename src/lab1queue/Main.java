package lab1queue;

/**
 * Created by 1 on 29.10.2016.
 */
//var 7
//if we need add 0 in array, but array is not empty????
public class Main {
    public static void main(String[] args) {

        Queue list = new Queue(3);
        list.add(1);
        list.add(12);
        list.add(-3);

        list.print();
        // list.delete(0);
        // list.delete(1);
        System.out.println("List is empty: " + list.isEmpty());
        //list.delete(2);
        list.print();
        System.out.println("List is empty: " + list.isEmpty());
        System.out.println("Queue size = " + list.getSize());
        System.out.println("*****************************************");

        //2
        Stack myStack = new Stack();
        myStack.add(10);
        myStack.add(67);
        myStack.add(77);
        myStack.print();

        //myStack.delete();
        //  myStack.print();
        //3

        changeWorld(list,myStack);

        myStack.print();
    }

    public static void changeWorld(Queue queue, Stack stack) {
        queue.delNegative();
        queue.print();

        //queue.changeToOctal();
        queue.print();
        int size = queue.getSize();
        for (int i = 0; i < size; i++) {
            Integer elem = queue.delete(0);
            //if (elem!=null) {
            stack.add(elem);
           // }
        }


    }
}
