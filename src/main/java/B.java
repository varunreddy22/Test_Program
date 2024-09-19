import java.util.Map;
import java.util.HashMap;
    public class B{

        public Map<String, Boolean> method2(Map <String, Boolean> m){

            if (m == null) {
                m = new HashMap<>();
            }

            m.put("Varun", false);
            m.put("Saurabh", true);

            return m;
        }
    }



