/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * GenericDAO.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.dao;

import java.util.List;

public interface GenericDAO<T> {

    public void adiciona(T entidade);

    public void altera(T entidade);

    public void remove(Object iD);

    public T listaPorID(Object iD);

    public T consultaSeta(String iD, int seta);

    public List<T> listaTudo();

    public int consultaProximoID();
} // fim da interface GenericDAO
