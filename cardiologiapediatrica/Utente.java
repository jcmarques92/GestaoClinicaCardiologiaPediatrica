package cardiologiapediatrica;

import java.util.Calendar;
import java.util.Random;

/**
 * Created by andrecosta on 12/11/16.
 */
public class Utente {
    Random gerador = new Random();
    private int numeroProcesso = gerador.nextInt();
    private int numeroUtente;
    private int nif;
    private String nome;
    private char sexo;
    private Calendar dataNascimento;
    private int numeroSistemaSaude;
    private String nomeMedicoFamilia;
    private String username;
    private String password;

    public int calcularIdade(){
        int anos;
        Calendar dataAtual= Calendar.getInstance();
        anos= dataAtual.get(Calendar.YEAR)-dataNascimento.get(Calendar.YEAR);
        if (dataAtual.get(Calendar.DAY_OF_YEAR)< dataNascimento.get(Calendar.DAY_OF_YEAR) )
            anos --;
        return anos;
    }

    public boolean validarIdade(){
        if (calcularIdade()<18)
            return true;
        return false;
    }

}
