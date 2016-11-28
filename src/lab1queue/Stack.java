package lab1queue;

/**
 * Created by 1 on 29.10.2016.
 */
class Element {
    String data;
    Element prev;

    public Element(int d, Element s) {
        this.data = Integer.toOctalString(d);
        this.prev = s;
    }

}

public class Stack {
    Element last;

    //add new elem to end first
    public boolean add(int data) {
        last = new Element(data, last);
        return true;
    }

    String delete() {
        String del;
        if (last != null) {
            del = last.data;
            last = last.prev;
            return del;
        }
        return null;
    }

    public void print() {
        //new elem not to lose link to last
        Element current = last;
        if (last == null) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack:");
            while (current != null) {
                System.out.print(current.data + "\t");
                current = current.prev;
            }
            System.out.println();

        }
    }

}
