/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Davi
 */
public class Produto {
    
    public String nome;
    public double preco;
    public int quantidade;
    
    public double totalValoresEmEstoque(){
        return quantidade * preco;
    }
       
    public void adicionarProdutos(int quantidade){
        this.quantidade += quantidade;
    }
    
    public void removerProdutos(int quantidade){
        this.quantidade -= quantidade;
    }
    
    public String toString(){
        
        return nome+" , "
                + "$ "+String.format("%.2f", preco)+" , "
                + ""+quantidade+ " unidades, "
                + " Total: $ "+String.format("%.2f", totalValoresEmEstoque());
        
    }
    
}
