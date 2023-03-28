/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author 182120009
 */
public class CPessoa {

    ArrayList<Pessoa> pessoas = new ArrayList<>();
    int idPessoa = 1;

    /**
     * //Autoincrement idPessoa
     *
     * @return
     */
    public int geraID() {
        return this.idPessoa++;
    }

    /**
     * //Método addPessoa adiciona pessoa no ArrayList pessoas
     *
     * @param p
     */
    public void addPessoa(Pessoa p) {
        this.pessoas.add(p);

    }

    /**
     * //Método removePessoa remove pessoas do arraylist pessoas
     *
     * @param p
     */
    public void removePessoa(Pessoa p) {
        this.pessoas.remove(p);

    }

    public ArrayList<Pessoa> getPesssoas() {
        return this.pessoas;

    }

    /**
     * // Metodo getPessoaCPF retorna uma pesssoa caso encontre correspondência
     * no CPF do ArrayList pessoas, caso contrario.
     *
     * @param CPF
     * @return
     */
    public Pessoa getPessoaCPF(String CPF) {

        Pessoa p = null;

        for (Pessoa pes : pessoas) {
            if (pes.getCpf().equals(CPF)) {
                p = pes;
                break;

            }

        }

        return p;

    }//fim foreach

    public void mockPessoas() {
        Pessoa p1 = new Pessoa();
        p1.setIdPessoa(geraID());
        p1.setCpf("27201511068");
        p1.setNome("Juvenal das Candongas");
        p1.setTelefone("519998884142");
        p1.setEndereco("Eurico Lara");
        addPessoa(p1);

        Pessoa p2 = new Pessoa();
        p2.setIdPessoa(geraID());
        p2.setCpf("23185266056");
        p2.setNome("Madalena Espirito Santo");
        p2.setTelefone("51985362287");
        p2.setEndereco("Rua sem saida");
        addPessoa(p2);
        
        

    }

}//fim da classe controller
