package cardiologiapediatrica;

import util.Consola;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
    public static GestaoClinica gc = new GestaoClinica();

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
                                inserirFuncionario();
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
                                inserirUtente();
                                break;
                            case 2:
                                consultarUtenteNumero();
                                break;
                            case 3:
                                consultarUtenteNomeResponsavel();
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

    public static void inserirFuncionario() {
        int nif, telefone;
        String nome, morada, email, habilitacoes, funcaoDesempenhada, dataNasc;
        Calendar dataNascimento = new GregorianCalendar();
        Servico servico;
        int numeroS, pos;

        if (gc.getTotalFuncionarios()!=0){
            try {
                nif = Consola.lerInt("Indique o NIF do funcionário: ");
                telefone = Consola.lerInt("Indique o telefone do funcionário: ");
                nome = Consola.lerString("Indique o nome do funcionário: ");
                morada = Consola.lerString("Indique a morada do funcionário: ");
                email = Consola.lerString("Indique o email do funcionário: ");
                habilitacoes=Consola.lerString("Indique as habilitações do funcionário: ");
                funcaoDesempenhada=Consola.lerString("Indique a função desempenhada do funcionário: ");
                dataNasc = Consola.lerString("Indique a data de nascimento do funcionário: ");
                dataNascimento.setTime(formato.parse(dataNasc));

                do {
                    //gc.mostrarServico();
                    numeroS = Consola.lerInt("Indique o número do serviço do funcionário: ");
                    pos = gc.pesquisarServico(numeroS);
                    if (pos == -1)
                        System.out.println("Serviço não existe!");
                } while (pos == -1);

                servico = gc.obterServico(pos);

                Funcionario f = new Funcionario(nif, nome, dataNascimento, servico, morada, telefone, email, habilitacoes, funcaoDesempenhada);

                gc.adicionarFuncionario(f);
            } catch (ParseException e) {
                System.err.println("Erro ao introduzir a data!");
            }
        }
        else {
            System.out.println("Tem que haver serviços registados!");
            Consola.sc.nextLine();
        }
    }

    public static void inserirUtente(){
        int nif, numeroUtente, telefoneResponsavel;
        String nome, sistemaSaude, nomeResponsavelUtente, parentescoResponsavel, emailResponsavel, nomeMedicoFamilia,
                username, password, dataNasc, pass;
        Calendar dataNascimento = new GregorianCalendar();;
        char sexo;
        try {
            nif = Consola.lerInt("Indique o número do NIF: ");
            numeroUtente = Consola.lerInt("Indique o número do utente: ");
            telefoneResponsavel = Consola.lerInt("Indique o telefone do responsável pelo utente: ");
            nome = Consola.lerString("Indique o nome do utente: ");
            sistemaSaude=Consola.lerString("Indique o sistema de saúde: ");
            nomeResponsavelUtente = Consola.lerString("Indique o nome do responsável pelo utente: ");
            parentescoResponsavel=Consola.lerString("Indique o parentesco do responsável pelo utente: ");
            emailResponsavel=Consola.lerString("Indique o email do responsável pelo utente: ");
            nomeMedicoFamilia=Consola.lerString("Inqique o nome do médico de família do utente: ");
            dataNasc = Consola.lerString("Indique a data de nascimento do utente: ");
            dataNascimento.setTime(formato.parse(dataNasc));
            sexo=Consola.lerChar("Indique o gênero do utente: ", "M ou F");
            username=Consola.lerString("Indique o username do utente: ");
            pass=Consola.lerString("Indique a password do utente: ");
            password=gc.encrypt(pass);
            Utente u = new Utente(nif, nome, dataNascimento, numeroUtente, sexo, sistemaSaude, nomeResponsavelUtente,
                    parentescoResponsavel, emailResponsavel, telefoneResponsavel, nomeMedicoFamilia, username, password);
            gc.adicionarUtente(u);
        }catch (ParseException e){
            System.err.println("Erro ao introduzir a data!");
        }
    }

    public static void consultarUtenteNumero(){
        int numero, pos;
        if (gc.getTotalUtentes() == 0)
            System.out.println("Ainda não foram inseridos utentes!");
        else {
            numero = Consola.lerInt("Indique o número do utente: ", 1, 9999999);
            pos = gc.pesquisarUtente(numero);
            if (pos == -1) {
                System.out.println("Não existe um utente com esse número!");
            } else {
                System.out.println(gc.obterUtente(pos));
            }
        }
    }

    public static void consultarUtenteNomeResponsavel(){
        String nome;
        int pos;
        if (gc.getTotalUtentes() == 0)
            System.out.println("Ainda não foram inseridos utentes!");
        else {

            nome = Consola.lerString("Indique o nome do utente: ");
            pos = gc.pesquisarUtente(nome);
            if (pos == -1) {
                System.out.println("Não existe um utente com esse nome!");
            } else {
                System.out.println(gc.obterUtente(pos));
            }
        }
    }



}