/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 182120009
 */
public class Pessoa {
    private int idPessoa;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

    public Pessoa() {
    }

    /**
     * Construtor da Classe Pessoa inicializando todos os atributos
     * @param idPessoa
     * @param nome
     * @param cpf
     * @param endereco
     * @param telefone 
     */
    public Pessoa(int idPessoa, String nome, String cpf, String endereco, String telefone) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Pessoa(String idPessoa, String nome, String cpf, String endereco, String telefone) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Método getIdPessoa pega o valor do atributo
     * @return 
     */
    public int getIdPessoa() {
        return idPessoa;
    }

    /**
     * Método setIdPessoa seta valor no atributo id da Pessoa
     * @param idPessoa 
     */
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\n---" + "\nidPessoa:\t" + idPessoa + "\nnome:\t" + nome 
                + "\ncpf:\t" + cpf + "\nendereco:\t" + endereco + "\ntelefone:\t" + telefone ;
    }

    public Pessoa getPessoaCPF(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}//fim classe
