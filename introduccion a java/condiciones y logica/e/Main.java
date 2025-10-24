import java.util.Scanner;
//tipos de triangulos
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), y = scanner.nextInt(), z = scanner.nextInt();
        if (x == y && x == z) {
            System.out.println("equilatero");
        } else if (x == y || x == z || z == y) {
            System.out.println("isosceles");
        } else { 
            System.out.println("escaleno");
        }

    }
}