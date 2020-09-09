/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author João Guilherme
 */
public class MonitoraEstoque implements ObserverProduto {
    
    private static final Double ESTOQUE_MINIMO = 2.0;
    private Double quantidadeEstoque;
    private Produto produto;
    private Subject subject;
    
    public MonitoraEstoque(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(Produto produto, Double quantidadeEstoque) {
        this.produto = produto;
        this.quantidadeEstoque = quantidadeEstoque;
        System.out.println(String.format("Estoque atual do produto %s: %f",
                produto.getDescricao(), quantidadeEstoque));
        if (quantidadeEstoque < ESTOQUE_MINIMO) {
            System.out.println("Gerar requisição de compra para produto: " +
                       produto.getDescricao());
        }
    }
    
}
