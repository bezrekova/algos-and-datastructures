package hortsman_exersices;

/**
 * Created by 1 on 21.11.2016.
 */
public class PairTest1 {
    public static void main(String[] args) {
        String[] words = {"Mary", "had ", " a", "little", "lamb"};
        Pair<String> arr = ArrayAlg.minmax(words);
        System.out.println("min = " + arr.getFirst());
        System.out.println("max = " + arr.getSecond());
        String middle = ArrayAlg.<String>getMiddle(words);//possible without<String>
        System.out.println("middle =" + middle);
    }
}

class ArrayAlg {
    /**
     * @param a String array
     * @return Pair object, min of array
     * if a is empty, returns null
     */

    public static Pair<String> minmax(String[] a) {
        if (a == null || a.length == 0) return null;
        String min = a[0];
        String max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<String>(min, max);
    }

    /**
     * @param a   T array
     * @param <T> type
     * @return returns the middle value of array
     */
    public static <T> T getMiddle(T[] a) {
        return a[a.length / 2];
    }

}