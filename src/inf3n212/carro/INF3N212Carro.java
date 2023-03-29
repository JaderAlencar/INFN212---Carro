/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inf3n212.carro;

import Controller.CCarro;
import Controller.CPessoa;

/**
 *
 * @author 182120009
 */
public class INF3N212Carro {
    
    public static CPessoa cadCPessoa = new CPessoa();
    public static CCarro cadCCarro = new CCarro();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cadCPessoa.mockPessoas();
        cadCCarro.mockCarros();
        
        System.out.println(cadCPessoa.getPesssoas());
        System.out.println("---");
        System.out.println(cadCCarro.getCarros());
        
        
    }
    
}
