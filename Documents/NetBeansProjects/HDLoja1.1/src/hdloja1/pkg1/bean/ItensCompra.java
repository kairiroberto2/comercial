/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * ItensCompra.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.bean;

public class ItensCompra {

    private int iditensCompra;
    private int produto;
    private int compra;
    private double preco;
    private double quantidade;
    private double total;

    public int getIditensCompra() {
        return iditensCompra;
    }

    public void setIditensCompra(int iditensCompra) {
        this.iditensCompra = iditensCompra;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public int getCompra() {
        return compra;
    }

    public void setCompra(int compra) {
        this.compra = compra;
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
} // fim da classe ItensCompra
