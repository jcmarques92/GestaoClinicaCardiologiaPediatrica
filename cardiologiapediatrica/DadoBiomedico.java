package cardiologiapediatrica;

import java.util.Calendar;
import java.util.Random;

/**
 * Created by andrecosta on 12/11/16.
 */
public class DadoBiomedico {
    Random gerador = new Random();
    private int numero = gerador.nextInt();
    private Calendar data;
    private TipoDadoBiomedico tipoDadoBiomedico;
    private double valor;
    private Utente utente;
    private Funcionario funcionario;
}
