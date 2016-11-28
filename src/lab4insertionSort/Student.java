package lab4insertionSort;

/**
 * Created by 1 on 30.10.2016.
 */
public class Student {
    private String surname;
    private String name;
    private double avgMark;
    private String gender;

    public Student(String surname, String name, double avgMark, String gender) {
        this.surname = surname;
        this.name = name;
        this.avgMark = avgMark;
        this.gender = gender;
    }


    public double getAvgMark() {
        return avgMark;
    }

    public static void insertionSort(Student[] array) {
        int k, j, i;
        Student temp;
        try {
            for (k = array.length - 1; k > 0; k--) {
                if (array[k] != null && array[k].avgMark < array[k - 1].avgMark) {
                    swap(array[k], array[k - 1]);
                }
                for (i = 2; i < array.length; i++) {
                    j = i;
                    temp = array[i];
                    while (j > 0 && temp.avgMark < array[j - 1].avgMark) {
                        array[j] = array[j - 1];
                        j = j - 1;
                        array[j] = temp;
                    }
                }
            }
        } catch (NullPointerException ex) {
            System.out.println("Empty array!= " + ex);
        }
    }

    public static void otherInsertionSort(Student[] array) {
        int i, j;
        Student newVal;
        for (i = 1; i < array.length; i++) {
            newVal = array[i];
            j = i;
            while (j > 0 && array[j - 1].avgMark > newVal.avgMark) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = newVal;
        }

    }

    @Override
    public String toString() {
        return "Student: " + this.surname + " " + this.name + " gender:" +
                this.gender + " has avgMark = " + this.avgMark + "\t";
    }

    private static void swap(Student a, Student b) {
        Student temp = a;
        a = b;
        b = temp;
    }

    public static void printArray(Student[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array.length > 0 && array[i] != null) {
                System.out.println(array[i].toString());

            } else {
                System.out.println("No value");
            }
        }
    }
}
