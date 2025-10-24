import java.util.*;
//decimal a binario
public class Main {
    public static void mostrarBinario(long valor) {
           if (valor > 0) {
              mostrarBinario(valor / 2);
              System.out.println(valor % 2);
           }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        if (n < 0 || n > 500) {
           System.out.println("Error");             
        } else {
                  mostrarBinario(n); 
        }
    }
}