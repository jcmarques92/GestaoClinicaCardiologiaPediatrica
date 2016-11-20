package cardiologiapediatrica;

import java.util.ArrayList;

/**
 * Created by andrecosta on 12/11/16.
 */
public class GestaoClinica {
    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    ArrayList<Servico> servicos = new ArrayList<>();
    ArrayList<Utente> utentes = new ArrayList<>();

    public void adicionarFuncionario(Funcionario f){
        funcionarios.add(f);
        pessoas.add(f);
    }

    public void adicionarUtente(Utente u){
        if(utentes.isEmpty()){
            u.setNumeroProcesso(1);
        }
        else{
            u.setNumeroProcesso(utentes.size()+1);
        }
        utentes.add(u);
        pessoas.add(u);
    }

    public int pesquisarUtente(int numero) {
        for (int i = 0; i < utentes.size(); i++) {
            if (numero == utentes.get(i).getNumeroUtente()) {
                return i;
            }
        }
        return -1;
    }

    public int pesquisarUtente(String nome) {
        for (int i = 0; i < utentes.size(); i++) {
            if (nome.equalsIgnoreCase(utentes.get(i).getNomeResponsavelUtente())) {
                return i;
            }
        }
        return -1;
    }

    public Utente obterUtente(int pos) {
        return utentes.get(pos);
    }

    public int getTotalUtentes() {
        return utentes.size();
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
        for (int i = 0; i < servicos.size(); i++) {
            if (numero==(servicos.get(i).getNumero())) {
                return i;
            }
        }
        return -1;
    }

    public Servico obterServico(int pos){
        return servicos.get(pos);
    }

    public String mostrarServico(){
        StringBuilder str = new StringBuilder();
        if (servicos.isEmpty()) {
            str.append("Não há cursos inseridos!");
        } else {
            for (int i = 0; i < servicos.size(); i++) {
                str.append("Serviço: ").append(servicos.get(i)).append("\n");
            }
        }
        return str.toString();
    }

}
