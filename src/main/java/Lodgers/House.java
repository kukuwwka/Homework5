package Lodgers;

import java.util.*;

public class House {
    public static void main(String[] args) {
        HashMap<String, Integer> namesAge = new HashMap<>();
        namesAge.put("Антонов Антон Антонович", 29);
        namesAge.put("Вениаминов Вениамин Вениаминович", 12);
        namesAge.put("Иванов Иван Иванович", 16);
        namesAge.put("Петров Пётр Петрович", 23);

        for (Map.Entry<String, Integer> entry : namesAge.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value >= 18) {
                List<String> list = new ArrayList<String>(namesAge.keySet());
                Collections.sort(list);
                System.out.println(list);
            }
        }
    }
}







