import java.util.Scanner;
//maquina descompuestas
public class Main {
    public static boolean esLetra(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
    public static boolean esNumero(char c) {
        return (c >= '0' && c <= '9');
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        String arreglado = "";
        arreglado += Character.toUpperCase(nombre.charAt(0));
        if (nombre.length() > 1){
           arreglado += Character.toLowerCase(nombre.charAt(1));
        }
    
        boolean punto = false;

        if (nombre.length() > 1 && nombre.charAt(0) == '.' || nombre.length() > 1 && nombre.charAt(1) == '.'){
               punto = true; 
        }
        for (int i = 2; i < nombre.length(); i++){
            if (nombre.charAt(i) == '.'){
               punto = true; 
            }
            if (esLetra(nombre.charAt(i)) && punto) {
               arreglado += Character.toUpperCase(nombre.charAt(i)); 
               punto = false;
            } else if (esLetra(nombre.charAt(i))){
               arreglado  += Character.toLowerCase(nombre.charAt(i)); 
            } else {
                arreglado += nombre.charAt(i);
            }
        }
        System.out.println(arreglado);
    }
}