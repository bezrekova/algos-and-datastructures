package lab1queue;

/**
 * Created by 1 on 29.10.2016.
 */
public class Queue {
    private Integer vect[];
    private byte last;

    Queue(int size) {
        vect = new Integer[size];
        last = -1;
    }

    boolean add(int elem) {
        if (last == vect.length - 1)
            return false;
        vect[++last] = elem;
        return true;
    }

    Integer delete(int elem) {

        if (last < 0 || vect[elem] == null) {
            return null;
        } else {
            int del = vect[elem];
            for (int i = elem; i < last; i++)
                vect[i] = vect[i + 1];
            vect[last--] = null;
            return del;
        }

    }

    void print() {
        if (isEmpty()) {
            System.out.println("No elements in queue");
        } else {
            System.out.print("Queue: ");
            for (int i = 0; i <= last; i++) {
                System.out.print(" elem" + "[" + i + "] = " +
                        +vect[i]);
            }
            System.out.println();
        }
    }

    public Integer delNegative() {
        if (last < 0) {
            return null;
        } else {
            int del = 0;//returns 0 - no negative numbers
            for (int i = 0; i < last; i++) {
                if (vect[i] < 0) {
                    vect[i] = vect[i + 1];
                    del = vect[i];
                }
            }
            vect[last--] = null;
            return del;
        }
    }

    boolean isEmpty() {
        boolean check;
        int counter = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] == null) {
                counter++;
            }
        }
        if (counter == vect.length) {
            check = true;
        } else check = false;
        return check;
    }

    boolean isFull() {
        boolean check;
        if (isEmpty()) {
            check = false;
        } else {
            check = true;
        }
        return check;
    }


    int getSize() {
        int counter = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                counter++;
            }
        }
        return counter;
    }
}



