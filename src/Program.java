import java.util.*;

public class Program {

    public static void main(String[] args) {

        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "AAA" + "," + "BBB" + "," + "CCC");
        states.put(2, "AAA" + "," + "BBB");
        states.put(3, "AAA" + "," + "DDD");
        states.put(4, "AAA" + "," + "2" + "," + "01/01/2015");
        states.put(5, "3" + "," + "ZZZ" + "," + "5623");

        String first = states.get(2);
        System.out.println(first);
        Set<Integer> keys = states.keySet();
        Collection<String> values = states.values();
        states.replace(1, "AAA" + "," + "BBB" + "," + "CCC");
        for (Map.Entry<Integer, String> item : states.entrySet()) {

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }

    }
}