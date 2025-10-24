import java.util.Scanner;
import java.util.Arrays;
//tablas
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numeros [] = new int[n];
        for (int i = 0; i < n; i++){
            numeros[i] = scanner.nextInt();
            for (int j = 1; j <= 10; j++){
                int ans = numeros[i] * j;
                System.out.println(numeros[i] + "x" + j + "=" + ans);
            }
            System.out.println();
        }
        
    }
}
