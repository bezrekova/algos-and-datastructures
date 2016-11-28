package lab5search;

/**
 * Created by 1 on 04.11.2016.
 */
public class Student {
    private String surname;
    private String name;
    private double avgMark;
    private int group;
    private String gender;

    public Student(String surname, String name, double avgMark, int group, String gender) {
        this.surname = surname;
        this.name = name;
        this.avgMark = avgMark;
        this.group = group;
        this.gender = gender;
    }

    public Student() {
    }

    public String getSurname() {
        return surname;
    }

    public int getGroup() {
        return group;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }


    public double getAvgMark() {
        return avgMark;
    }




    @Override
    public String toString() {
        return "Student: " + this.name + " " + this.surname + " gender:" +
                this.gender + " group# = " + this.group + " has avgMark = " + this.avgMark + "\t";
    }

    private static void swap(Student a, Student b) {
        Student temp = a;
        a = b;
        b = temp;
    }





}
