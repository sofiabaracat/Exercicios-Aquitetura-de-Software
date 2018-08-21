package exercicio01;

import javax.swing.JOptionPane;

/**
 *
 * @author gisely
 */
public class Pessoa {
    String nome;
    int idade;
    String pais;
    int telefone;
    double limite;
   
    public Pessoa(String nome, int idade, String pais, int telefone, double limite) {
        this.nome = nome;
        this.idade = idade;
        this.pais = pais;
        this.telefone = telefone;
        this.limite = limite;
        
  }
    
    public String getNome(){
         return nome;      
    }
    
    public void setNome (String nome){
        if (nome.length() < 5){
		JOptionPane.showMessageDialog(null, "O nome deve conter 5 ou mais caracteres", "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
        this.nome = nome;
    }
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getTelefone(){
        return telefone;
    }
    
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    
    public String getPais(){
        return pais;
    }
    
    public void setPais(String pais){
        this.pais = pais;
    }
    
    public double getLimite(){
        return limite;
    }
    
    
    public void setLimite (double limite){
        if (getIdade() < 18){
            this.limite = 100;
        } else if (getIdade() >=18 && getIdade() <=35){
            this.limite = 300;
        } else {
            this.limite = 500;
        }
        
        if (getPais().equals("BRASIL")){
            limite+= 100.00;
        }
    }
    
}
