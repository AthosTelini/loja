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
public class Funcionario {
    private String nomeF; 
    private String setor;
    private double salario;
    private boolean statusEmpresa;
    
    
    public String getnomeF() {
        return nomeF;
    }

    public void setnomeF(String nomeF) {
        this.nomeF = nomeF;
    }

    public String getsetor() {
        return setor;
    }

    public void setsetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isStatusEmpresa() {
        return statusEmpresa;
    }
    

    public void setStatusEmpresa(boolean statusEmpresa) {
        this.statusEmpresa = statusEmpresa;
    }
        public void demite(){
        this.statusEmpresa = false;
    }
        public void mostra(){
        System.out.println("Nome: "+nomeF);
        System.out.println("Departamento: "+setor);
        System.out.println("Salário: "+salario);
        System.out.println("Status: "+(statusEmpresa==true?"Trabalhando":"Demitido"));
    } 
    
}
