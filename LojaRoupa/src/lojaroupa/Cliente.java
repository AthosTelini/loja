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
public class Cliente {
    private String nomeCli; //joao
    private String cidadeCli; //machado
    private String ruaCli; //varginha
    private int numCasaCli; //51
    private int telCli; //988449582
    
    public void mostra(){
        System.out.println("Cliente\n");
        System.out.println("Nome: "+this.nomeCli);
        System.out.println("Cidade: "+this.cidadeCli );
        System.out.println("Rua: "+this.ruaCli );
        System.out.println("Numero: "+this.numCasaCli);
        System.out.println("Telefone: "+this.telCli);
        
    }
    
    
    
    
    

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public String getCidadeCli() {
        return cidadeCli;
    }

    public void setCidadeCli(String cidadeCli) {
        this.cidadeCli = cidadeCli;
    }

    public String getRuaCli() {
        return ruaCli;
    }

    public void setRuaCli(String ruaCli) {
        this.ruaCli = ruaCli;
    }

    public int getNumCasaCli() {
        return numCasaCli;
    }

    public void setNumCasaCli(int numCasaCli) {
        this.numCasaCli = numCasaCli;
    }

    public int getTelCli() {
        return telCli;
    }

    public void setTelCli(int telCli) {
        this.telCli = telCli;
    }
    
    
}
