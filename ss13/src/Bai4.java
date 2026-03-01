import java.util.*;

public class Bai4 {
    public static void main(String[] args) {
        List<String> sick = new ArrayList<>();
        sick.add("Cúm A");
        sick.add("Sốt xuất huyết");
        sick.add("Cúm A");
        sick.add("Covid-19");
        sick.add("Cúm A");
        sick.add("Sốt xuất huyết");

        TreeMap<String, Integer> report = new TreeMap<>();

        Collections.sort(sick);

        for (String s: sick){
            if (report.containsKey(s)){
                int count = report.get(s);
                report.put(s, count+1);
            }else{
                report.put(s, 1);
            }
        }

        for (String key : report.keySet()) {
            System.out.println(key + ": " + report.get(key) + " ca");
        }
    }
}
