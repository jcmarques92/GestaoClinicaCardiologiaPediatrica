package cardiologiapediatrica;

import java.util.Random;

/**
 * Created by andrecosta on 12/11/16.
 */
public class TipoDadoBiomedico {
    private int numero;
    private String designacao;
    private String descricao;

    public TipoDadoBiomedico(String designacao, String descricao) {
        this.designacao = designacao;
        this.descricao = descricao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\n\tNúmero: ").append(numero);
        str.append("\n\tDesignação: ").append(descricao);
        str.append("\n\tDescrição: ").append(descricao);
        return str.toString();
    }
}
