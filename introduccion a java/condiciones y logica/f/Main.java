import java.util.Scanner;
//el lado mas corto
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1,y1, x2,y2, x3,y3, x4,y4;
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();

        x4 = scanner.nextDouble();
        y4 = scanner.nextDouble();

        double res1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double res2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double res3 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        double res4 = Math.sqrt(Math.pow(x4 - x1, 2) + Math.pow(y4 - y1, 2));
        double min = 999999;
        if (res1 < min){
           min = res1; 
        }
        if (res2 < min){
           min = res2; 
        }
        if (res3 < min){
           min = res3; 
        }
        if (res4 < min){
           min = res4; 
        }
        System.out.printf("%.6f%n", min);
    }
}