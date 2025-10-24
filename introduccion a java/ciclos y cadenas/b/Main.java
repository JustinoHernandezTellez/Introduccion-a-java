import java.util.Scanner;
//up_curp
public class Main {
    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.next();
        String apellidop = scanner.next();
        String apellidom = scanner.next();
        String ucurp = ""; 
        String dia = scanner.next(), mes = scanner.next(), anio = scanner.next();
        ucurp += apellidop.charAt(0);
        for (int i = 1; i < apellidop.length(); i++){
            if (esVocal(apellidop.charAt(i))){
                ucurp += apellidop.charAt(i);
                break;
            }
        }
        ucurp += apellidom.charAt(0);
        ucurp += nombre.charAt(0);
        ucurp += anio.charAt(2);
        ucurp += anio.charAt(3);
 
        ucurp += mes.charAt(0);
        ucurp += mes.charAt(1);

        ucurp += dia.charAt(0);
        ucurp += dia.charAt(1);

        System.out.println(ucurp);
    }
}