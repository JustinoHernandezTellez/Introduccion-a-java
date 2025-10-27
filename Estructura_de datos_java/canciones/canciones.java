public class canciones {
    private String artista;
    private String titulo;
    private String autor;

    public canciones(){

    }
    public canciones(String artista, String titulo, String autor){
        this.artista = artista;
        this.autor = autor;
        this.titulo = titulo;
    }
    
    public String getArtista(){
        return artista;
    }

    public void setArtista(String artista){
        this.artista = artista;
    }

    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
}
