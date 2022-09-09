import java.util.Scanner;

public class Menu {

        public static void menuPrincipal() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("___________________________________________");
                System.out.println("Bem vindo ao sistema de cadastro Lab School");
                System.out.println("--------------------------------------------");
                System.out.println("\nDigite a opção do menu desejado: ");
                System.out.println("{ 1 } Menu de Alunos");
                System.out.println("{ 2 } Menu de Professores");
                System.out.println("{ 3 } Menu de Pedagogos");
                System.out.println("\n{ 0 } Sair");
                int menu = scanner.nextInt();


                if (menu ==0 ) {
                        System.out.println("Saindo . . .");
                        return;
                }else {

                        switch (menu) {
                                case 1:
                                        exibeMenuAlunos();
                                        break;
                                case 2:
                                        exibeMenuProfessores();
                                        break;
                                case 3:
                                        exibeMenuPedagogos();
                                        break;
                                case 0:
                                        return;
                                default:
                                        System.out.println("Opção inválida!");
                                        menuPrincipal();
                                        break;

                        }
                }
        }
        private static void exibeMenuAlunos() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("\n ___________________________________");
                System.out.println("|          Menu de Alunos           |");
                System.out.println("|___________________________________|\n");
                System.out.println("\n Digite a opção desejada: ");
                System.out.println("{ 1 } Adicionar aluno");
                System.out.println("{ 2 } Listar alunos");
                System.out.println("{ 3 } Alterar matricula");
                System.out.println("{ 4 } Exibir alunos com maior numero de atendimentos pedagogicos");
                System.out.println("{ 5 } Voltar");
                System.out.println("\n{ 0 } Sair");
                int menu = scanner.nextInt();

                if (menu ==0 ) {
                        System.out.println("Saindo . . .");
                        return;
                }else {
                        switch (menu){
                                case 1:
                                        Aluno.adicionarAluno(Aluno.listaDeAlunos);
                                        exibeMenuAlunos();
                                        break;
                                case 2:
                                        Aluno.listarAlunos(Aluno.getListaDeAlunos());
                                        exibeMenuAlunos();
                                        break;
                                case 3:
                                        Aluno.matricular();
                                        exibeMenuAlunos();
                                        break;
                                case 4:
                                        //Aluno.listarPorAtendimentos();
                                        exibeMenuAlunos();
                                        break;
                                case 5:
                                        menuPrincipal();
                                        break;
                                case 0:
                                        return;
                                default:
                                        System.out.println("Opção inválida!");
                                        exibeMenuAlunos();
                                        break;
                        }
                }
        }
        private static void exibeMenuProfessores() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("\n ___________________________________");
                System.out.println("|          Menu de Professores      |");
                System.out.println("|___________________________________|\n");
                System.out.println("\n Digite a opção desejada: ");
                System.out.println("{ 1 } Adicionar Professor");
                System.out.println("{ 2 } Listar todos os professores");
                System.out.println("{ 3 } Listar professores por experiência em desenvolvimento");
                System.out.println("{ 4 } Listar professores por estado de atividade");
                System.out.println("{ 5 } Voltar");
                System.out.println("\n{ 0 } Sair");
                int menu = scanner.nextInt();

                if (menu ==0 ) {
                        System.out.println("Saindo . . .");
                        return;
                }else {
                        switch (menu){
                                case 1:
                                        //adicionarProfessor();
                                        break;
                                case 2:
                                        //listarProfessores();
                                        break;
                                case 3:
                                        //ListarProfessoresPorExperiencia();
                                        break;
                                case 4:
                                        //ListarProfessoresPorAtividade();
                                        break;
                                case 5:
                                        menuPrincipal();
                                        break;
                                case 0:
                                        return;
                                default:
                                        System.out.println("Opção inválida!");
                                        exibeMenuAlunos();
                                        break;
                        }
                }
        }
        private static void exibeMenuPedagogos() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("\n ___________________________________");
                System.out.println("|          Menu de Pedagogos        |");
                System.out.println("|___________________________________|\n");
                System.out.println("\n Digite a opção desejada: ");
                System.out.println("{ 1 } Adicionar Pedagogo");
                System.out.println("{ 2 } Listar todos os Pedagogos");
                System.out.println("{ 3 } Realizar atendimento pedagogico");
                System.out.println("{ 4 } Listar pedagogos por numero de atendimentos");
                System.out.println("{ 5 } Voltar");
                System.out.println("\n{ 0 } Sair");
                int menu = scanner.nextInt();

                if (menu ==0 ) {
                        System.out.println("Saindo . . .");
                        return;
                }else {
                        switch (menu){
                                case 1:
                                        //adicionarPedagogo();
                                        break;
                                case 2:
                                        //listarPedagogos();
                                        break;
                                case 3:
                                        //atendimentoPedagogico();
                                        break;
                                case 4:
                                        //ListarPedagogosPorAtendimento();
                                        break;
                                case 5:
                                        menuPrincipal();
                                        break;
                                case 0:
                                        return;
                                default:
                                        System.out.println("Opção inválida!");
                                        exibeMenuAlunos();
                                        break;
                        }
                }
        }




}
