/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * CadastroCategoriaJPanel.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.janelas;

import hdloja1.pkg1.bean.Categoria;
import hdloja1.pkg1.dao.GenericDAO;
import hdloja1.pkg1.dao.CategoriaDAOImp;
import hdloja1.pkg1.util.EmptyFiledException;
import hdloja1.pkg1.util.RegraDeNegocio;
import java.awt.Color;
import javax.swing.JOptionPane;

public class CadastroCategoriaJPanel extends javax.swing.JPanel {

    private Categoria categoria;
    private GenericDAO dAO;
    private boolean editando = false;
    private NovoPrograma1Teste novoPrograma1Teste;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JButton jButtonVisualizarTudo;
    private javax.swing.JLabel jLabelIdcategoria;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTituloCadastroCategoria;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JFormattedTextField jFormattedTextFieldIdcategoria;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

    /** Creates new form CadastroCategoriaJPanel */
    public CadastroCategoriaJPanel() {
        initComponents();
    } // fim do construtor CadastroCategoriaJPanel

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelTitulo = new javax.swing.JPanel();
        jLabelTituloCadastroCategoria = new javax.swing.JLabel();
        jButtonUltimo = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonPrimeiro = new javax.swing.JButton();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonVisualizarTudo = new javax.swing.JButton();
        jLabelIdcategoria = new javax.swing.JLabel();
        jFormattedTextFieldIdcategoria = new javax.swing.JFormattedTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();

        jPanelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTituloCadastroCategoria.setText("Cadastro Categoria");

        jPanelBotoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBotoes.setLayout(new java.awt.GridBagLayout());

        jButtonVisualizarTudo.setText("Visualizar Tudo");
        jButtonVisualizarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarTudoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 11);
        jPanelBotoes.add(jButtonVisualizarTudo, gridBagConstraints);

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdloja1/pkg1/img/excluir.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 0);
        jPanelBotoes.add(jButtonExcluir, gridBagConstraints);

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdloja1/pkg1/img/editar.png"))); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 0);
        jPanelBotoes.add(jButtonEditar, gridBagConstraints);

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdloja1/pkg1/img/salvar.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 0);
        jPanelBotoes.add(jButtonSalvar, gridBagConstraints);

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdloja1/pkg1/img/novo.png"))); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 11, 6, 0);
        jPanelBotoes.add(jButtonNovo, gridBagConstraints);

        jButtonUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdloja1/pkg1/img/seta_direita_dupla.png"))); // NOI18N
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        jButtonProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdloja1/pkg1/img/seta_direita.png"))); // NOI18N
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });

        jButtonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdloja1/pkg1/img/seta_esquerda.png"))); // NOI18N
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });
        jButtonPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdloja1/pkg1/img/seta_esquerda_dupla.png"))); // NOI18N
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelBotoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelTituloLayout.createSequentialGroup()
                        .addComponent(jLabelTituloCadastroCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                        .addComponent(jButtonPrimeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUltimo)))
                .addContainerGap())
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTituloCadastroCategoria)
                    .addComponent(jButtonUltimo)
                    .addComponent(jButtonProximo)
                    .addComponent(jButtonAnterior)
                    .addComponent(jButtonPrimeiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelIdcategoria.setText("Idcategoria:");

        jFormattedTextFieldIdcategoria.setColumns(11);
        jFormattedTextFieldIdcategoria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldIdcategoria.setText("1");

        jLabelNome.setText("Nome:");

        jTextFieldNome.setColumns(20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIdcategoria)
                    .addComponent(jLabelNome))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextFieldIdcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jFormattedTextFieldIdcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelIdcategoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNome)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        // TODO add your handling code here:
        restauraCampos(4);
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        // TODO add your handling code here:
        categoria = (Categoria) dAO.consultaSeta(
                jFormattedTextFieldIdcategoria.getText(), 2); // consulta registro anterior

        if (categoria == null) {
            jButtonPrimeiro.setEnabled(false);
            jButtonAnterior.setEnabled(false);
        } // fim do if
        else {
            setDados(categoria);

            habilitaCampos(false, false);

            habilitaBotoes(false);

            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
        } // fim do else

        jButtonUltimo.setEnabled(true);
        jButtonProximo.setEnabled(true);
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        // TODO add your handling code here:
        categoria = (Categoria) dAO.consultaSeta(
                jFormattedTextFieldIdcategoria.getText(), 3); // consulta proximo registro

        if (categoria == null) {
            jButtonUltimo.setEnabled(false);
            jButtonProximo.setEnabled(false);
        } // fim do if
        else {
            setDados(categoria);

            habilitaCampos(false, false);

            habilitaBotoes(false);

            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
        } // fim do else

        jButtonPrimeiro.setEnabled(true);
        jButtonAnterior.setEnabled(true);
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        // TODO add your handling code here:
        restauraCampos(1);
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        novoPrograma1Teste.consultaCategoriaJPanel.limpaSelecao();
        limpaCampos();

        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);

        editando = false;
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        categoria = getDados();

        if (categoria != null) {
            if (editando) {
                dAO.altera(categoria);
            } else {
                dAO.adiciona(categoria);
            }

            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);

            restauraCampos(1);

            novoPrograma1Teste.consultaCategoriaJPanel.atualizaTabela(null);

            editando = false;
        } // fim do if
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        habilitaCampos(false, true);

        habilitaBotoes(true);

        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);

        editando = true;
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(
                jFormattedTextFieldIdcategoria.getText());

        int op = JOptionPane.showConfirmDialog(novoPrograma1Teste,
                "Tem certeza que deseja excluir Idcategoria " + id + "?");

        if (op == JOptionPane.YES_OPTION) {
            dAO.remove(id);

            restauraCampos(1);

            novoPrograma1Teste.consultaCategoriaJPanel.atualizaTabela(null);

            editando = false;
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonVisualizarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarTudoActionPerformed
        // TODO add your handling code here:
        novoPrograma1Teste.exibeJInternalFrameConsultaCategoria();
    }//GEN-LAST:event_jButtonVisualizarTudoActionPerformed

    protected void setDados(Categoria categoria) {
        // labels dos campos de preenchimento obrigatorio
        jLabelIdcategoria.setForeground(Color.BLACK);
        jLabelNome.setForeground(Color.RED);
        //
        jFormattedTextFieldIdcategoria.setText("" + categoria.getIdcategoria());
        jTextFieldNome.setText(categoria.getNome());
    } // fim do metodo setDados

    protected Categoria getDados() {
        categoria = null;

        // destaca labels dos campos de preenchimento obrigatorio
        jLabelIdcategoria.setForeground(Color.RED);
        jLabelNome.setForeground(Color.RED);

        boolean continua = true;

        RegraDeNegocio regraDeNegocio = new RegraDeNegocio();

        try {
            regraDeNegocio.validaInteiro(jFormattedTextFieldIdcategoria.getText().trim());

            if (!editando && dAO.listaPorID(Integer.parseInt(
                    jFormattedTextFieldIdcategoria.getText())) != null) {
                System.out.println(jLabelIdcategoria.getText() + " possui valor duplicado!");

                JOptionPane.showMessageDialog(null,
                        jLabelIdcategoria.getText() + " possui valor duplicado!");

                continua = false;
            } else {
                jLabelIdcategoria.setForeground(Color.BLACK);
            }
        } catch (EmptyFiledException ex) {
            System.out.println(jLabelIdcategoria.getText() + " deve ser preenchido!");

            JOptionPane.showMessageDialog(null, jLabelIdcategoria.getText() + " deve ser preenchido!");
        } catch (NumberFormatException ex) {
            System.out.println(jLabelIdcategoria.getText() + " possui valor incorreto!\n"
                    + "Digite somente numeros inteiros.");

            JOptionPane.showMessageDialog(null, jLabelIdcategoria.getText() + " possui valor incorreto!\n"
                    + "Digite somente numeros inteiros.");

            continua = false;
        } // fim do catch

        try {
            regraDeNegocio.validaTexto(jTextFieldNome.getText().trim());

            jLabelNome.setForeground(Color.BLACK);
        } catch (EmptyFiledException ex) {
            System.out.println(jLabelNome.getText() + " deve ser preenchido!");

            JOptionPane.showMessageDialog(null, jLabelNome.getText() + " deve ser preenchido!");

            continua = false;
        } // fim do catch

        if (continua) {
            categoria = new Categoria();

            categoria.setIdcategoria(Integer.parseInt(
                    jFormattedTextFieldIdcategoria.getText()));
            categoria.setNome(jTextFieldNome.getText());
        } // fim do if continua

        return categoria;
    } // fim do metodo getDados

    public final void restauraCampos(int seta) {
        categoria = (Categoria) dAO.consultaSeta("", seta);

        if (categoria != null) {
            setDados(categoria);

            habilitaBotoes(false);

            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);

            switch (seta) {
                case 1:
                    jButtonPrimeiro.setEnabled(false);
                    jButtonAnterior.setEnabled(false);
                    jButtonUltimo.setEnabled(true);
                    jButtonProximo.setEnabled(true);
                    break;
                case 4:
                    jButtonPrimeiro.setEnabled(true);
                    jButtonAnterior.setEnabled(true);
                    jButtonUltimo.setEnabled(false);
                    jButtonProximo.setEnabled(false);
                    break;
            } // fim do switch

            habilitaCampos(false, false);
        } // fim do if
        else {
            limpaCampos();

            jButtonPrimeiro.setEnabled(false);
            jButtonAnterior.setEnabled(false);
            jButtonUltimo.setEnabled(false);
            jButtonProximo.setEnabled(false);
        } // fim do else
    } // fim do metodo restauraCampos

    protected void limpaCampos() {
        jFormattedTextFieldIdcategoria.setText("" + dAO.consultaProximoID());
        jTextFieldNome.setText("");

        habilitaBotoes(true);

        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);

        habilitaCampos(true, true);
    } // fim do metodo limpaCampos

    protected void habilitaCampos(boolean habilitadoID, boolean habilitado) {
        jFormattedTextFieldIdcategoria.setEditable(habilitadoID);
        jTextFieldNome.setEditable(habilitado);
    } // fim do metodo habilitaCampos

    private void habilitaBotoes(boolean habilitado) {
        jButtonSalvar.setEnabled(habilitado);
    } // fim do metodo habilitaBotoes

    protected void editaRegistro(int id) {
        categoria = (Categoria) dAO.listaPorID(id);
        setDados(categoria);

        habilitaCampos(false, true);

        habilitaBotoes(true);

        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);

        editando = true;
    } // fim do metodo editaRegistro

    protected void excluiRegistro(int id) {
        dAO.remove(id);

        editando = false;

        restauraCampos(1);
    } // fim do metodo excluiRegistro

    protected void setFrame(NovoPrograma1Teste frame) {
        novoPrograma1Teste = frame;

        dAO = new CategoriaDAOImp(frame);

        restauraCampos(1);
    } // fim do metodo setFrame
} // fim da classe CadastroCategoriaJPanel
