/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author igorl_000
 */
public class Pais {
    
    ArrayList<Pais> listaPaises = new ArrayList();
    
    private String nome;
    private String sigla;
    private String codigo;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome (String nome){
        if(nome.equals("")){
            JOptionPane.showMessageDialog(null, "Campo Nome Obrigatório", "ERRO",JOptionPane.OK_OPTION);
        }
        else{
            this.nome = nome;
        }
    }
    
    public String getSigla(){
        return sigla;
    }
    
    public void setSigla(String sigla){
        if(sigla.equals("")){
            JOptionPane.showMessageDialog(null, "Campo Sigla Obrigatório", "ERRO",JOptionPane.OK_OPTION);
        }
        else{
            this.sigla = sigla;
        }
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String codigo){
        
        if(codigo.equals(null) || ((!(codigo.matches("[0-9][0-9][0-9]"))) || (!(codigo.matches("[0-9][0-9]"))) || (!(codigo.matches("[0-9]"))))){
            JOptionPane.showMessageDialog(null, "Campo Código Obrigatório", "ERRO",JOptionPane.OK_OPTION);
        }
        else{
            this.codigo = codigo;
        }
    }
}
