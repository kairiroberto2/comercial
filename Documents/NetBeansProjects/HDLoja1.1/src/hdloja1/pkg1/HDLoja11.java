/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdloja1.pkg1;

import hdloja1.pkg1.janelas.NovoPrograma1Teste;
import javax.swing.JFrame;

/**
 *
 * @author kairi
 */
public class HDLoja11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PrincipalJFrame frame = new PrincipalJFrame();
        NovoPrograma1Teste frame = new NovoPrograma1Teste();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
    
}
