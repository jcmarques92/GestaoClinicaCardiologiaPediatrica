package cardiologiapediatrica;

import java.util.Calendar;

/**
 * Created by andrecosta on 12/11/16.
 */
public abstract class Servico {
    protected int numero;
    protected Utente utente;
    protected Funcionario funcionario;
    protected double preco;
    protected Calendar data;
    protected Calendar hora;

    public Servico(Utente utente, Funcionario funcionario, double preco, Calendar data, Calendar hora) {
        this.utente = utente;
        this.funcionario = funcionario;
        this.preco = preco;
        this.data = data;
        this.hora = hora;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Calendar getHora() {
        return hora;
    }

    public void setHora(Calendar hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\n\tNúmero: ").append(numero);
        str.append("\n\tUtente: ").append(utente);
        str.append("\n\tFuncionário: ").append(funcionario);
        str.append("\n\tPreço: ").append(preco);
        str.append("\n\tData: ").
                append(data.get(Calendar.DATE)).
                append("-").append((data.get(Calendar.MONTH)+1)).
                append("-").append(data.get(Calendar.YEAR));
        str.append("\n\tHora: ").
                append(hora.get(Calendar.HOUR)).
                append(":").append(hora.get(Calendar.MINUTE)).
                append(":").append(hora.get(Calendar.SECOND));
        return str.toString();
    }

}
