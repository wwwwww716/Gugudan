import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Number" + n + "단");

        int[] result = new int[n];

        for (int i = 2; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
    }

}