import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaLivro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Livro> biblioteca = new ArrayList<>();


        biblioteca.add(new Livro("A baleia", "Marileia Vargas", "Literatura"));
        biblioteca.add(new Livro("2000", "Pedro Carneiro", "Ficção"));
        biblioteca.add(new Livro("O que se perdeu", "João de Deus", "Fantasia"));

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Consultar livros");
            System.out.println("2. Emprestar livro");
            System.out.println("3. Devolver livro");
            System.out.println("4. Consultar disponibilidade de um livro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (opcao) {
                case 1:
                    consultarLivros(biblioteca);
                    break;

                case 2:
                    System.out.print("Digite o título do livro para emprestar: ");
                    String tituloEmprestimo = scanner.nextLine();
                    emprestarLivro(biblioteca, tituloEmprestimo);
                    break;

                case 3:
                    System.out.print("Digite o título do livro para devolver: ");
                    String tituloDevolucao = scanner.nextLine();
                    devolverLivro(biblioteca, tituloDevolucao);
                    break;

                case 4:
                    System.out.print("Digite o título do livro para verificar a disponibilidade: ");
                    String tituloConsulta = scanner.nextLine();
                    verificarDisponibilidade(biblioteca, tituloConsulta);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void consultarLivros(List<Livro> biblioteca) {
        System.out.println("\nLivros disponíveis:");
        if (biblioteca.isEmpty()) {
            System.out.println("Nenhum livro na biblioteca.");
        } else {
            for (Livro livro : biblioteca) {
                System.out.println(livro);
            }
        }
    }

    private static void emprestarLivro(List<Livro> biblioteca, String titulo) {
        for (Livro livro : biblioteca) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.emprestar();
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    private static void devolverLivro(List<Livro> biblioteca, String titulo) {
        for (Livro livro : biblioteca) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.devolver();
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    private static void verificarDisponibilidade(List<Livro> biblioteca, String titulo) {
        for (Livro livro : biblioteca) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (livro.isDisponivel()) {
                    System.out.println("O livro \"" + titulo + "\" está disponível para empréstimo.");
                } else {
                    System.out.println("O livro \"" + titulo + "\" não está disponível.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
}
