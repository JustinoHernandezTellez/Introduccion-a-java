import java.util.Scanner;
//evaluando formulas en sucesion 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = (x + 5) / (2 * (x + 1));
        double z = ((y * y) + (x * (x - (2 * y)))) / (x * y);
        System.out.println(z);
    }
}