import java.util.Scanner;
// ordenando numeros
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt() , d = scanner.nextInt();
        int count [] = new int[1005];
        for (int i = 0; i < 1005; i++){
            count[i] = 0;
        }
        count[a] += 1;
        count[b] += 1;
        count[c] += 1;
        count[d] += 1;
        for (int i = 0; i < 1005; i++){
            while(count [i] != 0){
               System.out.print(i + " ");
               count[i] -= 1; 
            }
        }

    }
}