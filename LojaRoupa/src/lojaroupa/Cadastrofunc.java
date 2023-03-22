/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaroupa;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Cadastrofunc {
    public static void main(String[] args){
        Funcionario objFuncionario = new Funcionario();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome do Funcionario: ");
        objFuncionario.setnomeF(entrada.nextLine());
        System.out.println(" Setor: ");
        objFuncionario.setsetor(entrada.nextLine());
        System.out.println(" Salario mensal: ");
        objFuncionario.setSalario(entrada.nextDouble() );
        System.out.println("");
        objFuncionario.demite();
        objFuncionario.mostra();
    }
}
