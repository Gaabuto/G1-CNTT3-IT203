package bai5;

import java.util.TreeSet;

public class Bai5 {
    public static void main(String[] args) {
        TreeSet<Patient> queue = new TreeSet<>();

        queue.add(new Patient("A", 3, "08:00"));
        queue.add(new Patient("B", 1, "08:15"));
        queue.add(new Patient("C", 1, "08:05"));

        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}