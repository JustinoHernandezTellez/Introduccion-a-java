import java.util.Scanner;
//asteriscos
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 0;i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}