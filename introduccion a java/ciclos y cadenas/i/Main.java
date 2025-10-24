import java.util.*;
//invertir palabras
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder output = new StringBuilder();  

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            StringBuilder word = new StringBuilder();

            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (ch != ' ') {
                    word.append(ch);  
                } else {
                   
                    output.append(word.reverse());
                    output.append(' ');
                    word.setLength(0); 
                }
            }

            // última palabra de la línea
            output.append(word.reverse());
            output.append('\n');
            word.setLength(0);
        }

        System.out.print(output);  // imprime todo al final
    }
}