import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {

    System.out.println("구구단 중 출력할 단은?");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Number : " + n + "단");

    if (2 <= n && n <= 9) {
        for (int i = 1; i<10; i++) {
            System.out.println(n * i);
        }
    }  else {
        System.out.println("2이상 9이하의 값만 입력할 수 있습니다.");
    }

    }
}