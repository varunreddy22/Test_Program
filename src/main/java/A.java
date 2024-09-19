

import java.util.Map;
import java.util.HashMap;

public class A {

    public void method1() {

        Map<String, Boolean> map = new HashMap<>();

        map.put("Varun", false);
        map.put("Saurabh", false);

        // Before modification
        //System.out.println("Initial map size: " + map.size());
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            System.out.println("Initial Entry: " + entry.getKey() + "," + entry.getValue());
        }
        System.out.println();

        B b = new B();
        Map<String, Boolean> mapFinal = b.method2(map);

        //After Modification
        //System.out.println("Final map size: " + mapFinal.size());
        for (Map.Entry<String, Boolean> entry : mapFinal.entrySet()) {
            System.out.println("Final Entry: " + entry.getKey() + "," + entry.getValue());
        }

    }
}
