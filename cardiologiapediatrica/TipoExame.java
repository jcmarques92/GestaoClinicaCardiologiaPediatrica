package cardiologiapediatrica;

import java.util.Random;

/**
 * Created by andrecosta on 12/11/16.
 */
public class TipoExame {
    private int numero;
    private String designacao;
    private String descricao;
    private double preco;

    public TipoExame(String designacao, String descricao, double preco) {
        this.designacao = designacao;
        this.descricao = descricao;
        this.preco = preco;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\n\tNúmero: ").append(numero);
        str.append("\n\tDesignação: ").append(designacao);
        str.append("\n\tDescrição: ").append(descricao);
        str.append("\n\tPreço :").append(preco);
        return str.toString();
    }
}
