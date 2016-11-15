package cardiologiapediatrica;

import util.Consola;

public class Main {

    public static void main(String[] args) {
        int opcao, opcao2, opcao3, opcao4, opcao5, opcao6, opcao7; //https://www.youtube.com/watch?v=Mr2mPu1tLhk
        do {
            opcao = menuPrincipal();
            switch (opcao) {
                case 1:
                    do {
                        opcao2 = menuFuncionario();
                        switch (opcao2) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 0:
                                System.out.println("Voltar ao menu principal");
                        }
                        if (opcao2 != 0) {
                            Consola.sc.nextLine();
                        }
                    } while (opcao2 != 0);
                    break;
                case 2:
                    do {
                        opcao3 = menuTiposDados();
                        switch (opcao3){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 0:
                                System.out.println("Voltar ao menu principal");
                        }
                        if (opcao3 !=0){
                            Consola.sc.nextLine();
                        }
                    }while (opcao3 !=0);
                    break;
                case 3:
                    do {
                        opcao4 = menuUtente();
                        switch (opcao4){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 0:
                                System.out.println("Voltar ao menu principal");
                        }
                        if (opcao4 !=0){
                            Consola.sc.nextLine();
                        }
                    }while (opcao4!=0);
                    break;
                case 4:
                    do {
                        opcao5 = menuServico();
                        switch (opcao5){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 0:
                                System.out.println("Voltar ao menu principal");
                        }
                        if (opcao5 !=0){
                            Consola.sc.nextLine();
                        }
                    }while (opcao5!=0);
                    break;
                case 5:
                    do {
                        opcao6=menuDadosBiomedicos();
                        switch (opcao6){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 0:
                                System.out.println("Voltar ao programa principal");
                        }
                        if (opcao6!=0){
                            Consola.sc.nextLine();
                        }
                    }while (opcao6!=0);
                    break;
                case 6:
                    do {
                        opcao7=menuEstatisticas();
                        switch (opcao7){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 0:
                                System.out.println("Voltar ao programa principal");
                        }
                        if (opcao7!=0){
                            Consola.sc.nextLine();
                        }
                    }while (opcao7!=0);
                    break;
                case 0:
                    System.out.println("Programa terminou...");
            }
            Consola.sc.nextLine();
        } while (opcao != 0);
    }

    private static int menuPrincipal(){
        int opcao;
        System.out.println();
        System.out.println("1 - Menu Funcionário");
        System.out.println("2 - Menu Tipo de Dado");
        System.out.println("3 - Menu Utente");
        System.out.println("4 - Menu Serviços");
        System.out.println("5 - Menu Inserir Dados Biomédicos");
        System.out.println("6 - Menu Estatísticas");
        System.out.println("0 - Terminar...\n");
        opcao = Consola.lerInt("Opcao: ", 0, 6);
        return opcao;

    }

    private static int menuFuncionario() {
        int opcao;
        System.out.println();
        System.out.println("1 - Inserir Funcionário");
        System.out.println("2 - Consultar Funcionário");
        System.out.println("3 - Eliminar Funcionário");
        System.out.println("0 - Voltar atrás\n");
        opcao = Consola.lerInt("Opcao: ", 0, 3);
        return opcao;
    }

    private static int menuTiposDados() {
        int opcao;
        System.out.println();
        System.out.println("1 - Inserir tipo de dado biomédico");
        System.out.println("2 - Consultar tipo de dado biomédico");
        System.out.println("3 - Inserir tipo de exame");
        System.out.println("4 - Consultar tipo de exame");
        System.out.println("5 - Alterar o preço do tipo de exame");
        System.out.println("0 - Voltar atrás\n");
        opcao = Consola.lerInt("Opcao: ", 0, 5);
        return opcao;
    }

    private static int menuUtente() {
        int opcao;
        System.out.println();
        System.out.println("1 - Inserir Utente");
        System.out.println("2 - Consultar por número");
        System.out.println("3 - Consultar por nome responsável");
        System.out.println("0 - Voltar atrás\n");
        opcao = Consola.lerInt("Opcao: ", 0, 3);
        return opcao;
    }

    private static int menuServico() {
        int opcao;
        System.out.println();
        System.out.println("1 - Marcar consulta");
        System.out.println("2 - Marcar exame");
        System.out.println("3 - Registar consulta");
        System.out.println("4 - Registar exame");
        System.out.println("5 - Consultar serviços por número do utente");
        System.out.println("6 - Consultar serviços por data");
        System.out.println("0 - Voltar atrás\n");
        opcao = Consola.lerInt("Opcao: ", 0, 6);
        return opcao;
    }

    private static int menuDadosBiomedicos() {
        int opcao;
        System.out.println();
        System.out.println("1 - Inserir dados biomédicos");
        System.out.println("2 - Marcar exame");
        System.out.println("3 - Registar consulta");
        System.out.println("4 - Registar exame");
        System.out.println("5 - Consultar serviços por número do utente");
        System.out.println("6 - Consultar serviços por data");
        System.out.println("0 - Voltar atrás\n");
        opcao = Consola.lerInt("Opcao: ", 0, 6);
        return opcao;
    }

    private static int menuEstatisticas() {
        int opcao;
        System.out.println();
        System.out.println("1 - Médico(s) que realiza(m) mais serviços na clínica");
        System.out.println("2 - Número total de exames de cada tipo realizados na clínica");
        System.out.println("3 - Totais anuais faturados na clínica");
        System.out.println("0 - Voltar atrás\n");
        opcao = Consola.lerInt("Opcao: ", 0, 6);
        return opcao;
    }

}
