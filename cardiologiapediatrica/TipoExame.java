package cardiologiapediatrica;

import java.util.Random;

/**
 * Created by andrecosta on 12/11/16.
 */
public class TipoExame {
    Random gerador = new Random();
    private int numero = gerador.nextInt();
    private String designacao;
    private String descricao;
    private double preco;
}
