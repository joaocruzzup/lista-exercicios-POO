package Ex02_Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class MainBiblioteca {
    public static void main(String[] args) {
        List<Livro> estanteLivros = new ArrayList<>();

        // Criando 3 livros com um construtor
        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofa", "Fantasia", "8532530804", "JK");
        Livro livro2 = new Livro("1984", "Ficção distópica", "0451524935", "George Orwell");
        Livro livro3 = new Livro("Orgulho e Preconceito", "Romance", "0141439518", "Jane Austen");

        estanteLivros.add(livro1);
        estanteLivros.add(livro2);
        estanteLivros.add(livro3);

        // Criando 3 livros com os métodos registrar
        System.out.println("*** Teste Criação dos livros com método registrarLivro ***");
        Livro livro4 = registrarLivro("21545433");
        Livro livro5 = registrarLivro("2123135454", "Livro aleatório");
        Livro livro6 = registrarLivro("212001552365", "Livro qualquer", "Gênero qualquer");

        estanteLivros.add(livro4);
        estanteLivros.add(livro5);
        estanteLivros.add(livro6);

        // Imprimindo livros e informações
        System.out.println("\n**************** Impressão de todos os livros criados ****************");
        for (Livro livro:estanteLivros) {
            System.out.println(livro.toString());
        }


    }
    public static Livro registrarLivro(String isbn){
        Livro livro = new Livro();
        livro.setIsbn(isbn);
        System.out.println("O livro foi registrado com o isbn" + livro.getIsbn());
        return livro;
    }

    public static Livro registrarLivro(String isbn, String nome){
        Livro livro = new Livro();
        livro.setIsbn(isbn);
        livro.setNome(nome);
        System.out.println("O livro foi registrado com o isbn: " + livro.getIsbn() + " e o nome: " + livro.getNome());
        return livro;
    }

    public static Livro registrarLivro(String isbn, String nome, String genero){
        Livro livro = new Livro();
        livro.setIsbn(isbn);
        livro.setNome(nome);
        livro.setGenero(genero);
        System.out.println("O livro foi registrado com o isbn: " + livro.getIsbn() + " e o nome: " + livro.getNome() + " e o gênero: " + livro.getGenero());
        return livro;
    }
}
