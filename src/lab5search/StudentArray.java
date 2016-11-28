package lab5search;

/**
 * Created by 1 on 04.11.2016.
 */
public class StudentArray {
    // private int size = 0;
    private int index = 0;
    Student[] array;

    public StudentArray(int size) {
        array = new Student[size];

    }

    public void add(Student stud) {
        // int j = 0;
        if (index != array.length && index > -1) {
        if (index == 0) {
            array[index] = stud;
            index++;
        } else {
            array[index] = stud;
            int i, j;
            Student newVal;
            for (i = 1; i <= index; i++) {
                newVal = array[i];
                j = i;
                while (j > 0 && array[j-1].getGroup() > newVal.getGroup()) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = newVal;

            }
            index++;
        }}
    }

   /* public boolean add(Student stud) {
        if (index != array.length && index > -1) {
            array[index] = stud;
            index++;
            return true;
        } else
            return false;
    }*/

    //return student where gender=F and avgMark>4.5
    public int searchForGoodGirls(int group) {
        int counter = 0;
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i].getGender().equals("F")
                        && array[i].getAvgMark() > 4.5 && array[i].getGroup() == group) {
                    counter++;
                }
            }

        }
        return counter;
    }

    public void printArray() {

        for (int i = 0; i < array.length; i++) {
            if (array.length > 0 && array[i] != null) {
                System.out.println(array[i].toString());

            } else {
                System.out.println("No value");
            }
        }
    }
}

