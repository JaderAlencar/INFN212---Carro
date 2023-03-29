/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Carro;
import inf3n212.carro.INF3N212Carro;
import static inf3n212.carro.INF3N212Carro.cadCPessoa;
import java.util.ArrayList;

/**
 *
 * @author 182120009
 */
public class CCarro {

    ArrayList<Carro> carros = new ArrayList();

    public void addCarro(Carro c) {
        this.carros.add(c);

    }

    public void removeCarro(Carro c) {
        this.carros.remove(c);

    }

    public ArrayList<Carro> getCarros() {
        return this.carros;

    }

    public Carro getCarroPlaca(String placa) {

        Carro c = null;

        for (Carro carro : carros) {
            if (carro.getPlaca().equals(placa)) {
                c = carro;

                break;
            }
            
            
        }
        

        return c;

    }
    
  public void mockCarros(){
      Carro c1 = new Carro();
      c1.setPlaca("abc1f23");
      c1.setAnoFab(2023);
      c1.setAnoMod(2023);
      c1.setMarca("Fiat");
      c1.setModelo("Palio");
      c1.setTpCambio("Manual");
      c1.setCombustivel("Flex");
      c1.setCor("Bege");
      c1.setProprietario(cadCPessoa.getPessoaCPF("30668518006"));
      addCarro(c1);
      
      Carro c2 = new Carro();
      c2.setPlaca("def1g23");
      c2.setAnoFab(2021);
      c2.setAnoMod(2021);
      c2.setMarca("volkswagen");
      c2.setModelo("Corsa");
      c2.setTpCambio("Manual");
      c2.setCombustivel("Flex");
      c2.setCor("Azul");
      c2.setProprietario(cadCPessoa.getPessoaCPF("40668501002"));
      addCarro(c2);
  }

}//Fim Classe CCarro
