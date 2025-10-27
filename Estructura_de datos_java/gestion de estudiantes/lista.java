import java.util.*;

public class lista {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        List<canciones> lista = new ArrayList<canciones>();
        boolean band = false;
        while (true){
            band = false;
            System.out.println("1.- Ver todas las canciones\n2.- Agregar cancion\n3.- Buscar una cancion por titulo\n4.- Buscar una cancion por artista\n5.- Buscar una cancion por autor");
            int op = leer.nextInt();
            if (op == 1) {
               for (canciones canciones : lista) {
                   System.out.println("El titulo de la cancion es: " + canciones.getTitulo() + " \t el nombre del artista es: " + canciones.getArtista() + " \t el nombre del autor es: " + canciones.getAutor()); 
               }
            } else if (op == 2){
                String titulo, autor,artista;
                System.out.println("Ingrese el titulo, autor y artista con saltos de linea");
                leer.nextLine();
                titulo = leer.nextLine();
                autor = leer.nextLine();
                artista = leer.nextLine();
                lista.add(new canciones(artista, titulo, autor)); 
            } else if (op == 3){
                String titulo;
                System.out.println("Ingrese el titulo a buscar");
                leer.nextLine();
                titulo = leer.nextLine();
                for (canciones canciones : lista) {
                    if (canciones.getTitulo().equals(titulo)){
                        band = true;
                       System.out.println("El titulo de la cancion es: " + canciones.getTitulo() + "\t el nombre del artista es: " + canciones.getArtista() + " \t el nombre del autor es: " + canciones.getAutor()); 
                    }
                    if (band == false){
                        System.out.println("No se encontro");
                    }
                }
            } else if (op == 4){
                String artista;
                System.out.println("Ingrese el artista a buscar");
                leer.nextLine();
                artista = leer.nextLine();
                for (canciones canciones : lista) {
                    if (canciones.getArtista().equals(artista)){
                       band = true;
                       System.out.println("El titulo de la cancion es: " + canciones.getTitulo() + "\t el nombre del artista es: " + canciones.getArtista() + " \t el nombre del autor es: " + canciones.getAutor()); 
                    }
                    if (band == false){
                        System.out.println("No se encontro");
                    }
                }
            } else if (op == 5){
                String autor;
                System.out.println("Ingrese el autor a buscar");
                leer.nextLine();
                autor = leer.nextLine();
                for (canciones canciones : lista) {
                    if (canciones.getAutor().equals(autor)){
                       band = true;
                       System.out.println("El titulo de la cancion es: " + canciones.getTitulo() + "\t el nombre del artista es: " + canciones.getArtista() + " \t el nombre del autor es: " + canciones.getAutor()); 
                    }
                    if (band == false){
                        System.out.println("No se encontro");
                    }
                }
            }             
        }
       
    }   
}
