import java.util.Scanner;
//encontrando digitos
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String parrafo [] = new String[n];
        int cont [] = new int[10]; 
        for (int i  = 0; i < 10; i++){
            cont[i] = 0;
        }

        for (int i = 0; i < n; i++){
            parrafo[i] = scanner.nextLine();
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < parrafo[i].length(); j++){
                if (parrafo[i].charAt(j) == '0'){
                   cont[0]++; 
                } else if (parrafo[i].charAt(j) == '1'){
                   cont[1]++; 
                } else if (parrafo[i].charAt(j) == '2'){
                   cont[2]++; 
                } else if (parrafo[i].charAt(j) == '3'){
                   cont[3]++; 
                } else if (parrafo[i].charAt(j) == '4'){
                   cont[4]++; 
                } else if (parrafo[i].charAt(j) == '5'){
                   cont[5]++; 
                } else if (parrafo[i].charAt(j) == '6'){
                   cont[6]++; 
                } else if (parrafo[i].charAt(j) == '7'){
                   cont[7]++; 
                } else if (parrafo[i].charAt(j) == '8'){
                   cont[8]++;
                } else if (parrafo[i].charAt(j) == '9'){
                   cont[9]++; 
                }
            }
        }
        System.out.println("El 0 aparece " + cont[0] + " veces.");
        System.out.println("El 1 aparece " + cont[1] + " veces.");
        System.out.println("El 2 aparece " + cont[2] + " veces.");
        System.out.println("El 3 aparece " + cont[3] + " veces.");
        System.out.println("El 4 aparece " + cont[4] + " veces.");
        System.out.println("El 5 aparece " + cont[5] + " veces.");
        System.out.println("El 6 aparece " + cont[6] + " veces.");
        System.out.println("El 7 aparece " + cont[7] + " veces.");
        System.out.println("El 8 aparece " + cont[8] + " veces.");
        System.out.println("El 9 aparece " + cont[9] + " veces.");
    }
}
//1073741824
/*
 * 
3
Hay 10 tipos de personas, las que saben binario y las que no
Tengo 1 gato en mis 2 botas
16 people like this!
 * 
 */