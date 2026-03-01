import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai2 {
    public static void main (String[] args) {
        HashMap<String, String> medicine = new HashMap<>();
        medicine.put("T01", "Parabol");
        medicine.put("T02", "Amoxicillin");
        medicine.put("T03", "Melatonin");
        medicine.put("T04", "Diazepam");
        medicine.put("T05", "Atorvastatin");

        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập mã thuốc: ");
        String searchMedicine = sc.nextLine();

        if (medicine.containsKey(searchMedicine)){
            System.out.println("Tên thuốc: " + medicine.get(searchMedicine));
        }else{
            System.out.println("Thuốc không tồn tại");
        }
    }
}