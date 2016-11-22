package cardiologiapediatrica;

import java.util.Calendar;

/**
 * Created by andrecosta on 12/11/16.
 */
public class Funcionario extends Pessoa{
    private Servico servico;
    private String morada;
    private int telefone;
    private String email;
    private String habilitacoes;
    private String funcaoDesempenhada;

    public Funcionario(int nif, String nome, Calendar dataNascimento, Servico servico, String morada, int telefone,
                       String email, String habilitacoes, String funcaoDesempenhada) {
        super(nif, nome, dataNascimento);
        this.servico = servico;
        this.morada = morada;
        this.telefone = telefone;
        this.email = email;
        this.habilitacoes = habilitacoes;
        this.funcaoDesempenhada = funcaoDesempenhada;
    }


    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHabilitacoes() {
        return habilitacoes;
    }

    public void setHabilitacoes(String habilitacoes) {
        this.habilitacoes = habilitacoes;
    }

    public String getFuncaoDesempenhada() {
        return funcaoDesempenhada;
    }

    public void setFuncaoDesempenhada(String funcaoDesempenhada) {
        this.funcaoDesempenhada = funcaoDesempenhada;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\n\tServiço: ").append(servico);
        str.append("\n\tMorada: ").append(morada);
        str.append("\n\tTelefone: ").append(telefone);
        str.append("\n\tEmai: ").append(email);
        str.append("\n\tHabilitações: ").append(habilitacoes);
        str.append("\n\tFunção desempenhada: ").append(funcaoDesempenhada);
        return str.toString();
    }
}
