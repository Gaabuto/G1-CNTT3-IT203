package Bai1;

import java.util.Scanner;

public class Phan2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str;
            System.out.println("Nhập chuỗi: ");
            str = sc.nextLine();

            str = str.toLowerCase();
            int flag = 0;
            char max = str.charAt(0);
            int count = 0;
            for(int i = 0; i < str.length(); i++){
                for(int j =0; j < i; j++){
                    if(str.charAt(i) == str.charAt(j)){
                        flag ++;
                        break;
                    }
                }
                if(flag == 0){
                    for(int k = i; k < str.length(); k++){
                        if(str.charAt(k) == str.charAt(i)){
                            count++;
                        }
                    }
                    if(count > max){
                        max = str.charAt(i);
                    }
                }
                    flag = 0;
                    count = 0;
            }
                System.out.println("Kí tự xuất hiện nhiều nhất là: " + max);
        }
}
