package lab2hashtable;

/**
 * Created by 1 on 30.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Diamond diamond = new Diamond();
        System.out.println(diamond.toString());
      //  System.out.println(diamond.getPerimetr());
        System.out.println(diamond.isDiamond());

        HashTable table = new HashTable(10);
        for (int i = 0; i <100; i++) {
            Diamond diamond1 = new Diamond();
//            diamond.setPerimeter(i + 10);
         // table.put(new Diamond());
           if (diamond1.isDiamond()) {
                System.out.println(table.put(diamond1));
            }
        }
        if (table.find(14) == -1) {
            System.out.println("Found: false");
        } else {
            System.out.println("Found:true");
        }
        table.displayTable();
        table.remove(16);
        table.displayTable();


    }

}
