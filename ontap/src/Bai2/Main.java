package Bai2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập danh sách chuỗi email:(Nhập chuỗi)");
        String email = sc.nextLine();
        Map<String> map = new HashMap<>();
        email = email.split(",")[0].trim();
        if(email != "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"){
            System.out.println("Email không hợp lệ.");
        } else {

        }

    }
}
