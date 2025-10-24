import java.util.*;
//palindromos sin ceros consecutivos
public class Main {
    public static long DP[] = new long [80];
    static long generar(long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (DP[(int) n] != -1)  return DP[(int)n];
        DP[(int) n] = generar(n - 1) + generar(n - 2);
        return DP[(int)n];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 80; i++){
            DP[i] = -1;
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long resultado = 0;
        long L = (n + 1) / 2;
        if (n == 0){
           resultado = 1;
        } else if (n % 2 == 1){  
            resultado = generar(L+2);
        } else {
            resultado = generar(L+1);
        }

        System.out.println(resultado);
        
    }
}