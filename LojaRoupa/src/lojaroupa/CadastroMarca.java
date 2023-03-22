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
public class CadastroMarca {
    public static void main(String[] args) {
         
          Marca m1 = new Marca();
           m1.setNomeMarca("Nike");
           m1.setCnpj("59.546.515/0001-34");
           m1.mostra();
           
          Marca m2 = new Marca();
           m2.setNomeMarca("Adidas");
           m2.setCnpj("42.274.696/0001-66");
           m2.mostra();
         
    }
    
}
