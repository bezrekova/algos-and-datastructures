package lab2hashtable;

/**
 * Created by 1 on 30.10.2016.
 */


public class HashTable {
    //private final static int TABLE_SIZE = 128;
    private Diamond[] hashArray;

    //
    HashTable(int size) {
        hashArray = new Diamond[size];

    }
//    private int size = hashArray.length;

    public int find(int key) {
        int index = hashFunc1(key);
        if (hashArray[index] != null && hashArray[index].getPerimetr() == key) {
            return index;
        } else {
            int p, k;
            int index_2 = 0;
            p = hashFunc2(key);
            for (k = 0; k < hashArray.length; k++) {
                index_2 = (index + k * p) % hashArray.length;
                if (hashArray[index_2] != null && hashArray[index_2].getPerimetr() == key) {
                    return index_2;
                }
            }
            return -1;
        }
    }

    public boolean put(Diamond nElem) {

        int index = hashFunc1(nElem.getPerimetr());
        if (hashArray[index] == null) {
            hashArray[index] = nElem;

        } else collisionSolve(index, nElem);
        //hashArray[index] = nElem;
        // insert
        return true;
    }

    private void collisionSolve(int index, Diamond nElem) {
        int p, k;
        int index_2 = 0;
        p = hashFunc2(nElem.getPerimetr());
        for (k = 0; k < hashArray.length; k++) {
            index_2 = (index + k * p) % hashArray.length;
            if (hashArray[index_2] == null) {
                hashArray[index_2] = nElem;
            }
        }

    }

    public void remove(int key) {
        int index = hashFunc1(key);
        if (find(key) != -1 && hashArray[index] != null) {
            hashArray[index] = null;
        }
        else System.out.println("Not found what to remove");;
    }

    //double hashing
  /* private int probe(int key) {
        int i = hashFunc1(key);
        int h2 = hashFunc2(key);
        int positionsChecked = 1;

        //keep probing until we find
        //empty position or match
        //avoid infinite loop
        while (hashArray[i] != null && key != hashArray[i].getKey()) {
            //while (hashArray[i] != null && key != (-1)) {
            if (positionsChecked == size)
                return -1;
            i = (i + h2) % size;
            positionsChecked++;
        }
        return i;
    }*/

    //by dividing /
    // h2 computes the increment for probing
    private int hashFunc2(int key) {
        int abs = 1 + key % hashArray.length;
        return abs;
    }

    //h1 computes the hash code
    private int hashFunc1(int key) {
        //  int m = size;
        int res = key % hashArray.length;
        return res;
    }

    public void displayTable() {
        System.out.println("Table: ");
        for (int j = 0; j < hashArray.length; j++) {
            if (hashArray[j] != null)
                System.out.println("j=" + j + " " + "perim=" + hashArray[j].getPerimetr() + " "
                        + hashArray[j].toString() + " ");
            else
                System.out.println("** ");
        }
        System.out.println("");
    }

}
