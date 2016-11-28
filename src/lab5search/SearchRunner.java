package lab5search;

/**
 * Created by 1 on 04.11.2016.
 */
public class SearchRunner {
    public static void main(String[] args) {

        StudentArray studArray = new StudentArray(21);


        studArray.add(new Student("Kenobi", "Obi-Wan", 4.5, 505, "M"));
        studArray.add(new Student("Skywalker", "Anakin", 4.0, 101, "M"));
        studArray.add(new Student("Padme", "Amidala", 5.0, 400, "F"));
        studArray.add(new Student("Solo", "Khan", 3.5, 304, "M"));
        studArray.add(new Student("Jyn", "Kvan-Gon", 5.0, 601, "M"));
        studArray.add(new Student("Dart", "Sirius", 4.5, 602, "M"));
        studArray.add(new Student("Biblle", "Sio", 3.5, 302, "M"));
        studArray.add(new Student("Binks", "Dzha-Dzha", 5.0, 604, "M"));
        studArray.add(new Student("Nass", "Boss", 3.5, 208, "M"));
        studArray.add(new Student("Skywalker", "Shmi", 2.5, 400, "F"));
        studArray.add(new Student("Dart", "Moll", 4.5, 402, "M"));
        studArray.add(new Student("GrandMaster", "Yoda", 5.0, 608, "M"));
        studArray.add(new Student("Dart", "Wader", 4.5, 501, "M"));
        studArray.add(new Student("Queen", "Amidala", 4.6, 400, "F"));
        studArray.add(new Student("Tarpals", "Rus", 4.0, 402, "M"));
        studArray.add(new Student("Meis", "Windu", 5.0, 502, "M"));
        studArray.add(new Student("Skywalker", "Luck", 4.2, 103, "M"));
        studArray.add(new Student("Skywalker", "Leia", 4.8, 400, "F"));
        studArray.add(new Student("Cancler", "Pallpatine", 4.8, 400, "M"));
        studArray.add(new Student("General", "Greenwus", 4.3, 400, "F"));
      studArray.add(new Student("Graf", "Duke", 5.0, 502, "M"));

        //studArray.InsertionSort();
       // System.out.println();
        studArray.printArray();

        System.out.println("**********************************************************************");
        System.out.println("After sort:");

        int group = 400;
        int st = studArray.searchForGoodGirls( group);
        System.out.println("**********************************************************************");
        System.out.println("We have " + st + " excellent students of " + group + " group");

    }

}
