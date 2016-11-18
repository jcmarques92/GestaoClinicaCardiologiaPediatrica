package cardiologiapediatrica;

import java.util.Calendar;

/**
 * Created by andrecosta on 12/11/16.
 */
public class Utente extends Pessoa {
    private int numeroProcesso;
    private int numeroUtente;
    private char sexo;
    private String sistemaSaude;
    private String nomeResponsavelUtente;
    private String parentescoResponsavel;
    private String emailResponsavel;
    private int telefoneResponsavel;
    private String nomeMedicoFamilia;
    private String username;
    private String password;

    public Utente(int nif, String nome, Calendar dataNascimento, int numeroUtente, char sexo, String sistemaSaude,
                  String nomeResponsavelUtente, String parentescoResponsavel, String emailResponsavel,
                  int telefoneResponsavel, String nomeMedicoFamilia, String username, String password) {
        super(nif, nome, dataNascimento);
        this.numeroUtente = numeroUtente;
        this.sexo = sexo;
        this.sistemaSaude = sistemaSaude;
        this.nomeResponsavelUtente = nomeResponsavelUtente;
        this.parentescoResponsavel = parentescoResponsavel;
        this.emailResponsavel = emailResponsavel;
        this.telefoneResponsavel = telefoneResponsavel;
        this.nomeMedicoFamilia = nomeMedicoFamilia;
        this.username = username;
        this.password = password;
    }

    public int calcularIdade(){
        int anos;
        Calendar dataAtual= Calendar.getInstance();
        anos= dataAtual.get(Calendar.YEAR)-dataNascimento.get(Calendar.YEAR);
        if (dataAtual.get(Calendar.DAY_OF_YEAR)< dataNascimento.get(Calendar.DAY_OF_YEAR) )
            anos --;
        return anos;
    }

    public boolean validarIdade(){
        if (calcularIdade()<18)
            return true;
        return false;
    }

    public String obterSexo(){
        String sexoCompleto="";
        if (getSexo()=='M')
            return sexoCompleto="Masculino";
        else if (getSexo()=='F')
            return sexoCompleto="Feminino";
        return sexoCompleto;
    }

    public int getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(int numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public int getNumeroUtente() {
        return numeroUtente;
    }

    public void setNumeroUtente(int numeroUtente) {
        this.numeroUtente = numeroUtente;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getSistemaSaude() {
        return sistemaSaude;
    }

    public void setSistemaSaude(String sistemaSaude) {
        this.sistemaSaude = sistemaSaude;
    }

    public String getNomeResponsavelUtente() {
        return nomeResponsavelUtente;
    }

    public void setNomeResponsavelUtente(String nomeResponsavelUtente) {
        this.nomeResponsavelUtente = nomeResponsavelUtente;
    }

    public String getParentescoResponsavel() {
        return parentescoResponsavel;
    }

    public void setParentescoResponsavel(String parentescoResponsavel) {
        this.parentescoResponsavel = parentescoResponsavel;
    }

    public String getEmailResponsavel() {
        return emailResponsavel;
    }

    public void setEmailResponsavel(String emailResponsavel) {
        this.emailResponsavel = emailResponsavel;
    }

    public int getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

    public void setTelefoneResponsavel(int telefoneResponsavel) {
        this.telefoneResponsavel = telefoneResponsavel;
    }

    public String getNomeMedicoFamilia() {
        return nomeMedicoFamilia;
    }

    public void setNomeMedicoFamilia(String nomeMedicoFamilia) {
        this.nomeMedicoFamilia = nomeMedicoFamilia;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\n\tNúmero do Processo: ").append(numeroProcesso);
        str.append("\n\tNúmero de Utente: ").append(numeroUtente);
        str.append("\n\tSexo: ").append(obterSexo());
        str.append("\n\tSistema de Saúde: ").append(sistemaSaude);
        str.append("\n\tDados do responsável pelo Utente: ");
        str.append("\n\tNome: ").append(nomeResponsavelUtente);
        str.append("\n\tParentesco: ").append(parentescoResponsavel);
        str.append("\n\tEmail: ").append(emailResponsavel);
        str.append("\n\tTelefone: ").append(telefoneResponsavel);
        str.append("\n\tNome do médico de família: ").append(nomeMedicoFamilia);
        str.append("\n\tUsername: ").append(username);
        return str.toString();
    }

}
