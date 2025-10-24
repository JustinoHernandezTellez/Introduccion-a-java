import java.util.Scanner;
//reverso
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numeros [] = new int[n];
        for (int i = 0; i < n; i++){
            numeros[i] = scanner.nextInt();
        }

        for (int i = n - 1; i >= 0; i--){
            System.out.print(numeros[i] + " ");
        }
    }
}
//1073741824
/*
 * 
i love you
3
Hay 10 tipos de personas, las que saben binario y las que no
Tengo 1 gato en mis 2 botas
16 people like this!
 * 
 */