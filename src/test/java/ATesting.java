
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;


public class ATesting {

    //1. Test Case: Basic Functionality
    @Test
    public void test_Method1_BasicFunctionality() {
        A a = new A();
        B b = new B();
        Map<String, Boolean> expectedMap = new HashMap<>();
        expectedMap.put("Varun", false);
        expectedMap.put("Saurabh", true);

        Map<String, Boolean> actualMap = b.method2(new HashMap<>(expectedMap));

        assertEquals(expectedMap, actualMap, "The resulting map should match the expected map");
    }

    //2. Test Case: Empty Input Map
    @Test
    public void test_Method1_EmptyInput() {
        A a = new A();
        B b = new B();
        Map<String, Boolean> expectedMap = new HashMap<>();
        expectedMap.put("Varun", false);
        expectedMap.put("Saurabh", true);

        Map<String, Boolean> actualMap = b.method2(new HashMap<>());

        assertEquals(expectedMap, actualMap, "The resulting map should match the expected default map for empty input");
    }


    //3. Test Case: Handling Null Input
    @Test
    public void test_Method1_NullInput() {
        A a = new A();
        B b = new B();
        Map<String, Boolean> expectedMap = new HashMap<>();
        expectedMap.put("Varun", false);
        expectedMap.put("Saurabh", true);

        Map<String, Boolean> actualMap = b.method2(null);

        assertNotNull(actualMap, "The result map should not be null");
        assertEquals(expectedMap, actualMap, "The resulting map should match the expected default map for null input");
    }
}

