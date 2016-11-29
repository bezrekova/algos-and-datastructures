package hortsman_exersices;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by 1 on 29.11.2016.
 */
public class TestSet {
    //to insert args CTRL+ALT+FN+R - edit configurations

    public static void main(String[] args) {
        Set<String> words = new HashSet<>(10);
        for (int i = 0; i < args.length; i++) {
            String w = args[i];
            words.add(w);
        }
        Iterator<String> it = words.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
