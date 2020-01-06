/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdloja1.pkg1;

import hdloja1.pkg1.janelas.CadastroClienteJPanel;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author kairi
 */
public class PrincipalJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalJFrame
     */
    public PrincipalJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CadClienteJMItem = new javax.swing.JMenuItem();
        CadFornecedorJMItem = new javax.swing.JMenuItem();
        CadProdutoJMItem = new javax.swing.JMenuItem();
        CadCategoriaJMItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ConsClienteJMItem1 = new javax.swing.JMenuItem();
        ConsFornecedorJMItem1 = new javax.swing.JMenuItem();
        ConsProdutoJMItem1 = new javax.swing.JMenuItem();
        ConsCategoriaJMItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cadastro");

        CadClienteJMItem.setText("Cliente");
        CadClienteJMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadClienteJMItemActionPerformed(evt);
            }
        });
        jMenu1.add(CadClienteJMItem);

        CadFornecedorJMItem.setText("Fornecedor");
        CadFornecedorJMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadFornecedorJMItemActionPerformed(evt);
            }
        });
        jMenu1.add(CadFornecedorJMItem);

        CadProdutoJMItem.setText("Produto");
        jMenu1.add(CadProdutoJMItem);

        CadCategoriaJMItem.setText("Categoria");
        jMenu1.add(CadCategoriaJMItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consulta");

        ConsClienteJMItem1.setText("Cliente");
        ConsClienteJMItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsClienteJMItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(ConsClienteJMItem1);

        ConsFornecedorJMItem1.setText("Fornecedor");
        ConsFornecedorJMItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsFornecedorJMItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(ConsFornecedorJMItem1);

        ConsProdutoJMItem1.setText("Produto");
        jMenu2.add(ConsProdutoJMItem1);

        ConsCategoriaJMItem1.setText("Categoria");
        jMenu2.add(ConsCategoriaJMItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Venda/Compra");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 876, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(894, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadFornecedorJMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadFornecedorJMItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadFornecedorJMItemActionPerformed

    private void CadClienteJMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadClienteJMItemActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame();
        CadastroClienteJPanel cliente = new CadastroClienteJPanel();
        frame.setLocationRelativeTo(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.add(cliente);
        frame.setVisible(true);
    }//GEN-LAST:event_CadClienteJMItemActionPerformed

    private void ConsClienteJMItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsClienteJMItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsClienteJMItem1ActionPerformed

    private void ConsFornecedorJMItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsFornecedorJMItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsFornecedorJMItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadCategoriaJMItem;
    private javax.swing.JMenuItem CadClienteJMItem;
    private javax.swing.JMenuItem CadFornecedorJMItem;
    private javax.swing.JMenuItem CadProdutoJMItem;
    private javax.swing.JMenuItem ConsCategoriaJMItem1;
    private javax.swing.JMenuItem ConsClienteJMItem1;
    private javax.swing.JMenuItem ConsFornecedorJMItem1;
    private javax.swing.JMenuItem ConsProdutoJMItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}