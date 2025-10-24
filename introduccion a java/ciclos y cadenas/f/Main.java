import java.util.Scanner;
//k-esimo numero primo
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int contador = 0;
        int primo = 0;
        boolean es = false;
        for (int i = 2; i <= 10000; i++){  
            es = false;  
            for (int j = 2; j * j <= i; j++){
                if (i % j == 0){
                   es = true;
                   break;  
                }
            }
            
            if (!es){
               contador++;
               primo = i; 
            }

            if (contador == k){
               break; 
            } 
        }
        System.out.println(primo);
    }
}