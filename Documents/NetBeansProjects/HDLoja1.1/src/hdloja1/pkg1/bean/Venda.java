/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * Venda.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.bean;

import java.util.Date;

public class Venda {

    private int idvenda;
    private Date data;
    private int cliente;

    public int getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }
} // fim da classe Venda
