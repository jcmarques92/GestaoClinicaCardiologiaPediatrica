package cardiologiapediatrica;

import java.util.Calendar;
import java.util.List;

/**
 * Created by andrecosta on 12/11/16.
 */
public class Exame extends Servico {
    private String descricao;
    private TipoExame tipoExame;
    private String resultado;

    public Exame(Utente utente, Funcionario funcionario, double preco, Calendar data, Calendar hora, String descricao,
                 String resultado) {
        super(utente, funcionario, preco, data, hora);
        this.descricao = descricao;
        this.resultado = resultado;
    }

    public Exame(Utente utente, Funcionario funcionario, double preco, Calendar data, Calendar hora, TipoExame tipoExame) {
        super(utente, funcionario, preco, data, hora);
        this.tipoExame = tipoExame;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoExame getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(TipoExame tipoExame) {
        this.tipoExame = tipoExame;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\n\tDescrição: ").append(descricao);
        str.append("\n\tTipo de Exame").append(tipoExame);
        str.append("\n\tResultado: ").append(resultado);
        return str.toString();
    }
}
