package cardiologiapediatrica;

import java.util.Calendar;
import java.util.Random;

/**
 * Created by andrecosta on 12/11/16.
 */
public class DadoBiomedico {
    private int numero;
    private Calendar data;
    private TipoDadoBiomedico tipoDadoBiomedico;
    private double valor;
    private Utente utente;
    private Funcionario funcionario;

    public DadoBiomedico(Calendar data, TipoDadoBiomedico tipoDadoBiomedico, double valor, Utente utente, Funcionario funcionario) {
        this.data = data;
        this.tipoDadoBiomedico = tipoDadoBiomedico;
        this.valor = valor;
        this.utente = utente;
        this.funcionario = funcionario;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public TipoDadoBiomedico getTipoDadoBiomedico() {
        return tipoDadoBiomedico;
    }

    public void setTipoDadoBiomedico(TipoDadoBiomedico tipoDadoBiomedico) {
        this.tipoDadoBiomedico = tipoDadoBiomedico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\n\tNúmero: ").append(numero);
        str.append("\n\tData: ").append(data);
        str.append("\n\tTipo de Dado Biomédico: ").append(tipoDadoBiomedico);
        str.append("\n\tValor: ").append(valor);
        str.append("\n\tUtente: ").append(utente);
        str.append("\n\tFuncionário: ").append(funcionario);
        return str.toString();
    }
}
