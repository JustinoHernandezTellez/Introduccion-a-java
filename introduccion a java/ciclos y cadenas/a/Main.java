import java.util.Scanner;
//ciclo mientras no cero
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 0, aux = 1;

        while (aux != 0){
              aux = scanner.nextInt();
              ans += aux;  
        }
        System.out.println(ans);

    }
}