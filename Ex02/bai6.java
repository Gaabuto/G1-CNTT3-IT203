package Ex02;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int borrowCount;
        int max = -1;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int openDays = 0;
        for (int i = 1; i <= 7; i++) {
            System.out.println("Nhap so luot muon ngay Thu " + i + ": ");
            borrowCount = Integer.parseInt(sc.nextLine());
            if (borrowCount == 0) {
                continue;
            }
            if (borrowCount > max) {
                max = borrowCount;
            }
            if (borrowCount < min) {
                min = borrowCount;
            }
            sum += borrowCount;
            openDays++;
        }
        double average = 0;
        if (openDays > 0) {
            average = (double) sum / openDays;
        }
        System.out.println("\n--- KET QUA THONG KE ---");
        System.out.println("Luot muon cao nhat: " + max);
        System.out.println("Luot muon thap nhat: " + min);
        System.out.println("Trung binh luot muon/ngay: " + average);
    }
}