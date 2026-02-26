package Bai3;

import java.util.Scanner;

public class Phan1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.println("Nhập số phần tử của mảng 1: ");
            n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Nhập các phần tử của mảng: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int m;
            System.out.println("Nhập số phần tử của mảng 2: ");
            m = sc.nextInt();
            int[] arr2 = new int[m];
            System.out.println("Nhập các phần tử của mảng: ");
            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }
            int flag = 0;
            int count = 0;
            int[] arr3 = new int[n + m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr3[j]) {
                        flag++;
                    }
                }
                if (flag == 0) {
                    arr3[count] = arr[i];
                    count++;
                }
                flag = 0;
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr2[i] == arr3[j]) {
                        flag++;
                    }
                }
                if (flag == 0) {
                    arr3[count] = arr2[i];
                    count++;
                }
                flag = 0;
            }

            int[] arr4 = new int[count];
            for (int i = 0; i < count; i++) {
                arr4[i] = arr3[i];
            }
            for (int i = 0; i < count; i++) {
                System.out.print(arr4[i] + " ");
            }
        }
}
