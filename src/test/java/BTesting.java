import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;

public class BTesting {

    //1. Test Case: Basic Map Modification
    @Test
    public void test_Method2_ModifiesMapCorrectly() {
        B b = new B();
        Map<String, Boolean> inputMap = new HashMap<>();
        inputMap.put("Varun", false);
        inputMap.put("Saurabh", false);

        Map<String, Boolean> resultMap = b.method2(inputMap);

        assertEquals(2, resultMap.size(), "Map size should be 2");
        assertFalse(resultMap.get("Varun"), "Varun should be false");
        assertTrue(resultMap.get("Saurabh"), "Saurabh should be true");
    }

    //2. Test Case: Handling Null Input
    @Test
    public void test_Method2_NullMap() {
        B b = new B();

        Map<String, Boolean> resultMap = b.method2(null);

        assertNotNull(resultMap, "Result map should not be null");
        assertEquals(2, resultMap.size(), "Map size should be 2");
        assertFalse(resultMap.get("Varun"), "Varun should be false");
        assertTrue(resultMap.get("Saurabh"), "Saurabh should be true");
    }


    //3. Test Case: Large Map Handling
    @Test
    public void test_Method2_LargeMap() {
        B b = new B();

        // Initially containing only "Varun" and "Saurabh"
        Map<String, Boolean> inputMap = new HashMap<>();
        inputMap.put("Varun", true);
        inputMap.put("Saurabh", false);

        Map<String, Boolean> resultMap = b.method2(inputMap);

        assertEquals(2, resultMap.size(), "Map size should be 2");
        assertTrue(resultMap.containsKey("Saurabh"), "Saurabh should be present in the map");
        assertTrue(resultMap.get("Saurabh"), "Saurabh should be true");
    }
}