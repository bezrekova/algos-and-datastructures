package lab3tree;

/**
 * Created by 1 on 30.10.2016.
 */
class Node {
    Student data;
    Node left;
    Node right;

    public Node(Student student) {
        this.data = student;

    }
}

public class Tree {
    Node root;

    public Tree() {
    }

    public boolean add(Node elem) {
        if (root == null) {
            root = elem;
        } else
            return insert(root, elem);
        return true;
    }

    private boolean insert(Node cur, Node nElem) {
        while (true) {
            if (cur.data.getStudID() > nElem.data.getStudID()) {
                if (cur.left == null) {
                    cur.left = nElem;
                    break;
                } else cur = cur.left;
            } else if (cur.data.getStudID() < nElem.data.getStudID()) {
                if (cur.right == null) {
                    cur.right = nElem;
                    break;
                } else cur = cur.right;
            } else return false;
        }
        return true;
    }

    public void print() {
        Node current;
        printElementTree(root);
    }

    private Node printElementTree(Node cur) {
        if (cur != null) {
            System.out.println();
            System.out.println(cur.data.toString());
            //level = level+1;
            printElementTree(cur.left);
            printElementTree(cur.right);

        }
        return cur;
    }

    public void delete() {

        root = findDelete(root);

    }

    private Node findDelete(Node cur) {
        if (cur != null) {
            if (cur.data.getAvgMark() == 5.0 &&
                    cur.data.isConfParticipation() == true) {
                if (cur.left == null) {
                    cur = cur.right;
                    return cur;
                } else {
                    if (cur.right == null) {
                        cur = cur.left;
                        return cur;
                    } else {
                        cur.right = replaceNode(cur, cur.right);
                       // return cur;
                    }
                }
            }
            cur.left = findDelete(cur.left);
            cur.right = findDelete(cur.right);
        }
        return cur;
    }

    private Node replaceNode(Node delNode, Node cur) {
        if (cur.left != null) {
            cur.left = replaceNode(delNode, cur.left);
        } else {
            delNode.data = cur.data;
            cur = cur.right;

        }
        return cur;
    }


}


