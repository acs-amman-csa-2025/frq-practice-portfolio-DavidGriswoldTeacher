import java.io.*;
import java.util.*;

public class prog260a {
    public static void main(String[] args) throws Exception {
        File f = new File("data/prog206a.txt");
        Scanner in = new Scanner(f);
        ArrayList<Integer> classes = new ArrayList<Integer>();
        ArrayList<Integer> grades = new ArrayList<Integer>();
        ArrayList<Integer> genders = new ArrayList<Integer>();

        while (in.hasNextInt()) {
            // each row has one of each value
            classes.add(in.nextInt());
            grades.add(in.nextInt());
            genders.add(in.nextInt());
        }

        int count10 = 0, count11 = 0, count12 = 0;
        for (int c : classes) {
            if (c == 10) {
                count10++;
            } else if (c == 11) {
                count11++;
            } else if (c == 12) {
                count12++;
            }
        }
        System.out.println("10: " + count10);
        System.out.println("11: " + count11);
        System.out.println("12: " + count12);
    }
}
