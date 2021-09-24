package application;

import entities.Produto;
import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        Produto p = new Produto();
        
        
        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        p.nome = leia.next();
        
        System.out.print("Preço: ");
        p.preco = leia.nextDouble();

        System.out.print("Quantidade em estoque: ");
        p.quantidade = leia.nextInt();

        System.out.println("Dados do produto: " + p);
        
        System.out.println("Entre com o numero de produtos a serem adicionados ao estoque: ");
        int quantidade = leia.nextInt();
        
        p.adicionarProdutos(quantidade);
        
        System.out.println("Atualização dados do produto: " + p);
        
        System.out.println("Entre com o numero de produtos a serem removidos do estoque: ");
        quantidade = leia.nextInt();
        
        p.removerProdutos(quantidade);
        
        System.out.println("Atualização dados do produto: " + p);
        
        
    }
    
}
