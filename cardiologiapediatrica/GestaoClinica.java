package cardiologiapediatrica;

import java.util.ArrayList;

/**
 * Created by andrecosta on 12/11/16.
 */
public class GestaoClinica {
    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    ArrayList<Servico> servicos = new ArrayList<>();

    public void adicionarFuncionario(Funcionario f){
        funcionarios.add(f);
        pessoas.add(f);
    }

    public String consultarFuncionario(){
        StringBuilder str = new StringBuilder();
        if (funcionarios.isEmpty()) {
            str.append("Não há funcionários registados!");
        } else{
            for (int i=0; i < funcionarios.size(); i++){
                str.append("Funcionários: ").append(funcionarios.get(i)).append("\n");
            }
        }
        return str.toString();
    }

    public void eliminarFuncionario(int pos){
        funcionarios.remove(pos);
        pessoas.remove(pos);
    }

    public int pesquisarFuncionario(int nif) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (nif == funcionarios.get(i).getNif()) {
                return i;
            }
        }
        return -1;
    }

    public int pesquisarServico(int numero){
        for (int i=0; i<servicos.size(); i++)
            if (servicos.get(i).getNumero()==numero)
                return i;
        return -1;

    }

    public Servico obterServico(int pos){
        return servicos.get(pos);
    }

}
