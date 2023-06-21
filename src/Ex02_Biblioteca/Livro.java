package Ex02_Biblioteca;

public class Livro {
    private String nome;
    private String genero;
    private String isbn;
    private String autor;
    private static int contador = 0;
    private int id;

    public Livro(){
        contador+=1;
        id = contador;
    }

    public Livro(String nome, String genero, String isbn, String autor) {
        this.nome = nome;
        this.genero = genero;
        this.isbn = isbn;
        this.autor = autor;
        contador+=1;
        id = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro " + this.id + " [" +
                " Nome: '" + nome + '\'' +
                " | Gênero: '" + genero + '\'' +
                " | ISBN: " + isbn +
                " | Autor: " + autor + '\'' +
                " ]";
    }
}
