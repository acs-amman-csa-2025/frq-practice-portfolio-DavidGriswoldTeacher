import java.util.*;
import java.io.*;

public class problem8 {
    public static void main(String[] args) throws Exception {
        ArrayList<Person> people = new ArrayList<Person>();

        File f = new File("data/people.txt");
        Scanner input = new Scanner(f);
        // PART 1 - READ IN THE FILE
        while (input.hasNextLine()) {
            String line = input.nextLine(); // "David Griwold 42 Teacher"
            String[] parts = line.split(" "); // ["David","Griswold","42","Teacher"]
            int age = Integer.parseInt(parts[2]); // age = 42
            Person p = new Person(parts[0], parts[1], age, parts[3]);
            people.add(p);
        }
        input.close();

        // PART 2 - Work with ArrayLists
        double sum = 0;
        for (Person p : people) {
            System.out.println(p.getFirstName() + " " + p.getLastName());

        }
        System.out.println("Average age is: " + (sum / people.size()));

        int under25 = 0;
        for (Person p : people) {
            if (p.getAge() < 25) {
                under25++;
                System.out.println(p.getFirstName() + " " + p.getLastName() + " is under 25");
            }
        }
        System.out.println(under25 + " total people under 25");

        people.add(new Person("Bassel", "H", 17, "LamestHumanOnEarth"));
        people.add(new Person("Pete", "Reid", 43, "HistoryTeacher"));
        System.out.println(people);

        //
        PrintWriter pw = new PrintWriter(f);
        for (Person p : people) {
            pw.println(p.getFirstName() + " " + p.getLastName() + " " + p.getAge() + " " + p.getCareer());
        }
        pw.close();
    }
}
