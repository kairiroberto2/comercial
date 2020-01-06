/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * Compra.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.bean;

import java.util.Date;

public class Compra {

    private int idcompra;
    private Date data;
    private int fornecedor;

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }
} // fim da classe Compra
