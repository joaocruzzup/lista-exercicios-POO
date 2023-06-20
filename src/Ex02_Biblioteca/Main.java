package Ex02_Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Biblioteca> estanteLivros = new ArrayList<>();
        Biblioteca livros = new Biblioteca();


        System.out.println(livros.registrarLivro(5151).toString());

        livros.registrarLivro(5152, "HP", "Ficção científica");
        System.out.println(livros.toString());

    }
}
