import java.util.Scanner;
import java.util.Stack;

public class Bai1Zalo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n:");
        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        while(n > 0){
            stack.push(n%2);
            n /= 2;
        }
        System.out.println("Binary representation:");
        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
