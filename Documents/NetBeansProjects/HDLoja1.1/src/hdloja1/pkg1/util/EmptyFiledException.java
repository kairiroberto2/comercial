/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * EmptyFiledException.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.util;

public class EmptyFiledException extends RuntimeException {

    @Override
    public String toString() {
        return "Campo vazio!";
    }
} // fim da classe EmptyFiledException
