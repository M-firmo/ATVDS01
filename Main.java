import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opc = 0;
        Produto[] listaProduto = new Produto[5];
        int posicao = 0;

        do {
            System.out.println("Sistema de gerenciamento de produtos:\n");

            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Alterar dados do produto");
            System.out.println("3 - Excluir produto");
            System.out.println("4 - Listar todos os produtos");
            System.out.println("5 - Sair");

            opc = entrada.nextInt();
            entrada.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("Cadastrar produto\n");

                    System.out.println("Digite o código:");
                    int cdg = entrada.nextInt();
                    entrada.nextLine(); 

                    System.out.println("Digite a cor:");
                    String cor = entrada.nextLine();

                    System.out.println("Digite a categoria:");
                    String categoria = entrada.nextLine();

                    System.out.println("Digite o nome:");
                    String nome = entrada.nextLine();

                    System.out.println("Digite o CEP:");
                    int cep = entrada.nextInt();
                    entrada.nextLine();

                    if (posicao < listaProduto.length) {
                        listaProduto[posicao] = new Produto(cdg, cor, categoria, nome, cep);
                        posicao++;
                        System.out.println("Produto cadastrado com sucesso!");
                    }
                    break;

                case 2:
                    System.out.print("Digite o código do produto a ser alterado: ");
                    int codigoAlterar = entrada.nextInt();
                    entrada.nextLine();
                
                    for (int i = 0; i < posicao; i++) {
                        if (listaProduto[i].getCdg() == codigoAlterar) {

                            System.out.print("Digite a nova cor: ");
                            listaProduto[i].setCor(entrada.nextLine());

                            System.out.print("Digite a nova categoria: ");
                            listaProduto[i].setCategoria(entrada.nextLine());

                            System.out.print("Digite o novo nome: ");
                            listaProduto[i].setNome(entrada.nextLine());

                            System.out.print("Digite o novo CEP: ");
                            listaProduto[i].setCep(entrada.nextInt());
                            entrada.nextLine();

                            System.out.println("Produto atualizado!");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Código do produto a excluir: ");
                    int codigoExcluir = entrada.nextInt();
                    entrada.nextLine();
                    boolean excluido = false;

                    for (int i = 0; i < posicao; i++) {
                        if (listaProduto[i].getCdg() == codigoExcluir) {
                            listaProduto[i] = listaProduto[posicao - 1]; 
                            posicao--;
                            excluido = true;
                            System.out.println("Produto excluído!");
                            break;
                        }
                    }
                    break;

                case 4:
                    if (posicao == 0) {
                        System.out.println("Não tem produtos cadastrados.");
                    } else {
                        System.out.println("Produtos cadastrados:");
                        for (int i = 0; i < posicao; i++) {
                            System.out.println("\nProduto " + (i + 1));
                            
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opc != 5);
        
        entrada.close();
    }
}
