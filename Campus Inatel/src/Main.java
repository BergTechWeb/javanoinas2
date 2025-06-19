
import br.com.arquivo.Arquivo;
import br.com.excecoes.TomboInvalidoException;
import br.com.localizacao.Campus;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        try (Scanner scan = new Scanner(System.in)) {

            int opcao, novaInteira, novaInteira2, convertido, menu, opcao2, opcao3;
            double novoTamanho;
            String busca, novaLetras, novaLetras2, novaLetras3, novaLetras4;

            Arquivo a = new Arquivo();
            Campus campus = a.lerDados();

            do {
                System.out.println(" ▄▄▄▄▄▄▄▄▄▄▄  ▄▄        ▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄           ");
                System.out.println("▐░░░░░░░░░░░▌▐░░▌      ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌          ");
                System.out.println(" ▀▀▀▀█░█▀▀▀▀ ▐░▌░▌     ▐░▌▐░█▀▀▀▀▀▀▀█░▌ ▀▀▀▀█░█▀▀▀▀ ▐░█▀▀▀▀▀▀▀▀▀ ▐░▌          ");
                System.out.println("     ▐░▌     ▐░▌▐░▌    ▐░▌▐░▌       ▐░▌     ▐░▌     ▐░▌          ▐░▌          ");
                System.out.println("     ▐░▌     ▐░▌ ▐░▌   ▐░▌▐░█▄▄▄▄▄▄▄█░▌     ▐░▌     ▐░█▄▄▄▄▄▄▄▄▄ ▐░▌          ");
                System.out.println("     ▐░▌     ▐░▌  ▐░▌  ▐░▌▐░░░░░░░░░░░▌     ▐░▌     ▐░░░░░░░░░░░▌▐░▌          ");
                System.out.println("     ▐░▌     ▐░▌   ▐░▌ ▐░▌▐░█▀▀▀▀▀▀▀█░▌     ▐░▌     ▐░█▀▀▀▀▀▀▀▀▀ ▐░▌          ");
                System.out.println("     ▐░▌     ▐░▌    ▐░▌▐░▌▐░▌       ▐░▌     ▐░▌     ▐░▌          ▐░▌          ");
                System.out.println(" ▄▄▄▄█░█▄▄▄▄ ▐░▌     ▐░▐░▌▐░▌       ▐░▌     ▐░▌     ▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄▄▄ ");
                System.out.println("▐░░░░░░░░░░░▌▐░▌      ▐░░▌▐░▌       ▐░▌     ▐░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌");
                System.out.println(" ▀▀▀▀▀▀▀▀▀▀▀  ▀        ▀▀  ▀         ▀       ▀       ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀");
                System.out.println("Seja Bem-Vindo à Gerencia");
                System.out.println("Digite a opção Desejada:");

                System.out.println("1: Buscar Equipamento por Tombo       3: Buscar Equipamentos Diversos");
                System.out.println("2: Adicionar Novo Equipamento         4: Remover Equipamento");

                System.out.println("Para Fechar o programa digite qualquer valor exceto 1, 2, 3 e 4");
                menu = scan.nextInt();
                scan.nextLine();

                switch (menu) {
                    case 1 -> {
                        System.out.println("Digite o tombo a ser buscado: ");
                        busca = scan.nextLine();
                        campus.buscarTombo(busca);
                        break;
                    }
                    case 2 -> {

                        try {
                            System.out.println("Digite o Tombo do equipamento a ser adicionado:");
                            novaLetras = scan.nextLine();
                            if (novaLetras.length() < 6) {
                                throw new TomboInvalidoException("Tombo Inválido");
                            }
                            convertido = Character.getNumericValue(novaLetras.charAt(1));

                            if (novaLetras.startsWith("0")) {
                                System.out.println("O equipamento é um Switch");
                                System.out.println("Digite a Marca: ");
                                novaLetras2 = scan.nextLine();
                                System.out.println("Digite o numero de portas: ");
                                novaInteira = scan.nextInt();
                                System.out.println("Digite a velocidade em Mbps: ");
                                novaInteira2 = scan.nextInt();
                                scan.nextLine();
                                System.out.println("Digite o Tipo do Switch (nucleo ou core): ");
                                novaLetras3 = scan.nextLine();
                                campus.predios[convertido].addequip(novaLetras, novaInteira, novaLetras2, novaInteira2, novaLetras3);
                            } else if (novaLetras.startsWith("1")) {
                                System.out.println("O equipamento é um Patch Panel");
                                System.out.println("Digite a Marca: ");
                                novaLetras2 = scan.nextLine();
                                System.out.println("Digite o número de Portas: ");
                                novaInteira = scan.nextInt();
                                scan.nextLine();
                                System.out.println("Digite a Categoria do Patch Panel: ");
                                novaLetras4 = scan.nextLine();
                                System.out.println("Digite o Tipo de Porta Utilizado: ");
                                novaLetras3 = scan.nextLine();
                                campus.predios[convertido].addequip(novaLetras, novaInteira, novaLetras2, novaLetras4, novaLetras3);
                            } else if (novaLetras.startsWith("2")) {
                                System.out.println("O equipamento é um DIO");
                                System.out.println("Digite a Marca: ");
                                novaLetras2 = scan.nextLine();
                                System.out.println("Digite o número de Portas: ");
                                novaInteira = scan.nextInt();
                                scan.nextLine();
                                System.out.println("Digite a Categoria da Fibra: ");
                                novaLetras4 = scan.nextLine();
                                System.out.println("Digite o Tipo de Porta Utilizado: ");
                                novaLetras3 = scan.nextLine();
                                campus.predios[convertido].addequip(novaLetras, novaInteira, novaLetras2, novaLetras4, novaLetras3);
                            } else if (novaLetras.startsWith("3")) {
                                System.out.println("O equipamento é um AP");
                                System.out.println("Digite a Marca: ");
                                novaLetras2 = scan.nextLine();
                                System.out.println("Digite o número de Portas: ");
                                novaInteira = scan.nextInt();
                                scan.nextLine();
                                System.out.println("Digite a Categoria do WI-FI: ");
                                novaLetras4 = scan.nextLine();
                                System.out.println("Digite o Alcance do AP: ");
                                novoTamanho = scan.nextDouble();
                                campus.predios[convertido].addequip(novaLetras, novaInteira, novaLetras2, novaLetras4, novoTamanho);
                            }
                        } catch (TomboInvalidoException e) {
                            System.out.println("O tombo esta invalido");
                        }
                        break;

                    }
                    case 3 -> {
                        do {
                            System.out.println("Como deseja filtrar os equipamentos para a listagem?");
                            System.out.println("1: Filtrar por prédios      2: Filtrar por tipo de equipamento");
                            opcao = scan.nextInt();
                            if (opcao == 1) {
                                do {
                                    System.out.println("Digite o predio que deseja listar:");
                                    opcao2 = scan.nextInt();
                                    campus.listarPorPredio(opcao2);
                                } while (opcao2 < 0 || opcao2 > 8);

                            } else if (opcao == 2) {
                                do {
                                    System.out.println("Digite o equipamento que deseja buscar: ");
                                    System.out.println("0: Switch    1: Patch Panel    2: DIO    3: AP");
                                    opcao3 = scan.nextInt();
                                    campus.listarPorEquipamento(opcao3);
                                } while (opcao3 < 0 || opcao3 > 3);
                            }
                        } while (opcao < 1 || opcao > 2);
                        break;
                    }
                    case 4 -> {
                        System.out.println("Digite o tombo do equipamento que deseja remover: ");

                        busca = scan.nextLine();
                        campus.buscarPraRemover(busca);
                    }

                }
            } while (menu < 5 && menu > 0);
            a.salvarDados(campus);
        } catch (Exception e) {
            System.out.println("Erro detectado" + e.getMessage());
        }

    }
}
