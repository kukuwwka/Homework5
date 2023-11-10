package Lodgers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
                System.out.println(key + " " + value);
            }
        }
    }
}




