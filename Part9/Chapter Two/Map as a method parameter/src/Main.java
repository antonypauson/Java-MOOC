import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("2", "second");
        names.put("1", "first");

        System.out.println(returnSize(names));
    }

    public static int returnSize(Map<String, String> map) {
        return map.size();
    }
}
