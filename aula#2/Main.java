//Aluno: Marcos Felipe dos Santos Soares, Matricula: 202301469;
//Curso: Ciência da Computação, Data: 10/08/2024.

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

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
            System.out.println("4 - Remover contato");
            System.out.println("5 - Buscar índice contato");
            System.out.println("6 - Imprime contato");
            System.out.println("7 - Encerrar Programa");
            System.out.print("\nEscolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("\033[1;33m\nInserir novo contato:\033[m");
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o email: ");
                    String email = scanner.nextLine();

                    System.out.print("Digite o telefone: ");
                    String telefone = scanner.nextLine();

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
                    scanner.nextLine();

                    if (indice < 0 || indice >= listaContatos.size()) {
                        System.out.println("Índice inválido.");
                        break;
                    }

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
                        System.out.println("\n\033[1;33mLista de Contatos:\033[m");
                        for (int i = 0; i < listaContatos.size(); i++) {
                            listaContatos.get(i).imprimirDados();
                        }
                    }
                    break;
                case 4:
                    if(listaContatos.isEmpty()){System.out.println("Não há contados cadastrados!\n");}
                    else{
                        System.out.println("Digite o email do contato que deseja remover: ");
                        String emailRemover = scanner.nextLine();
                        boolean res = false;
                        int i;
                        for(i=0; i<listaContatos.size(); i++){
                            if(listaContatos.get(i).getEmail().equals(emailRemover)) {
                                listaContatos.remove(i);
                                res = true;
                            }
                        }

                        if(res){
                            System.out.println("Contato removido!");
                        }else{
                            System.out.println("Contato não encontrado, tente novamente!");
                        }                        
                        break;
                    }
                case 5:
                    System.out.println("Digite o nome da pessoa que deseja buscar o índice: ");
                    String nomeBuscar = scanner.nextLine();
                    boolean encontrado = false;
                    int i;
                    for(i = 0; i <listaContatos.size(); i++){
                        if(listaContatos.get(i).getNome().equalsIgnoreCase(nomeBuscar)){
                            System.out.println("\n\033[1;33mÍndice do contato:\033[m " + i);
                            encontrado = true;
                            break;
                        }
                    }
                    if(encontrado == false){
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 6:
                    if(listaContatos.isEmpty()){
                        System.out.println("Nenhum contato cadastrado!");
                    }
                    else{
                        System.out.println("Digite o email do contato que deseja imprimir: ");
                        String emailImprimir = scanner.nextLine();
                        boolean res = false;
                        for(i = 0; i < listaContatos.size(); i++){
                            if(listaContatos.get(i).getEmail().equals(emailImprimir)) {
                                listaContatos.get(i).imprimirDados();
                                res = true;
                            }
                        }

                        if(res == false){
                            System.out.println("Contato não encontrado, tente novamente!");
                        }
                    }
                    break;
                case 7:
                    System.out.println("\n\033[1;31mFinalizando o programa :) \033[m \n");
                    loop_controle = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}

