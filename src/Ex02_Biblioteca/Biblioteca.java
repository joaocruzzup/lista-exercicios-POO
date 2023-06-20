package Ex02_Biblioteca;

public class Biblioteca {
    private String nome;
    private String genero;
    private int isbn;
    private String autor;

    public Biblioteca(){

    }

    public Biblioteca registrarLivro(int isbn){
        setIsbn(isbn);
        System.out.println("O livro foi registrado com o isbn" + getIsbn());
        Biblioteca livro = new Biblioteca();
        livro.setIsbn(isbn);
        return livro;
    }

    public void registrarLivro(int isbn, String nome){
        setIsbn(isbn);
        setNome(nome);
        System.out.println("O livro foi registrado com o isbn: " + getIsbn() + " e o nome: " + getNome());
    }

    public void registrarLivro(int isbn, String nome, String genero){
        setIsbn(isbn);
        setNome(nome);
        setGenero(genero);
        System.out.println("O livro foi registrado com o isbn: " + getIsbn() + " e o nome: " + getNome() + " e o gênero: " + getGenero());
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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
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
        return "Biblioteca{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", isbn=" + isbn +
                ", autor='" + autor + '\'' +
                '}';
    }
}
