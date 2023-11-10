package Lottery;

import java.util.ArrayList;
import java.util.Collections;
public class Lottery {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++) {
            values.add(i);
        }
        Collections.shuffle(values);
        System.out.println(values.subList(0, 10));
    }
}
