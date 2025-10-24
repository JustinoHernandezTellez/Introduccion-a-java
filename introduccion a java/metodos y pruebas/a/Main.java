import java.util.Scanner;
//pitagoras
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double ans = Math.sqrt((x * x)  + (y * y));
        System.out.printf("%.3f%n", ans);
    }
}