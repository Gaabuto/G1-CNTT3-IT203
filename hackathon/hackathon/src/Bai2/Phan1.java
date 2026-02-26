package Bai2;

import java.util.Scanner;

public class Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số phần tử của mảng: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n ; i++){
            if(arr[i] <= 0){
                int x = arr[i];
            for(int j = i + 1; j < n; j++){
                    arr[j-1] = arr[j];
                }
                arr[n-1] = x;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
