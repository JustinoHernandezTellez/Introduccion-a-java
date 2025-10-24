import java.util.Scanner;
//HORA EN UN PLANETA LEJANO
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dias = 0, horas = 0, minutos = 0, segundos = 0;
        int s = scanner.nextInt();
        for (int i = 1; i <= s; i++){
            segundos++;
            if (segundos == 50){
               segundos = 0;
               minutos++; 
            }
            if (minutos == 70){
               minutos = 0;
               horas++; 
            }
            if (horas == 12){
               horas = 0;
               dias++; 
            }
        }
        System.out.println(dias + " " + horas + " " + minutos + " " + segundos);

    }
}