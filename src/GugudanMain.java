import java.util.List;

public class GugudanMain {
    public static void main(String[] args) {
        List<Integer> result = Gugudan.calculate(GugudanInput.input());
        GugudanOutput.print(result);
    }
}
