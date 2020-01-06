/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * RegraDeNegocio.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class RegraDeNegocio {

    public void validaTexto(String nome) throws EmptyFiledException {
        if (nome.isEmpty()) {
            throw new EmptyFiledException();
        }
    } // fim do metodo validaTexto

    public void validaInteiro(String numero) throws EmptyFiledException, NumberFormatException {
        if (numero.isEmpty()) {
            throw new EmptyFiledException();
        }

        Integer.parseInt(numero);
    } // fim do metodo validaInteiro

    public void validaPontoFlutuante(String numero) throws EmptyFiledException, NumberFormatException {
        if (numero.isEmpty()) {
            throw new EmptyFiledException();
        }

        Double.parseDouble(numero.replace(",", "."));
    } // fim do metodo validaPontoFlutuante

    public void validaData(String data, String formato) throws EmptyFiledException, ParseException {
        if (data.isEmpty()) {
            throw new EmptyFiledException();
        }

        if (formato != null) {
            new SimpleDateFormat(formato).parse(data);
        }
    } // fim do metodo validaData
} // fim da classe RegraDeNegocio
