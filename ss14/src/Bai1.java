import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bai1 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Nguyễn Văn A – Yên Bái");
        set.add("Trần Thị B – Thái Bình");
        set.add("Nguyễn Văn A – Yên Bái");
        set.add("Lê Văn C – Hưng Yên");

        for (String s: set){
            System.out.printf("%s, ", s);
        }
    }
}