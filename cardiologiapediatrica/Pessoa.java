package cardiologiapediatrica;

import java.util.Calendar;

/**
 * Created by andrecosta on 18/11/16.
 */
public abstract class Pessoa {
    protected int nif;
    protected String nome;
    protected Calendar dataNascimento;

    public Pessoa(int nif, String nome, Calendar dataNascimento) {
        this.nif = nif;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\n\tNIF : ").append(nif);
        str.append("\n\tNome: ").append(nome);
        str.append("\n\tData Nascimento: ").
                append(dataNascimento.get(Calendar.DATE)).
                append("-").append((dataNascimento.get(Calendar.MONTH)+1)).
                append("-").append(dataNascimento.get(Calendar.YEAR));
        return str.toString();
    }
}
