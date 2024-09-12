//Aluno: Marcos Felipe dos Santos Soares, Matricula: 202301469;
//Curso: Ciência da Computação, Data: 10/08/2024.

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;


class LimpaConsole {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teste");
        String texto = scanner.next();

        //Limpa a tela no windows, no linux e no MacOS
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");

    }
}

class Contato {
    private String nome;
    private String email;
    private String telefone;
    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    //Metodos .get():
    public String getNome() { return nome;}
    public String getEmail() { return email;}
    public String getTelefone() { return telefone;}

    //Metodos .set():
    public void setNome(String nome) { this.nome = nome;}
    public void setEmail(String email) { this.email = email;}
    public void setTelefone(String telefone) { this.telefone = telefone;}

    //Função que imprime todos os dados:
    public void imprimirDados() {
        System.out.println("\nNome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> listaContatos = new ArrayList<>();
        boolean loop_controle = true;

        while (loop_controle) {
            System.out.println("\n\033[1;33mMenu\nAluno: Marcos Felipe dos Santos Soares\033[m\n");
            System.out.println("1 - Inserir Contato");
            System.out.println("2 - Alterar Contato");
            System.out.println("3 - Imprimir Todos os Contatos");
            System.out.println("4 - Encerrar Programa");
            System.out.print("\nEscolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

	    //Looping principal:
            switch (opcao) {
                case 1:
                    System.out.println("\033[1;33m\nInserir novo contato:\033[m");
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o email: ");
                    String email = scanner.nextLine();

                    System.out.print("Digite o telefone: ");
                    String telefone = scanner.nextLine();

                    // Adicionando o novo contato à lista
                    listaContatos.add(new Contato(nome, email, telefone));
                    System.out.println("\n\033[1;32mContato inserido!\033[m");
                    break;

                case 2:
                    if (listaContatos.isEmpty()) {
                        System.out.println("Nenhum contato para alterar.");
                        break;
                    }

                    System.out.print("Digite o índice do contato a alterar (0 para o primeiro contato): ");
                    int indice = scanner.nextInt();
                    scanner.nextLine();  // Consumir a quebra de linha

                    if (indice < 0 || indice >= listaContatos.size()) {
                        System.out.println("Índice inválido.");
                        break;
                    }

                    // Alterar o contato existente
                    Contato contatoAlterar = listaContatos.get(indice);
                    System.out.println("\nAlterar contato existente:");
                    System.out.print("Digite o novo nome: ");
                    contatoAlterar.setNome(scanner.nextLine());

                    System.out.print("Digite o novo email: ");
                    contatoAlterar.setEmail(scanner.nextLine());

                    System.out.print("Digite o novo telefone: ");
                    contatoAlterar.setTelefone(scanner.nextLine());

                    System.out.println("Contato alterado com sucesso!");
                    break;

                case 3:
                    if (listaContatos.isEmpty()) {
                        System.out.println("\nNenhum contato cadastrado.");
                    } else {
                        System.out.println("\nLista de Contatos:");
                        for (int i = 0; i < listaContatos.size(); i++) {
                            System.out.println("Contato #" + (i + 1));
                            listaContatos.get(i).imprimirDados();
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n\033[1;31mFinalizando o programa :) \033[m \n");
                    loop_controle = false;
                    break;
                case 5:
                    new LimpaConsole().main();
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}

