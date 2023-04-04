import java.util.ArrayList;
import java.util.List;

public class Gugudan {
    public static List<Integer> calculate (int times) {
        List<Integer> result = new ArrayList<>(9);
        for (int i=0; i< 9; i++) {
            result.add(i, times * (i+1));
        }
        return result;
    }
}