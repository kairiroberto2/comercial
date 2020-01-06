/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * ItensVenda.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1;

public class ItensVenda {

    private int iditensVenda;
    private int produto;
    private int venda;
    private double preco;
    private double quantidade;
    private double total;

    public int getIditensVenda() {
        return iditensVenda;
    }

    public void setIditensVenda(int iditensVenda) {
        this.iditensVenda = iditensVenda;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public int getVenda() {
        return venda;
    }

    public void setVenda(int venda) {
        this.venda = venda;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
} // fim da classe ItensVenda
