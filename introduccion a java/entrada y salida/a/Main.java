import java.util.Scanner;
//area de una triangulo
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura = 0, base = 0;
        base = scanner.nextInt();
        altura = scanner.nextInt();
        int ans = (base * altura) / 2;
        System.out.println(ans); 

    }
}