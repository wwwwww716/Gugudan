import java.util.Iterator;
import java.util.List;

public class GugudanOutput {
    public static void print(List<Integer> result) {
        Iterator iter = result.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
