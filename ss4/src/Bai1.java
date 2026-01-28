import java.util.Locale;
import java.util.Scanner;

public class Bai1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String title = "lap    Trinh    java   Co   BaN";
        String author = "nguyễn văn a";
        title = title.trim().replaceAll("\\s+", " ").toUpperCase();

        System.out.println(title);
    }
}
