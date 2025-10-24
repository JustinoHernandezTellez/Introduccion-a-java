import java.util.Scanner;
import java.util.Arrays;
//anagrama
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        char[] a_c = a.toCharArray();
        char[] b_c = b.toCharArray();
        Arrays.sort(a_c);
        Arrays.sort(b_c);
        String a_o = new String(a_c);
        String b_o = new String(b_c);
        if (a_o.equals(b_o)){
           System.out.println("SI son anagramas"); 
        } else {
           System.out.println("NO son anagramas");  
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