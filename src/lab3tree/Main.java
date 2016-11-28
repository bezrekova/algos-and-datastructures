package lab3tree;

/**
 * Created by 1 on 30.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Karas", 123, 4.0, true);
        Student student1 = new Student("Petrov", 124, 5.0, true);
        Student student2 = new Student("Kavun", 125, 5.0, true);

        Tree tree = new Tree();
        tree.add(new Node(student));
        tree.add(new Node(student1));
        tree.add(new Node(student2));
        tree.print();
        tree.delete();
        tree.delete();
        System.out.println("After delete");
        tree.print();


    }



}
