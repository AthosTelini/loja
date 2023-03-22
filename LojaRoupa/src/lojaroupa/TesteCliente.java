/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaroupa;

/**
 *
 * @author user
 */
public class TesteCliente {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente(); 
        cliente1.setNomeCli("Ruan Matos");
        cliente1.setCidadeCli("Machado");
        cliente1.setRuaCli("Rua das Flores");
        cliente1.setNumCasaCli(321);
        cliente1.setTelCli(999991111);
        cliente1.mostra();
        
        Cliente cliente2 = new Cliente();
        cliente2.setNomeCli("Rafaela Santos");
        cliente2.setCidadeCli("Machado");
        cliente2.setRuaCli("Avenida Atlântica");
        cliente2.setNumCasaCli(64);
        cliente2.setTelCli(991234560);
        cliente2.mostra() ;
        
        
        
        Cliente cliente3 = new Cliente();
        cliente3.setNomeCli("Olivia Rodrigues");
        cliente3.setCidadeCli("Machado");
        cliente3.setRuaCli("Vila Esperança");
        cliente3.setNumCasaCli(777);
        cliente3.setTelCli(987924167);
        cliente3.mostra();
  
    }
    
}
