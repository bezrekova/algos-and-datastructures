package lab3tree;

/**
 * Created by 1 on 30.10.2016.
 */
public class Student {
    private String surname;
    private int studID;
    private double avgMark;
    boolean confParticipation;

    public Student() {
    }

    public Student(String surname, int id, double avgMark, boolean participation) {
        this.surname = surname;
        this.studID = id;
        this.avgMark = avgMark;
        this.confParticipation = participation;
    }

    public String getSurname() {
        return surname;
    }

    public int getStudID() {
        return studID;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public boolean isConfParticipation() {
        return confParticipation;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setStudID(int studID) {
        this.studID = studID;
    }

    public void setAvgMark(double avgMark) {
        this.avgMark = avgMark;
    }

    public void setConfParticipation(boolean confParticipation) {
        this.confParticipation = confParticipation;
    }

    @Override
    public String toString() {
        return "surname: " + this.surname + " ID = " + this.studID + " avgMark =  " + this.avgMark +
                " participated in confs: " + this.confParticipation ;
    }
}
