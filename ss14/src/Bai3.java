import java.util.Set;
import java.util.TreeSet;

public class Bai3 {
    public static void main(String[] args) {
        Set<String> elementMedicine = new TreeSet<>();
        elementMedicine.add("Aspirin");
        elementMedicine.add("Caffeine");
        elementMedicine.add("Paracetamol");

        Set<String> allergy = new TreeSet<>();
        allergy.add("Aspirin");

        Set<String> warning = new TreeSet<>(elementMedicine);
        warning.retainAll(allergy);

        Set<String> safe = new TreeSet<>(elementMedicine);
        safe.removeAll(allergy);

        System.out.printf("Cảnh báo dị dứng: ");
        System.out.println(warning);
        System.out.printf("Thành phần an toàn: ");
        System.out.println(safe);

    }
}