import java.util.Scanner;
//calculando logaritmo base 2
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long logg = 0;
        for (long i = 2; i <= n; i *= 2){
            //System.out.println(i);
            logg++;
        }
        System.out.println(logg);
    }
}
//1073741824