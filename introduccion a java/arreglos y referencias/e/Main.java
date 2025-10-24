import java.util.*;
import java.util.Arrays;
//ulam ordenando
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int aux = 0;
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(n);
        while (n != 1){
              if (n % 2 == 0){
                 n /= 2;
              } else if (n % 2 != 0){
                        n = (n * 3) + 1; 
              }
              numeros.add(n);
              
        }
        Collections.sort(numeros);
        for (int i = 0; i < numeros.size(); i++){
            if (numeros.get(i) != 0){
               System.out.print(numeros.get(i) + " ");
            }
        }

        
    }
}