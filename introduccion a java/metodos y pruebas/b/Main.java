import java.util.Scanner;
//diametro radio perimetro de un circulo
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = scanner.nextDouble();
        double pi = 3.141592;
        double radio = Math.sqrt(area / pi);
        double perimetro = 2 * radio;
        double diametro  = 2 * pi * radio;
        System.out.printf("%.2f%n", perimetro);
        System.out.printf("%.2f%n", radio);
        System.out.printf("%.2f%n", diametro);
    }
}