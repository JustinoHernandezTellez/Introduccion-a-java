import java.util.Scanner;
//pares e impares
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int aux = 0, par = 0, impar = 0;
        for (int  i = 0; i < n; i++){
            aux = scanner.nextInt();
            if (aux % 2 == 0){
               par++; 
            } else {
               impar++; 
            }
        } 
        System.out.println(par + " " + impar);
    }
}