/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * Produto.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.bean;

public class Produto {

    private int idproduto;
    private String nome;
    private double preco;
    private double estoque;
    private int categoria;

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getEstoque() {
        return estoque;
    }

    public void setEstoque(double estoque) {
        this.estoque = estoque;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
} // fim da classe Produto
