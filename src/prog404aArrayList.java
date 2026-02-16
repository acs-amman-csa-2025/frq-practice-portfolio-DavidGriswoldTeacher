import java.util.*;
import java.io.*;

public class prog404aArrayList {

    public static void main(String[] args) throws Exception {
        File f = new File("data/prog404a.txt");
        Scanner in = new Scanner(f);

        // constructor for making an arraylist of integers
        ArrayList<Integer> positives = new ArrayList<Integer>();
        ArrayList<Integer> negatives = new ArrayList<Integer>();

        while (in.hasNextInt()) {
            int next = in.nextInt();
            if (next > 0) {
                // add the next element to the end of positives list
                positives.add(next);
            } else {
                // add the next element to the end of negatives list
                negatives.add(next);
            }
        }
        // positives.size() tells how many elements are in the li
        for (int i = 0; i < Math.min(positives.size(), negatives.size()); i++) {
            // positives.get(i) gets the value at position i
            System.out.println(positives.get(i) + " " + negatives.get(i));
        }
        for (int i = positives.size(); i < negatives.size(); i++) {
            System.out.println("   " + negatives.get(i));
        }
        for (int i = negatives.size(); i < positives.size(); i++) {
            System.out.println(positives.get(i));
        }
    }
}