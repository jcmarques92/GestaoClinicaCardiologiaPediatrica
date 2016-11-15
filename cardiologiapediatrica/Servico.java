package cardiologiapediatrica;

import java.util.Calendar;
import java.util.Random;

/**
 * Created by andrecosta on 12/11/16.
 */
public class Servico {
    private Consulta consulta;
    private Exame exame;
    Random gerador = new Random();
    private int numero = gerador.nextInt();
    private Utente utente;
    private Funcionario funcionario;
    private double preco;
    private Calendar dataHora;

}
