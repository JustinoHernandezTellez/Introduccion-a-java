import java.util.Scanner;
//cuantos dias tiene febrero
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt() , d = scanner.nextInt();
        int count [] = new int[1005];
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0){
            System.out.print("29 ");
        } else {
            System.out.print("28 ");
        }

        if ((b % 4 == 0 && b % 100 != 0) || b % 400 == 0){
            System.out.print("29 ");
        } else {
            System.out.print("28 ");
        }

        if ((c % 4 == 0 && c % 100 != 0) || c % 400 == 0){
            System.out.print("29 ");
        } else {
            System.out.print("28 ");
        }

        if ((d % 4 == 0 && d % 100 != 0) || d % 400 == 0){
            System.out.print("29 ");
        } else {
            System.out.print("28 ");
        }
        

    }
}