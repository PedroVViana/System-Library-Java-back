// src/Biblioteca.java
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso: " + livro.getTitulo());
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("Lista de livros na biblioteca:");
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    public void removerLivro(String isbn) {
        Livro livroRemover = null;
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                livroRemover = livro;
                break;
            }
        }

        if (livroRemover != null) {
            livros.remove(livroRemover);
            System.out.println("Livro removido com sucesso: " + livroRemover.getTitulo());
        } else {
            System.out.println("Livro com ISBN " + isbn + " não encontrado.");
        }
    }
}
