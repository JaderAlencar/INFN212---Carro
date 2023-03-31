/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inf3n212.carro;

import Controller.CCarro;
import Controller.CPessoa;
import java.util.InputMismatchException;
import java.util.Scanner;

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
        int opM = 99;
        int opSM = 99;

        do {
            System.out.println("-- Sistema de Cadastro --");

            menuP();
            opM = leiaNumInt();

            switch (opM) {

                case 1:
                case 2:

                    do {

                        subMenu(opM);
                        opSM = leiaNumInt();

                        switch (opSM) {

                            case 1:
                                System.out.println("-- Cadastrar --");
                                if (opSM == 1) {
                                    cadastrarPessoa();

                                } else {
                                    cadastrarCarro();

                                }

                                break;

                            case 2:
                                System.out.println("-- Editar --");
                                if (opSM == 1) {
                                    editarPessoa();

                                } else {
                                    editarCarro();

                                }

                                break;

                            case 3:
                                System.out.println("-- Listar --");
                                if (opSM == 1) {
                                    listarPessoa();

                                } else {
                                    listarCarro();

                                }

                                break;

                            case 4:
                                System.out.println("-- Deletar --");
                                if (opSM == 1) {
                                    deletarPessoa();

                                } else {
                                    deletarCarro();

                                }

                                break;

                            case 0:

                                break;

                            default:
                                System.out.println("Opção inválida, tente novamente");

                        }

                    } while (opM != 0);


                    break;
                case 0:
                    System.out.println("Aplicação encerrada pelo usuário");

                default:
                    System.out.println("Opção inválida, tente novamente!");

            }

        } while (opM != 0);

    }//Fim método main

    public static int leiaNumInt() {
        Scanner leiaNum = new Scanner(System.in);
        try {
            return leiaNum.nextInt();
        } catch (InputMismatchException i) {
            System.out.println("Erro: " + i.getMessage() + "\nTente novamente!");
            leiaNumInt();
        }
        return 99;
    }

    public static void menuP() {
        System.out.println("-- Menu Principal --");
        System.out.println("1 - Ger. Pessoa");
        System.out.println("2 - Ger. Carro");
        System.out.println("0 - Sair");
        System.out.print("Digite aqui: ");
    }//fim menuP

    public static void subMenu(int opM) {
        String subM = null;
        if (opM == 1) {
            subM = "Pessoa";
        }
        if (opM == 2) {
            subM = "Carro";
        }
        System.out.println("-- Ger. " + subM + " --");
        System.out.println("1 - Cadastrar " + subM);
        System.out.println("2 - Editar " + subM);
        System.out.println("3 - Listar " + subM + "s");
        System.out.println("4 - Deletar " + subM);
        System.out.println("0 - Voltar");
        System.out.print("Digite aqui: ");

    }// fim subMenu

    private static void cadastrarPessoa() {
        System.out.println("Pessoa");
    }

    private static void cadastrarCarro() {
        System.out.println("Carro");
    }

    private static void editarPessoa() {
        System.out.println("Pessoa");
    }

    private static void editarCarro() {
        System.out.println("Carro");
    }

    private static void listarPessoa() {
        System.out.println("Pessoa");
    }

    private static void listarCarro() {
        System.out.println("Carro");
    }

    private static void deletarPessoa() {
        System.out.println("Pessoa");
    }

    private static void deletarCarro() {
        System.out.println("Carro");
    }

}//Fim da classe
