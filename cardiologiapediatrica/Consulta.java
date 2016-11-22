package cardiologiapediatrica;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by andrecosta on 12/11/16.
 */
public class Consulta extends Servico{
    private String descricao;
    private ArrayList<DadoBiomedico> dadoBiomedico = new ArrayList<>();

    public Consulta(Utente utente, Funcionario funcionario, double preco, Calendar data, Calendar hora,
                    String descricao, ArrayList<DadoBiomedico> dadoBiomedico) {
        super(utente, funcionario, preco, data, hora);
        this.descricao = descricao;
        this.dadoBiomedico = dadoBiomedico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<DadoBiomedico> getDadoBiomedico() {
        return dadoBiomedico;
    }

    public void setDadoBiomedico(ArrayList<DadoBiomedico> dadoBiomedico) {
        this.dadoBiomedico = dadoBiomedico;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\n\tDescrição: ").append(descricao);
        str.append("\n\tDado Biomédico: ").append(dadoBiomedico);
        return str.toString();
    }
}
