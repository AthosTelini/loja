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
public class Produto {
    private String nomeProd;//Calça slim clássica
    private String tamanho;//m
    private String genero;//feminina
    private double preco;// R$130 
    private int qtde;
    

    
    public void mostraProd(){
        System.out.println("\nProduto cadastrado ");
        System.out.println("Produto: "+this.nomeProd);
        System.out.println("Tamanho: "+this.tamanho);
        System.out.println("Genero: "+this.genero);
        System.out.println("Preco: "+this.preco);
        System.out.println("Quantidade deste produto: "+this.qtde);
        
    }
        
    
 
    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    
    
    
    
}
