/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * ConsultaItensCompraJPanel.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.janelas;

import hdloja1.pkg1.banco.ResultSetTableModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConsultaItensCompraJPanel extends javax.swing.JPanel {

    private NovoPrograma1Teste novoPrograma1Teste;
    private ResultSetTableModel tableModel;
    private static final String CONSULTA_PADRAO =
            "SELECT iditens_compra, produto, compra, preco, quantidade, "
            + "total"
            + " FROM itens_compra ";
    private static final String ORDER_BY = "ORDER BY iditens_compra";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPesquisa;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonVisualizarTudo;
    private javax.swing.JLabel jLabelTituloConsultaItensCompra;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JScrollPane jScrollPaneTabelaItensCompra;
    private javax.swing.JTable jTableItensCompra;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JToggleButton jToggleButtonIniciaCom;
    private javax.swing.JToggleButton jToggleButtonTem;
    private javax.swing.JToggleButton jToggleButtonTerminaCom;
    // End of variables declaration//GEN-END:variables

    /** Creates new form ConsultaItensCompraJPanel */
    public ConsultaItensCompraJPanel() {
        initComponents();
    } // fim do construtor ConsultaItensCompraJPanel

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroupPesquisa = new javax.swing.ButtonGroup();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelTituloConsultaItensCompra = new javax.swing.JLabel();
        jButtonVisualizarTudo = new javax.swing.JButton();
        jPanelBotoes = new javax.swing.JPanel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jToggleButtonTem = new javax.swing.JToggleButton();
        jToggleButtonIniciaCom = new javax.swing.JToggleButton();
        jToggleButtonTerminaCom = new javax.swing.JToggleButton();
        jScrollPaneTabelaItensCompra = new javax.swing.JScrollPane();
        jTableItensCompra = new javax.swing.JTable();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        jPanelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTituloConsultaItensCompra.setText("Consulta ItensCompra");

        jTextFieldPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisaKeyReleased(evt);
            }
        });
        jPanelBotoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBotoes.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 11, 6, 0);
        jPanelBotoes.add(jTextFieldPesquisa, gridBagConstraints);

        buttonGroupPesquisa.add(jToggleButtonTem);
        jToggleButtonTem.setSelected(true);
        jToggleButtonTem.setText("Tem");
        jToggleButtonTem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonTemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.11;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 6, 0);
        jPanelBotoes.add(jToggleButtonTem, gridBagConstraints);

        buttonGroupPesquisa.add(jToggleButtonIniciaCom);
        jToggleButtonIniciaCom.setText("Inicia Com");
        jToggleButtonIniciaCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonIniciaComActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 0);
        jPanelBotoes.add(jToggleButtonIniciaCom, gridBagConstraints);

        buttonGroupPesquisa.add(jToggleButtonTerminaCom);
        jToggleButtonTerminaCom.setText("Termina Com");
        jToggleButtonTerminaCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonTerminaComActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 11);
        jPanelBotoes.add(jToggleButtonTerminaCom, gridBagConstraints);

        jButtonVisualizarTudo.setText("Visualizar Tudo");
        jButtonVisualizarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarTudoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelBotoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                    .addGroup(jPanelTituloLayout.createSequentialGroup()
                        .addComponent(jLabelTituloConsultaItensCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                        .addComponent(jButtonVisualizarTudo)))
                .addContainerGap())
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTituloConsultaItensCompra)
                    .addComponent(jButtonVisualizarTudo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableItensCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableItensCompraMouseClicked(evt);
            }
        });
        jScrollPaneTabelaItensCompra.setViewportView(jTableItensCompra);

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdloja1/pkg1/img/editar.png"))); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdloja1/pkg1/img/excluir.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPaneTabelaItensCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTabelaItensCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonEditar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVisualizarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarTudoActionPerformed
        // TODO add your handling code here:
        jTextFieldPesquisa.setText("");
        atualizaTabela(criaConsulta(jTextFieldPesquisa.getText()));
    }//GEN-LAST:event_jButtonVisualizarTudoActionPerformed

    private void jTextFieldPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaKeyReleased
        // TODO add your handling code here:
        atualizaTabela(criaConsulta(jTextFieldPesquisa.getText()));
    }//GEN-LAST:event_jTextFieldPesquisaKeyReleased

    private void jToggleButtonTemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonTemActionPerformed
        // TODO add your handling code here:
        atualizaTabela(criaConsulta(jTextFieldPesquisa.getText()));
    }//GEN-LAST:event_jToggleButtonTemActionPerformed

    private void jToggleButtonIniciaComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonIniciaComActionPerformed
        // TODO add your handling code here:
        atualizaTabela(criaConsulta(jTextFieldPesquisa.getText()));
    }//GEN-LAST:event_jToggleButtonIniciaComActionPerformed

    private void jToggleButtonTerminaComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonTerminaComActionPerformed
        // TODO add your handling code here:
        atualizaTabela(criaConsulta(jTextFieldPesquisa.getText()));
    }//GEN-LAST:event_jToggleButtonTerminaComActionPerformed

    private void jTableItensCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableItensCompraMouseClicked
        // TODO add your handling code here:
        int selRow = jTableItensCompra.getSelectedRow();

        if (selRow > -1) {
            int id = Integer.parseInt(
                    jTableItensCompra.getValueAt(selRow, 0).toString());

            if (evt.getClickCount() > 1) {
                novoPrograma1Teste.cadastroItensCompraJPanel.editaRegistro(id);
                novoPrograma1Teste.exibeJInternalFrameCadastroItensCompra();
            } else {
                habilitaBotoes(true);
            }
        }
    }//GEN-LAST:event_jTableItensCompraMouseClicked

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        int selRow = jTableItensCompra.getSelectedRow();

        if (selRow > -1) {
            int id = Integer.parseInt(
                    jTableItensCompra.getValueAt(selRow, 0).toString());

            novoPrograma1Teste.cadastroItensCompraJPanel.editaRegistro(id);
            novoPrograma1Teste.exibeJInternalFrameCadastroItensCompra();
        } // fim do if
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        int selRow = jTableItensCompra.getSelectedRow();

        if (selRow > -1) {
            int id = Integer.parseInt(
                    jTableItensCompra.getValueAt(selRow, 0).toString());

            int op = JOptionPane.showConfirmDialog(novoPrograma1Teste,
                    "Tem certeza que deseja excluir IditensCompra " + id + "?");

            if (op == JOptionPane.YES_OPTION) {
                novoPrograma1Teste.cadastroItensCompraJPanel.excluiRegistro(id);
                jTextFieldPesquisa.setText("");
                atualizaTabela(criaConsulta(jTextFieldPesquisa.getText()));
            } // fim do if op
        } // fim do if selRow
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void habilitaBotoes(boolean habilitado) {
        jButtonEditar.setEnabled(habilitado);
        jButtonExcluir.setEnabled(habilitado);
    } // fim do metodo habilitaBotoes

    protected void limpaSelecao() {
        jTableItensCompra.getSelectionModel().clearSelection();

        habilitaBotoes(false);
    } // fim do metodo limpaSelecao

    protected String criaConsulta(String palavra) {
        if (jToggleButtonTem.isSelected()) {
            return CONSULTA_PADRAO
                    + "WHERE iditens_compra LIKE '%" + palavra + "%' "
                    + "OR produto LIKE '%" + palavra + "%' "
                    + "OR compra LIKE '%" + palavra + "%' "
                    + "OR preco LIKE '%" + palavra + "%' "
                    + "OR quantidade LIKE '%" + palavra + "%' "
                    + "OR total LIKE '%" + palavra + "%' "
                    + ORDER_BY;
        }
        if (jToggleButtonIniciaCom.isSelected()) {
            return CONSULTA_PADRAO
                    + "WHERE iditens_compra LIKE '" + palavra + "%' "
                    + "OR produto LIKE '" + palavra + "%' "
                    + "OR compra LIKE '" + palavra + "%' "
                    + "OR preco LIKE '" + palavra + "%' "
                    + "OR quantidade LIKE '" + palavra + "%' "
                    + "OR total LIKE '" + palavra + "%' "
                    + ORDER_BY;
        }
        if (jToggleButtonTerminaCom.isSelected()) {
            return CONSULTA_PADRAO
                    + "WHERE iditens_compra LIKE '%" + palavra + "' "
                    + "OR produto LIKE '%" + palavra + "' "
                    + "OR compra LIKE '%" + palavra + "' "
                    + "OR preco LIKE '%" + palavra + "' "
                    + "OR quantidade LIKE '%" + palavra + "' "
                    + "OR total LIKE '%" + palavra + "' "
                    + ORDER_BY;
        }

        return null;
    } // fim do metodo criaConsulta

    protected void atualizaTabela(String consulta) {
        if (consulta == null) {
            consulta = criaConsulta("");
        }

        try {
            tableModel.setQuery(consulta);

            limpaSelecao();
        } // fim do try
        catch (SQLException sQLException) {
            System.out.println("Ocorreu um erro ao acessar o banco de dados.\n");
            sQLException.printStackTrace();

            // desconecta do banco de dados
            tableModel.disconnectFromDatabase();

            System.exit(1);   // termina o aplicativo
        } // fim do catch
    } // fim do metodo atualizaTabela

    protected void setFrame(NovoPrograma1Teste frame) {
        novoPrograma1Teste = frame;

        try {
            // cria o TableModel para resultados da consulta
            tableModel = new ResultSetTableModel(CONSULTA_PADRAO);

            jTableItensCompra.setModel(tableModel);
        } // fim do try
        catch (SQLException sQLException) {
            System.out.println("Ocorreu um erro ao acessar o banco de dados.\n");
            sQLException.printStackTrace();

            // desconecta do banco de dados
            tableModel.disconnectFromDatabase();

            System.exit(1);   // termina o aplicativo
        } // fim do catch

        novoPrograma1Teste.addWindowListener(
                new WindowAdapter() {

                    // desconecta-se do banco de dados e sai quando a janela for fechada
                    @Override
                    public void windowClosed(WindowEvent e) {
                        tableModel.disconnectFromDatabase();
                    }
                });
    } // fim do metodo setFrame
} // fim da classe ConsultaItensCompraJPanel
