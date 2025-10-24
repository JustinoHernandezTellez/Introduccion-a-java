import java.util.Scanner;
//repartiendo cachorros
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt(), p = scanner.nextInt(), h = scanner.nextInt(), quedan;
        quedan = (c - p) % (1 + h);
        System.out.println(quedan + p);
    }
}