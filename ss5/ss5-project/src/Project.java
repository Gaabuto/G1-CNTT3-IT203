import java.util.*;

public class Project {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    twoSum();
                    break;
                case 2:
                    moveZeroes();
                    break;
                case 3:
                    validPalindrome();
                    break;
                case 4:
                    reverseWords();
                    break;
                case 5:
                    happyNumber();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println(" Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }

    static void showMenu() {
        System.out.println("\n====== MENU THUẬT TOÁN ======");
        System.out.println("1. Two Sum");
        System.out.println("2. Move Zeroes");
        System.out.println("3. Valid Palindrome");
        System.out.println("4. Reverse Words");
        System.out.println("5. Happy Number");
        System.out.println("0. Thoát");
        System.out.println("============================");
    }

    static void twoSum() {
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhập target: ");
        int target = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Tìm thấy tại chỉ số: " + i + " và " + j);
                    return;
                }
            }
        }

        System.out.println("Không tìm thấy cặp số phù hợp.");
    }

    static void moveZeroes() {
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < n) {
            arr[index++] = 0;
        }

        System.out.println("Mảng sau khi dồn 0:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void validPalindrome() {
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println("Kết quả: false");
                return;
            }
            left++;
            right--;
        }

        System.out.println("Kết quả: true");
    }

    static void reverseWords() {
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) result.append(" ");
        }

        System.out.println("Chuỗi sau khi đảo: " + result);
    }

    static void happyNumber() {
        System.out.print("Nhập số n: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumSquareDigits(n);
        }

        if (n == 1) {
            System.out.println("Đây là số hạnh phúc");
        } else {
            System.out.println("Không phải số hạnh phúc");
        }
    }

    static int sumSquareDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }
}
