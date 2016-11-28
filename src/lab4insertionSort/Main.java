package lab4insertionSort;

/**
 * Created by 1 on 30.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Krasnow", "Oleksiy", 5.0, "M");
        Student student2 = new Student("Samarina", "Olga", 4.5, "F");
        Student student3 = new Student("Zaivencko", "Oleksandr", 5.0, "M");
        Student student4 = new Student("Oikos", "Femulopus", 4.2, "M");
        Student student5 = new Student("Popova", "Polina", 5.0, "F");

        Student[] array = new Student[5];
        array[0] = student1;
        array[1] = student2;
        array[2] = student3;
        array[3] = student4;
        array[4] = student5;

        // array[0] = null;

        System.out.println("Before sort:");
        Student.printArray(array);
        // Student.insertionSort(array);
        Student.otherInsertionSort(array);
        System.out.println("After sort:");
        Student.printArray(array);

    }
}
