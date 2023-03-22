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
public class CadatroProd {
    public static void main(String[] args) {
        
        Produto produto1 = new Produto(); 
        produto1.setNomeProd("Camisa");
        produto1.setTamanho("p");
        produto1.setGenero("Masculino");
        produto1.setPreco(60.00);
        produto1.setQtde(15);
        produto1.mostraProd();
        
        
        Produto produto2 = new Produto(); 
        produto2.setNomeProd("Calça");
        produto2.setTamanho("M");
        produto2.setGenero("Feminino");
        produto2.setPreco(129.99);
        produto2.setQtde(7);
        produto2.mostraProd();
        
        
}


    
}
