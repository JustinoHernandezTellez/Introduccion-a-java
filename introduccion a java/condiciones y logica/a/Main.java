import java.util.Scanner;
//par impar
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x % 2 == 0){
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }
}