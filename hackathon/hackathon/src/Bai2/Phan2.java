package Bai2;

import java.util.Scanner;

public class Phan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
        System.out.println("Nhập số phần tử của mảng: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x;
        System.out.println("Nhap số cần xóa: ");
        x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                for( int j = i + 1; j < n; j++){
                    arr[j-1] = arr[j];
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                count++;
            }
        }
        for (int i = 0; i < n - count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
