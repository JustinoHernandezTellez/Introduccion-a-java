import java.util.Scanner;
//una serie un poco interesante
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numero = scanner.nextInt();
        long posiciones = scanner.nextInt();
        long numero_der = 0, numero_izq = 0;
        if (posiciones % 3 == 0){
            numero_izq = numero;
            numero_der = numero;
            
        } else if ((posiciones - 1) % 3 == 0){
                if (numero == 1){
                    numero_izq = 3;
                    numero_der = 2;
                } else if (numero == 2){
                    numero_izq = 1;
                    numero_der = 3;    
                } else if (numero == 3){
                    numero_izq = 2;
                    numero_der = 1;
                }
        } else if ((posiciones + 1) % 3 == 0){
                if (numero == 1){
                    numero_izq = 2;
                    numero_der = 3;
                } else if (numero == 2){
                    numero_izq = 3;
                    numero_der = 1;    
                } else if (numero == 3){
                    numero_izq = 1;
                    numero_der = 2;
                }
        }
        System.out.println(numero_izq + " " + numero_der);
    }
}
/// 2 1 2 3 1 2 3 1 2 3 1 2 3 1 2 3
///       7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
/// 3 % 3 == 0
/// 2 % 3 == 2
/// 1 % 3 == 1
/// 5 % 3 ==  
/// 4 % 3 == 
/// 6 % 3 ==