import java.util.ArrayList;
import java.util.List;
public class Gugudan {
    public static List<Integer> calculate(int times) {
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= times; i++) {
            for(int j = 1; j <= times; j++)
                result.add(i * j);
        }
        return result;
    }
}