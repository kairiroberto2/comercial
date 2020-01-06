/**
 * J Planet 1.4.2 - http://ateoriadadesevolucao.blogspot.com/p/software-j-planet.html
 */

/*
 * NovoPrograma1Teste.java
 *
 * Criado em 05/01/2020, 14:42:20
 */
package hdloja1.pkg1.janelas;

import hdloja1.pkg1.util.Constantes;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class NovoPrograma1Teste extends javax.swing.JFrame {

    private final ImageIcon ICONE_JANELA = new ImageIcon(getClass().getResource("/hdloja1/pkg1/img/j-planet-32x32.png"));
    protected CadastroCategoriaJPanel cadastroCategoriaJPanel;
    protected ConsultaCategoriaJPanel consultaCategoriaJPanel;
    protected CadastroClienteJPanel cadastroClienteJPanel;
    protected ConsultaClienteJPanel consultaClienteJPanel;
    protected CadastroCompraJPanel cadastroCompraJPanel;
    protected ConsultaCompraJPanel consultaCompraJPanel;
    protected CadastroFornecedorJPanel cadastroFornecedorJPanel;
    protected ConsultaFornecedorJPanel consultaFornecedorJPanel;
    protected CadastroItensCompraJPanel cadastroItensCompraJPanel;
    protected ConsultaItensCompraJPanel consultaItensCompraJPanel;
    protected CadastroItensVendaJPanel cadastroItensVendaJPanel;
    protected ConsultaItensVendaJPanel consultaItensVendaJPanel;
    protected CadastroPessoaJPanel cadastroPessoaJPanel;
    protected ConsultaPessoaJPanel consultaPessoaJPanel;
    protected CadastroProdutoJPanel cadastroProdutoJPanel;
    protected ConsultaProdutoJPanel consultaProdutoJPanel;
    protected CadastroVendaJPanel cadastroVendaJPanel;
    protected ConsultaVendaJPanel consultaVendaJPanel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JInternalFrame jInternalFrameCadastroCategoria;
    private javax.swing.JInternalFrame jInternalFrameCadastroCliente;
    private javax.swing.JInternalFrame jInternalFrameCadastroCompra;
    private javax.swing.JInternalFrame jInternalFrameCadastroFornecedor;
    private javax.swing.JInternalFrame jInternalFrameCadastroItensCompra;
    private javax.swing.JInternalFrame jInternalFrameCadastroItensVenda;
    private javax.swing.JInternalFrame jInternalFrameCadastroPessoa;
    private javax.swing.JInternalFrame jInternalFrameCadastroProduto;
    private javax.swing.JInternalFrame jInternalFrameCadastroVenda;
    private javax.swing.JInternalFrame jInternalFrameConsultaCategoria;
    private javax.swing.JInternalFrame jInternalFrameConsultaCliente;
    private javax.swing.JInternalFrame jInternalFrameConsultaCompra;
    private javax.swing.JInternalFrame jInternalFrameConsultaFornecedor;
    private javax.swing.JInternalFrame jInternalFrameConsultaItensCompra;
    private javax.swing.JInternalFrame jInternalFrameConsultaItensVenda;
    private javax.swing.JInternalFrame jInternalFrameConsultaPessoa;
    private javax.swing.JInternalFrame jInternalFrameConsultaProduto;
    private javax.swing.JInternalFrame jInternalFrameConsultaVenda;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuCompraVenda;
    private javax.swing.JMenu jMenuConsulta;
    private javax.swing.JMenuItem jMenuItemCadastroCategoria;
    private javax.swing.JMenuItem jMenuItemCadastroCliente;
    private javax.swing.JMenuItem jMenuItemCadastroCompra;
    private javax.swing.JMenuItem jMenuItemCadastroFornecedor;
    private javax.swing.JMenuItem jMenuItemCadastroItensCompra;
    private javax.swing.JMenuItem jMenuItemCadastroItensVenda;
    private javax.swing.JMenuItem jMenuItemCadastroPessoa;
    private javax.swing.JMenuItem jMenuItemCadastroProduto;
    private javax.swing.JMenuItem jMenuItemCadastroVenda;
    private javax.swing.JMenuItem jMenuItemConsultaCategoria;
    private javax.swing.JMenuItem jMenuItemConsultaCliente;
    private javax.swing.JMenuItem jMenuItemConsultaCompra;
    private javax.swing.JMenuItem jMenuItemConsultaFornecedor;
    private javax.swing.JMenuItem jMenuItemConsultaItensCompra;
    private javax.swing.JMenuItem jMenuItemConsultaItensVenda;
    private javax.swing.JMenuItem jMenuItemConsultaPessoa;
    private javax.swing.JMenuItem jMenuItemConsultaProduto;
    private javax.swing.JMenuItem jMenuItemConsultaVenda;
    private javax.swing.JScrollPane jScrollPaneCadastroCategoria;
    private javax.swing.JScrollPane jScrollPaneCadastroCliente;
    private javax.swing.JScrollPane jScrollPaneCadastroCompra;
    private javax.swing.JScrollPane jScrollPaneCadastroFornecedor;
    private javax.swing.JScrollPane jScrollPaneCadastroItensCompra;
    private javax.swing.JScrollPane jScrollPaneCadastroItensVenda;
    private javax.swing.JScrollPane jScrollPaneCadastroPessoa;
    private javax.swing.JScrollPane jScrollPaneCadastroProduto;
    private javax.swing.JScrollPane jScrollPaneCadastroVenda;
    // End of variables declaration//GEN-END:variables

    /** Creates new form NovoPrograma1Teste */
    public NovoPrograma1Teste() {

        cadastroCategoriaJPanel = new CadastroCategoriaJPanel();
        consultaCategoriaJPanel = new ConsultaCategoriaJPanel();

        cadastroClienteJPanel = new CadastroClienteJPanel();
        consultaClienteJPanel = new ConsultaClienteJPanel();

        cadastroCompraJPanel = new CadastroCompraJPanel();
        consultaCompraJPanel = new ConsultaCompraJPanel();

        cadastroFornecedorJPanel = new CadastroFornecedorJPanel();
        consultaFornecedorJPanel = new ConsultaFornecedorJPanel();

        cadastroItensCompraJPanel = new CadastroItensCompraJPanel();
        consultaItensCompraJPanel = new ConsultaItensCompraJPanel();

        cadastroItensVendaJPanel = new CadastroItensVendaJPanel();
        consultaItensVendaJPanel = new ConsultaItensVendaJPanel();

        cadastroPessoaJPanel = new CadastroPessoaJPanel();
        consultaPessoaJPanel = new ConsultaPessoaJPanel();

        cadastroProdutoJPanel = new CadastroProdutoJPanel();
        consultaProdutoJPanel = new ConsultaProdutoJPanel();

        cadastroVendaJPanel = new CadastroVendaJPanel();
        consultaVendaJPanel = new ConsultaVendaJPanel();

        /**
         * Verifica a conexao com o banco antes de iniciar o aplicativo
         */
        try {
            java.sql.DriverManager.getConnection(Constantes.URL_BANCO,
                    Constantes.NOME_USUARIO, Constantes.SENHA);
        } catch (java.sql.SQLException e) {
            // configura janela principal
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Agenda");
            setIconImage((ICONE_JANELA).getImage());
            setLocationRelativeTo(null);
            setVisible(true);
            //
            javax.swing.JOptionPane.showMessageDialog(NovoPrograma1Teste.this,
                    "Erro ao conectar banco de dados!\n\n"
                    + "Erro ocorrido:\n" + e.getMessage());

            e.printStackTrace();

            System.exit(0); // sair do programa
        } // fim do catch

        initComponents();

        setVisible(true);

        cadastroCategoriaJPanel.setFrame(NovoPrograma1Teste.this);
        consultaCategoriaJPanel.setFrame(NovoPrograma1Teste.this);

        cadastroClienteJPanel.setFrame(NovoPrograma1Teste.this);
        consultaClienteJPanel.setFrame(NovoPrograma1Teste.this);

        cadastroCompraJPanel.setFrame(NovoPrograma1Teste.this);
        consultaCompraJPanel.setFrame(NovoPrograma1Teste.this);

        cadastroFornecedorJPanel.setFrame(NovoPrograma1Teste.this);
        consultaFornecedorJPanel.setFrame(NovoPrograma1Teste.this);

        cadastroItensCompraJPanel.setFrame(NovoPrograma1Teste.this);
        consultaItensCompraJPanel.setFrame(NovoPrograma1Teste.this);

        cadastroItensVendaJPanel.setFrame(NovoPrograma1Teste.this);
        consultaItensVendaJPanel.setFrame(NovoPrograma1Teste.this);

        cadastroPessoaJPanel.setFrame(NovoPrograma1Teste.this);
        consultaPessoaJPanel.setFrame(NovoPrograma1Teste.this);

        cadastroProdutoJPanel.setFrame(NovoPrograma1Teste.this);
        consultaProdutoJPanel.setFrame(NovoPrograma1Teste.this);

        cadastroVendaJPanel.setFrame(NovoPrograma1Teste.this);
        consultaVendaJPanel.setFrame(NovoPrograma1Teste.this);

        setSize(700, 500);
        setExtendedState(NovoPrograma1Teste.MAXIMIZED_BOTH);
    } // fim do construtor NovoPrograma1Teste

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jInternalFrameCadastroCategoria = new javax.swing.JInternalFrame();
        jScrollPaneCadastroCategoria = new javax.swing.JScrollPane();
        jInternalFrameCadastroCliente = new javax.swing.JInternalFrame();
        jScrollPaneCadastroCliente = new javax.swing.JScrollPane();
        jInternalFrameCadastroCompra = new javax.swing.JInternalFrame();
        jScrollPaneCadastroCompra = new javax.swing.JScrollPane();
        jInternalFrameCadastroFornecedor = new javax.swing.JInternalFrame();
        jScrollPaneCadastroFornecedor = new javax.swing.JScrollPane();
        jInternalFrameCadastroItensCompra = new javax.swing.JInternalFrame();
        jScrollPaneCadastroItensCompra = new javax.swing.JScrollPane();
        jInternalFrameCadastroItensVenda = new javax.swing.JInternalFrame();
        jScrollPaneCadastroItensVenda = new javax.swing.JScrollPane();
        jInternalFrameCadastroPessoa = new javax.swing.JInternalFrame();
        jScrollPaneCadastroPessoa = new javax.swing.JScrollPane();
        jInternalFrameCadastroProduto = new javax.swing.JInternalFrame();
        jScrollPaneCadastroProduto = new javax.swing.JScrollPane();
        jInternalFrameCadastroVenda = new javax.swing.JInternalFrame();
        jScrollPaneCadastroVenda = new javax.swing.JScrollPane();
        jInternalFrameConsultaCategoria = new javax.swing.JInternalFrame();
        jInternalFrameConsultaCliente = new javax.swing.JInternalFrame();
        jInternalFrameConsultaCompra = new javax.swing.JInternalFrame();
        jInternalFrameConsultaFornecedor = new javax.swing.JInternalFrame();
        jInternalFrameConsultaItensCompra = new javax.swing.JInternalFrame();
        jInternalFrameConsultaItensVenda = new javax.swing.JInternalFrame();
        jInternalFrameConsultaPessoa = new javax.swing.JInternalFrame();
        jInternalFrameConsultaProduto = new javax.swing.JInternalFrame();
        jInternalFrameConsultaVenda = new javax.swing.JInternalFrame();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadastroCategoria = new javax.swing.JMenuItem();
        jMenuItemCadastroCliente = new javax.swing.JMenuItem();
        jMenuItemCadastroFornecedor = new javax.swing.JMenuItem();
        jMenuItemCadastroPessoa = new javax.swing.JMenuItem();
        jMenuItemCadastroProduto = new javax.swing.JMenuItem();
        jMenuConsulta = new javax.swing.JMenu();
        jMenuItemConsultaCategoria = new javax.swing.JMenuItem();
        jMenuItemConsultaCliente = new javax.swing.JMenuItem();
        jMenuItemConsultaFornecedor = new javax.swing.JMenuItem();
        jMenuItemConsultaPessoa = new javax.swing.JMenuItem();
        jMenuItemConsultaProduto = new javax.swing.JMenuItem();
        jMenuCompraVenda = new javax.swing.JMenu();
        jMenuItemCadastroItensCompra = new javax.swing.JMenuItem();
        jMenuItemCadastroItensVenda = new javax.swing.JMenuItem();
        jMenuItemCadastroVenda = new javax.swing.JMenuItem();
        jMenuItemCadastroCompra = new javax.swing.JMenuItem();
        jMenuItemConsultaCompra = new javax.swing.JMenuItem();
        jMenuItemConsultaItensCompra = new javax.swing.JMenuItem();
        jMenuItemConsultaItensVenda = new javax.swing.JMenuItem();
        jMenuItemConsultaVenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HD Loja");
        setIconImage((ICONE_JANELA).getImage());

        jInternalFrameCadastroCategoria.setClosable(true);
        jInternalFrameCadastroCategoria.setIconifiable(true);
        jInternalFrameCadastroCategoria.setMaximizable(true);
        jInternalFrameCadastroCategoria.setResizable(true);
        jInternalFrameCadastroCategoria.setTitle("Cadastro Categoria");
        jInternalFrameCadastroCategoria.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameCadastroCategoriaInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jScrollPaneCadastroCategoria.setViewportView(cadastroCategoriaJPanel);

        javax.swing.GroupLayout jInternalFrameCadastroCategoriaLayout = new javax.swing.GroupLayout(jInternalFrameCadastroCategoria.getContentPane());
        jInternalFrameCadastroCategoria.getContentPane().setLayout(jInternalFrameCadastroCategoriaLayout);
        jInternalFrameCadastroCategoriaLayout.setHorizontalGroup(
            jInternalFrameCadastroCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCadastroCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );
        jInternalFrameCadastroCategoriaLayout.setVerticalGroup(
            jInternalFrameCadastroCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCadastroCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        jDesktopPane.add(jInternalFrameCadastroCategoria);
        jInternalFrameCadastroCategoria.setBounds(10, 10, 565, 349);

        jInternalFrameCadastroCliente.setClosable(true);
        jInternalFrameCadastroCliente.setIconifiable(true);
        jInternalFrameCadastroCliente.setMaximizable(true);
        jInternalFrameCadastroCliente.setResizable(true);
        jInternalFrameCadastroCliente.setTitle("Cadastro Cliente");
        jInternalFrameCadastroCliente.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameCadastroClienteInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jScrollPaneCadastroCliente.setViewportView(cadastroClienteJPanel);

        javax.swing.GroupLayout jInternalFrameCadastroClienteLayout = new javax.swing.GroupLayout(jInternalFrameCadastroCliente.getContentPane());
        jInternalFrameCadastroCliente.getContentPane().setLayout(jInternalFrameCadastroClienteLayout);
        jInternalFrameCadastroClienteLayout.setHorizontalGroup(
            jInternalFrameCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCadastroCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );
        jInternalFrameCadastroClienteLayout.setVerticalGroup(
            jInternalFrameCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCadastroCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        jDesktopPane.add(jInternalFrameCadastroCliente);
        jInternalFrameCadastroCliente.setBounds(10, 10, 565, 349);

        jInternalFrameCadastroCompra.setClosable(true);
        jInternalFrameCadastroCompra.setIconifiable(true);
        jInternalFrameCadastroCompra.setMaximizable(true);
        jInternalFrameCadastroCompra.setResizable(true);
        jInternalFrameCadastroCompra.setTitle("Cadastro Compra");
        jInternalFrameCadastroCompra.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameCadastroCompraInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jScrollPaneCadastroCompra.setViewportView(cadastroCompraJPanel);

        javax.swing.GroupLayout jInternalFrameCadastroCompraLayout = new javax.swing.GroupLayout(jInternalFrameCadastroCompra.getContentPane());
        jInternalFrameCadastroCompra.getContentPane().setLayout(jInternalFrameCadastroCompraLayout);
        jInternalFrameCadastroCompraLayout.setHorizontalGroup(
            jInternalFrameCadastroCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCadastroCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );
        jInternalFrameCadastroCompraLayout.setVerticalGroup(
            jInternalFrameCadastroCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCadastroCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        jDesktopPane.add(jInternalFrameCadastroCompra);
        jInternalFrameCadastroCompra.setBounds(10, 10, 565, 349);

        jInternalFrameCadastroFornecedor.setClosable(true);
        jInternalFrameCadastroFornecedor.setIconifiable(true);
        jInternalFrameCadastroFornecedor.setMaximizable(true);
        jInternalFrameCadastroFornecedor.setResizable(true);
        jInternalFrameCadastroFornecedor.setTitle("Cadastro Fornecedor");
        jInternalFrameCadastroFornecedor.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameCadastroFornecedorInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jScrollPaneCadastroFornecedor.setViewportView(cadastroFornecedorJPanel);

        javax.swing.GroupLayout jInternalFrameCadastroFornecedorLayout = new javax.swing.GroupLayout(jInternalFrameCadastroFornecedor.getContentPane());
        jInternalFrameCadastroFornecedor.getContentPane().setLayout(jInternalFrameCadastroFornecedorLayout);
        jInternalFrameCadastroFornecedorLayout.setHorizontalGroup(
            jInternalFrameCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCadastroFornecedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );
        jInternalFrameCadastroFornecedorLayout.setVerticalGroup(
            jInternalFrameCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCadastroFornecedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        jDesktopPane.add(jInternalFrameCadastroFornecedor);
        jInternalFrameCadastroFornecedor.setBounds(10, 10, 565, 349);

        jInternalFrameCadastroItensCompra.setClosable(true);
        jInternalFrameCadastroItensCompra.setIconifiable(true);
        jInternalFrameCadastroItensCompra.setMaximizable(true);
        jInternalFrameCadastroItensCompra.setResizable(true);
        jInternalFrameCadastroItensCompra.setTitle("Cadastro ItensCompra");
        jInternalFrameCadastroItensCompra.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameCadastroItensCompraInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jScrollPaneCadastroItensCompra.setViewportView(cadastroItensCompraJPanel);

        javax.swing.GroupLayout jInternalFrameCadastroItensCompraLayout = new javax.swing.GroupLayout(jInternalFrameCadastroItensCompra.getContentPane());
        jInternalFrameCadastroItensCompra.getContentPane().setLayout(jInternalFrameCadastroItensCompraLayout);
        jInternalFrameCadastroItensCompraLayout.setHorizontalGroup(
            jInternalFrameCadastroItensCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCadastroItensCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );
        jInternalFrameCadastroItensCompraLayout.setVerticalGroup(
            jInternalFrameCadastroItensCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCadastroItensCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        jDesktopPane.add(jInternalFrameCadastroItensCompra);
        jInternalFrameCadastroItensCompra.setBounds(10, 10, 565, 349);

        jInternalFrameCadastroItensVenda.setClosable(true);
        jInternalFrameCadastroItensVenda.setIconifiable(true);
        jInternalFrameCadastroItensVenda.setMaximizable(true);
        jInternalFrameCadastroItensVenda.setResizable(true);
        jInternalFrameCadastroItensVenda.setTitle("Cadastro ItensVenda");
        jInternalFrameCadastroItensVenda.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameCadastroItensVendaInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jScrollPaneCadastroItensVenda.setViewportView(cadastroItensVendaJPanel);

        javax.swing.GroupLayout jInternalFrameCadastroItensVendaLayout = new javax.swing.GroupLayout(jInternalFrameCadastroItensVenda.getContentPane());
        jInternalFrameCadastroItensVenda.getContentPane().setLayout(jInternalFrameCadastroItensVendaLayout);
        jInternalFrameCadastroItensVendaLayout.setHorizontalGroup(
            jInternalFrameCadastroItensVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCadastroItensVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );
        jInternalFrameCadastroItensVendaLayout.setVerticalGroup(
            jInternalFrameCadastroItensVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCadastroItensVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        jDesktopPane.add(jInternalFrameCadastroItensVenda);
        jInternalFrameCadastroItensVenda.setBounds(10, 10, 565, 349);

        jInternalFrameCadastroPessoa.setClosable(true);
        jInternalFrameCadastroPessoa.setIconifiable(true);
        jInternalFrameCadastroPessoa.setMaximizable(true);
        jInternalFrameCadastroPessoa.setResizable(true);
        jInternalFrameCadastroPessoa.setTitle("Cadastro Pessoa");
        jInternalFrameCadastroPessoa.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameCadastroPessoaInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jScrollPaneCadastroPessoa.setViewportView(cadastroPessoaJPanel);

        javax.swing.GroupLayout jInternalFrameCadastroPessoaLayout = new javax.swing.GroupLayout(jInternalFrameCadastroPessoa.getContentPane());
        jInternalFrameCadastroPessoa.getContentPane().setLayout(jInternalFrameCadastroPessoaLayout);
        jInternalFrameCadastroPessoaLayout.setHorizontalGroup(
            jInternalFrameCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCadastroPessoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );
        jInternalFrameCadastroPessoaLayout.setVerticalGroup(
            jInternalFrameCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCadastroPessoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        jDesktopPane.add(jInternalFrameCadastroPessoa);
        jInternalFrameCadastroPessoa.setBounds(10, 10, 565, 349);

        jInternalFrameCadastroProduto.setClosable(true);
        jInternalFrameCadastroProduto.setIconifiable(true);
        jInternalFrameCadastroProduto.setMaximizable(true);
        jInternalFrameCadastroProduto.setResizable(true);
        jInternalFrameCadastroProduto.setTitle("Cadastro Produto");
        jInternalFrameCadastroProduto.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameCadastroProdutoInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jScrollPaneCadastroProduto.setViewportView(cadastroProdutoJPanel);

        javax.swing.GroupLayout jInternalFrameCadastroProdutoLayout = new javax.swing.GroupLayout(jInternalFrameCadastroProduto.getContentPane());
        jInternalFrameCadastroProduto.getContentPane().setLayout(jInternalFrameCadastroProdutoLayout);
        jInternalFrameCadastroProdutoLayout.setHorizontalGroup(
            jInternalFrameCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCadastroProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );
        jInternalFrameCadastroProdutoLayout.setVerticalGroup(
            jInternalFrameCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCadastroProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        jDesktopPane.add(jInternalFrameCadastroProduto);
        jInternalFrameCadastroProduto.setBounds(10, 10, 565, 349);

        jInternalFrameCadastroVenda.setClosable(true);
        jInternalFrameCadastroVenda.setIconifiable(true);
        jInternalFrameCadastroVenda.setMaximizable(true);
        jInternalFrameCadastroVenda.setResizable(true);
        jInternalFrameCadastroVenda.setTitle("Cadastro Venda");
        jInternalFrameCadastroVenda.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameCadastroVendaInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jScrollPaneCadastroVenda.setViewportView(cadastroVendaJPanel);

        javax.swing.GroupLayout jInternalFrameCadastroVendaLayout = new javax.swing.GroupLayout(jInternalFrameCadastroVenda.getContentPane());
        jInternalFrameCadastroVenda.getContentPane().setLayout(jInternalFrameCadastroVendaLayout);
        jInternalFrameCadastroVendaLayout.setHorizontalGroup(
            jInternalFrameCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCadastroVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );
        jInternalFrameCadastroVendaLayout.setVerticalGroup(
            jInternalFrameCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCadastroVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        jDesktopPane.add(jInternalFrameCadastroVenda);
        jInternalFrameCadastroVenda.setBounds(10, 10, 565, 349);

        jInternalFrameConsultaCategoria.setClosable(true);
        jInternalFrameConsultaCategoria.setIconifiable(true);
        jInternalFrameConsultaCategoria.setMaximizable(true);
        jInternalFrameConsultaCategoria.setResizable(true);
        jInternalFrameConsultaCategoria.setTitle("Consulta Categoria");
        jInternalFrameConsultaCategoria.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameConsultaCategoriaInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        javax.swing.GroupLayout jInternalFrameConsultaCategoriaLayout = new javax.swing.GroupLayout(jInternalFrameConsultaCategoria.getContentPane());
        jInternalFrameConsultaCategoria.getContentPane().setLayout(jInternalFrameConsultaCategoriaLayout);
        jInternalFrameConsultaCategoriaLayout.setHorizontalGroup(
            jInternalFrameConsultaCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        jInternalFrameConsultaCategoriaLayout.setVerticalGroup(
            jInternalFrameConsultaCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        jInternalFrameConsultaCategoria.setLayout(new java.awt.BorderLayout());
        jInternalFrameConsultaCategoria.add(consultaCategoriaJPanel);

        jDesktopPane.add(jInternalFrameConsultaCategoria);
        jInternalFrameConsultaCategoria.setBounds(570, 250, 563, 347);

        jInternalFrameConsultaCliente.setClosable(true);
        jInternalFrameConsultaCliente.setIconifiable(true);
        jInternalFrameConsultaCliente.setMaximizable(true);
        jInternalFrameConsultaCliente.setResizable(true);
        jInternalFrameConsultaCliente.setTitle("Consulta Cliente");
        jInternalFrameConsultaCliente.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameConsultaClienteInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        javax.swing.GroupLayout jInternalFrameConsultaClienteLayout = new javax.swing.GroupLayout(jInternalFrameConsultaCliente.getContentPane());
        jInternalFrameConsultaCliente.getContentPane().setLayout(jInternalFrameConsultaClienteLayout);
        jInternalFrameConsultaClienteLayout.setHorizontalGroup(
            jInternalFrameConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        jInternalFrameConsultaClienteLayout.setVerticalGroup(
            jInternalFrameConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        jInternalFrameConsultaCliente.setLayout(new java.awt.BorderLayout());
        jInternalFrameConsultaCliente.add(consultaClienteJPanel);

        jDesktopPane.add(jInternalFrameConsultaCliente);
        jInternalFrameConsultaCliente.setBounds(570, 250, 563, 347);

        jInternalFrameConsultaCompra.setClosable(true);
        jInternalFrameConsultaCompra.setIconifiable(true);
        jInternalFrameConsultaCompra.setMaximizable(true);
        jInternalFrameConsultaCompra.setResizable(true);
        jInternalFrameConsultaCompra.setTitle("Consulta Compra");
        jInternalFrameConsultaCompra.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameConsultaCompraInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        javax.swing.GroupLayout jInternalFrameConsultaCompraLayout = new javax.swing.GroupLayout(jInternalFrameConsultaCompra.getContentPane());
        jInternalFrameConsultaCompra.getContentPane().setLayout(jInternalFrameConsultaCompraLayout);
        jInternalFrameConsultaCompraLayout.setHorizontalGroup(
            jInternalFrameConsultaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        jInternalFrameConsultaCompraLayout.setVerticalGroup(
            jInternalFrameConsultaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        jInternalFrameConsultaCompra.setLayout(new java.awt.BorderLayout());
        jInternalFrameConsultaCompra.add(consultaCompraJPanel);

        jDesktopPane.add(jInternalFrameConsultaCompra);
        jInternalFrameConsultaCompra.setBounds(570, 250, 563, 347);

        jInternalFrameConsultaFornecedor.setClosable(true);
        jInternalFrameConsultaFornecedor.setIconifiable(true);
        jInternalFrameConsultaFornecedor.setMaximizable(true);
        jInternalFrameConsultaFornecedor.setResizable(true);
        jInternalFrameConsultaFornecedor.setTitle("Consulta Fornecedor");
        jInternalFrameConsultaFornecedor.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameConsultaFornecedorInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        javax.swing.GroupLayout jInternalFrameConsultaFornecedorLayout = new javax.swing.GroupLayout(jInternalFrameConsultaFornecedor.getContentPane());
        jInternalFrameConsultaFornecedor.getContentPane().setLayout(jInternalFrameConsultaFornecedorLayout);
        jInternalFrameConsultaFornecedorLayout.setHorizontalGroup(
            jInternalFrameConsultaFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        jInternalFrameConsultaFornecedorLayout.setVerticalGroup(
            jInternalFrameConsultaFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        jInternalFrameConsultaFornecedor.setLayout(new java.awt.BorderLayout());
        jInternalFrameConsultaFornecedor.add(consultaFornecedorJPanel);

        jDesktopPane.add(jInternalFrameConsultaFornecedor);
        jInternalFrameConsultaFornecedor.setBounds(570, 250, 563, 347);

        jInternalFrameConsultaItensCompra.setClosable(true);
        jInternalFrameConsultaItensCompra.setIconifiable(true);
        jInternalFrameConsultaItensCompra.setMaximizable(true);
        jInternalFrameConsultaItensCompra.setResizable(true);
        jInternalFrameConsultaItensCompra.setTitle("Consulta ItensCompra");
        jInternalFrameConsultaItensCompra.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameConsultaItensCompraInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        javax.swing.GroupLayout jInternalFrameConsultaItensCompraLayout = new javax.swing.GroupLayout(jInternalFrameConsultaItensCompra.getContentPane());
        jInternalFrameConsultaItensCompra.getContentPane().setLayout(jInternalFrameConsultaItensCompraLayout);
        jInternalFrameConsultaItensCompraLayout.setHorizontalGroup(
            jInternalFrameConsultaItensCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        jInternalFrameConsultaItensCompraLayout.setVerticalGroup(
            jInternalFrameConsultaItensCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        jInternalFrameConsultaItensCompra.setLayout(new java.awt.BorderLayout());
        jInternalFrameConsultaItensCompra.add(consultaItensCompraJPanel);

        jDesktopPane.add(jInternalFrameConsultaItensCompra);
        jInternalFrameConsultaItensCompra.setBounds(570, 250, 563, 347);

        jInternalFrameConsultaItensVenda.setClosable(true);
        jInternalFrameConsultaItensVenda.setIconifiable(true);
        jInternalFrameConsultaItensVenda.setMaximizable(true);
        jInternalFrameConsultaItensVenda.setResizable(true);
        jInternalFrameConsultaItensVenda.setTitle("Consulta ItensVenda");
        jInternalFrameConsultaItensVenda.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameConsultaItensVendaInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        javax.swing.GroupLayout jInternalFrameConsultaItensVendaLayout = new javax.swing.GroupLayout(jInternalFrameConsultaItensVenda.getContentPane());
        jInternalFrameConsultaItensVenda.getContentPane().setLayout(jInternalFrameConsultaItensVendaLayout);
        jInternalFrameConsultaItensVendaLayout.setHorizontalGroup(
            jInternalFrameConsultaItensVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        jInternalFrameConsultaItensVendaLayout.setVerticalGroup(
            jInternalFrameConsultaItensVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        jInternalFrameConsultaItensVenda.setLayout(new java.awt.BorderLayout());
        jInternalFrameConsultaItensVenda.add(consultaItensVendaJPanel);

        jDesktopPane.add(jInternalFrameConsultaItensVenda);
        jInternalFrameConsultaItensVenda.setBounds(570, 250, 563, 347);

        jInternalFrameConsultaPessoa.setClosable(true);
        jInternalFrameConsultaPessoa.setIconifiable(true);
        jInternalFrameConsultaPessoa.setMaximizable(true);
        jInternalFrameConsultaPessoa.setResizable(true);
        jInternalFrameConsultaPessoa.setTitle("Consulta Pessoa");
        jInternalFrameConsultaPessoa.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameConsultaPessoaInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        javax.swing.GroupLayout jInternalFrameConsultaPessoaLayout = new javax.swing.GroupLayout(jInternalFrameConsultaPessoa.getContentPane());
        jInternalFrameConsultaPessoa.getContentPane().setLayout(jInternalFrameConsultaPessoaLayout);
        jInternalFrameConsultaPessoaLayout.setHorizontalGroup(
            jInternalFrameConsultaPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        jInternalFrameConsultaPessoaLayout.setVerticalGroup(
            jInternalFrameConsultaPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        jInternalFrameConsultaPessoa.setLayout(new java.awt.BorderLayout());
        jInternalFrameConsultaPessoa.add(consultaPessoaJPanel);

        jDesktopPane.add(jInternalFrameConsultaPessoa);
        jInternalFrameConsultaPessoa.setBounds(570, 250, 563, 347);

        jInternalFrameConsultaProduto.setClosable(true);
        jInternalFrameConsultaProduto.setIconifiable(true);
        jInternalFrameConsultaProduto.setMaximizable(true);
        jInternalFrameConsultaProduto.setResizable(true);
        jInternalFrameConsultaProduto.setTitle("Consulta Produto");
        jInternalFrameConsultaProduto.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameConsultaProdutoInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        javax.swing.GroupLayout jInternalFrameConsultaProdutoLayout = new javax.swing.GroupLayout(jInternalFrameConsultaProduto.getContentPane());
        jInternalFrameConsultaProduto.getContentPane().setLayout(jInternalFrameConsultaProdutoLayout);
        jInternalFrameConsultaProdutoLayout.setHorizontalGroup(
            jInternalFrameConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        jInternalFrameConsultaProdutoLayout.setVerticalGroup(
            jInternalFrameConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        jInternalFrameConsultaProduto.setLayout(new java.awt.BorderLayout());
        jInternalFrameConsultaProduto.add(consultaProdutoJPanel);

        jDesktopPane.add(jInternalFrameConsultaProduto);
        jInternalFrameConsultaProduto.setBounds(570, 250, 563, 347);

        jInternalFrameConsultaVenda.setClosable(true);
        jInternalFrameConsultaVenda.setIconifiable(true);
        jInternalFrameConsultaVenda.setMaximizable(true);
        jInternalFrameConsultaVenda.setResizable(true);
        jInternalFrameConsultaVenda.setTitle("Consulta Venda");
        jInternalFrameConsultaVenda.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrameConsultaVendaInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        javax.swing.GroupLayout jInternalFrameConsultaVendaLayout = new javax.swing.GroupLayout(jInternalFrameConsultaVenda.getContentPane());
        jInternalFrameConsultaVenda.getContentPane().setLayout(jInternalFrameConsultaVendaLayout);
        jInternalFrameConsultaVendaLayout.setHorizontalGroup(
            jInternalFrameConsultaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        jInternalFrameConsultaVendaLayout.setVerticalGroup(
            jInternalFrameConsultaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        jInternalFrameConsultaVenda.setLayout(new java.awt.BorderLayout());
        jInternalFrameConsultaVenda.add(consultaVendaJPanel);

        jDesktopPane.add(jInternalFrameConsultaVenda);
        jInternalFrameConsultaVenda.setBounds(570, 250, 563, 347);

        jMenuCadastro.setText("Cadastro");

        jMenuItemCadastroCategoria.setText("Cadastro Categoria");
        jMenuItemCadastroCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroCategoriaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroCategoria);

        jMenuItemCadastroCliente.setText("Cadastro Cliente");
        jMenuItemCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroCliente);

        jMenuItemCadastroFornecedor.setText("Cadastro Fornecedor");
        jMenuItemCadastroFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroFornecedorActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroFornecedor);

        jMenuItemCadastroPessoa.setText("Cadastro Pessoa");
        jMenuItemCadastroPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroPessoaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroPessoa);

        jMenuItemCadastroProduto.setText("Cadastro Produto");
        jMenuItemCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroProdutoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroProduto);

        jMenuBar.add(jMenuCadastro);

        jMenuConsulta.setText("Consulta");

        jMenuItemConsultaCategoria.setText("Consulta Categoria");
        jMenuItemConsultaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaCategoriaActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemConsultaCategoria);

        jMenuItemConsultaCliente.setText("Consulta Cliente");
        jMenuItemConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaClienteActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemConsultaCliente);

        jMenuItemConsultaFornecedor.setText("Consulta Fornecedor");
        jMenuItemConsultaFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaFornecedorActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemConsultaFornecedor);

        jMenuItemConsultaPessoa.setText("Consulta Pessoa");
        jMenuItemConsultaPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaPessoaActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemConsultaPessoa);

        jMenuItemConsultaProduto.setText("Consulta Produto");
        jMenuItemConsultaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaProdutoActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemConsultaProduto);

        jMenuBar.add(jMenuConsulta);

        jMenuCompraVenda.setText("Compra/Venda");

        jMenuItemCadastroItensCompra.setText("Cadastro ItensCompra");
        jMenuItemCadastroItensCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroItensCompraActionPerformed(evt);
            }
        });
        jMenuCompraVenda.add(jMenuItemCadastroItensCompra);

        jMenuItemCadastroItensVenda.setText("Cadastro ItensVenda");
        jMenuItemCadastroItensVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroItensVendaActionPerformed(evt);
            }
        });
        jMenuCompraVenda.add(jMenuItemCadastroItensVenda);

        jMenuItemCadastroVenda.setText("Cadastro Venda");
        jMenuItemCadastroVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroVendaActionPerformed(evt);
            }
        });
        jMenuCompraVenda.add(jMenuItemCadastroVenda);

        jMenuItemCadastroCompra.setText("Cadastro Compra");
        jMenuItemCadastroCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroCompraActionPerformed(evt);
            }
        });
        jMenuCompraVenda.add(jMenuItemCadastroCompra);

        jMenuItemConsultaCompra.setText("Consulta Compra");
        jMenuItemConsultaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaCompraActionPerformed(evt);
            }
        });
        jMenuCompraVenda.add(jMenuItemConsultaCompra);

        jMenuItemConsultaItensCompra.setText("Consulta ItensCompra");
        jMenuItemConsultaItensCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaItensCompraActionPerformed(evt);
            }
        });
        jMenuCompraVenda.add(jMenuItemConsultaItensCompra);

        jMenuItemConsultaItensVenda.setText("Consulta ItensVenda");
        jMenuItemConsultaItensVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaItensVendaActionPerformed(evt);
            }
        });
        jMenuCompraVenda.add(jMenuItemConsultaItensVenda);

        jMenuItemConsultaVenda.setText("Consulta Venda");
        jMenuItemConsultaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaVendaActionPerformed(evt);
            }
        });
        jMenuCompraVenda.add(jMenuItemConsultaVenda);

        jMenuBar.add(jMenuCompraVenda);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastroCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroCategoriaActionPerformed
        // TODO add your handling code here:
        exibeJInternalFrameCadastroCategoria();
    }//GEN-LAST:event_jMenuItemCadastroCategoriaActionPerformed

    private void jMenuItemConsultaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaCategoriaActionPerformed
        // TODO add your handling code here:
        exibeJInternalFrameConsultaCategoria();
    }//GEN-LAST:event_jMenuItemConsultaCategoriaActionPerformed

    private void jInternalFrameCadastroCategoriaInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameCadastroCategoriaInternalFrameClosed
        // TODO add your handling code here:
        cadastroCategoriaJPanel.restauraCampos(1);
    }//GEN-LAST:event_jInternalFrameCadastroCategoriaInternalFrameClosed

    private void jInternalFrameConsultaCategoriaInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameConsultaCategoriaInternalFrameClosed
        // TODO add your handling code here:
        consultaCategoriaJPanel.atualizaTabela(consultaCategoriaJPanel.criaConsulta(""));
    }//GEN-LAST:event_jInternalFrameConsultaCategoriaInternalFrameClosed

    private void jMenuItemCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroClienteActionPerformed
        // TODO add your handling code here:
        exibeJInternalFrameCadastroCliente();
    }//GEN-LAST:event_jMenuItemCadastroClienteActionPerformed

    private void jMenuItemConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaClienteActionPerformed
        // TODO add your handling code here:
        exibeJInternalFrameConsultaCliente();
    }//GEN-LAST:event_jMenuItemConsultaClienteActionPerformed

    private void jInternalFrameCadastroClienteInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameCadastroClienteInternalFrameClosed
        // TODO add your handling code here:
        cadastroClienteJPanel.restauraCampos(1);
    }//GEN-LAST:event_jInternalFrameCadastroClienteInternalFrameClosed

    private void jInternalFrameConsultaClienteInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameConsultaClienteInternalFrameClosed
        // TODO add your handling code here:
        consultaClienteJPanel.atualizaTabela(consultaClienteJPanel.criaConsulta(""));
    }//GEN-LAST:event_jInternalFrameConsultaClienteInternalFrameClosed

    private void jMenuItemCadastroCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroCompraActionPerformed
        // TODO add your handling code here:
        exibeJInternalFrameCadastroCompra();
    }//GEN-LAST:event_jMenuItemCadastroCompraActionPerformed

    private void jMenuItemConsultaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaCompraActionPerformed
        // TODO add your handling code here:
        exibeJInternalFrameConsultaCompra();
    }//GEN-LAST:event_jMenuItemConsultaCompraActionPerformed

    private void jInternalFrameCadastroCompraInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameCadastroCompraInternalFrameClosed
        // TODO add your handling code here:
        cadastroCompraJPanel.restauraCampos(1);
    }//GEN-LAST:event_jInternalFrameCadastroCompraInternalFrameClosed

    private void jInternalFrameConsultaCompraInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameConsultaCompraInternalFrameClosed
        // TODO add your handling code here:
        consultaCompraJPanel.atualizaTabela(consultaCompraJPanel.criaConsulta(""));
    }//GEN-LAST:event_jInternalFrameConsultaCompraInternalFrameClosed

    private void jMenuItemCadastroFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroFornecedorActionPerformed
        // TODO add your handling code here:
        exibeJInternalFrameCadastroFornecedor();
    }//GEN-LAST:event_jMenuItemCadastroFornecedorActionPerformed

    private void jMenuItemConsultaFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaFornecedorActionPerformed
        // TODO add your handling code here:
        exibeJInternalFrameConsultaFornecedor();
    }//GEN-LAST:event_jMenuItemConsultaFornecedorActionPerformed

    private void jInternalFrameCadastroFornecedorInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameCadastroFornecedorInternalFrameClosed
        // TODO add your handling code here:
        cadastroFornecedorJPanel.restauraCampos(1);
    }//GEN-LAST:event_jInternalFrameCadastroFornecedorInternalFrameClosed

    private void jInternalFrameConsultaFornecedorInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameConsultaFornecedorInternalFrameClosed
        // TODO add your handling code here:
        consultaFornecedorJPanel.atualizaTabela(consultaFornecedorJPanel.criaConsulta(""));
    }//GEN-LAST:event_jInternalFrameConsultaFornecedorInternalFrameClosed

    private void jMenuItemCadastroItensCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroItensCompraActionPerformed
        // TODO add your handling code here:
        exibeJInternalFrameCadastroItensCompra();
    }//GEN-LAST:event_jMenuItemCadastroItensCompraActionPerformed

    private void jMenuItemConsultaItensCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaItensCompraActionPerformed
        // TODO add your handling code here:
        exibeJInternalFrameConsultaItensCompra();
    }//GEN-LAST:event_jMenuItemConsultaItensCompraActionPerformed

    private void jInternalFrameCadastroItensCompraInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameCadastroItensCompraInternalFrameClosed
        // TODO add your handling code here:
        cadastroItensCompraJPanel.restauraCampos(1);
    }//GEN-LAST:event_jInternalFrameCadastroItensCompraInternalFrameClosed

    private void jInternalFrameConsultaItensCompraInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameConsultaItensCompraInternalFrameClosed
        // TODO add your handling code here:
        consultaItensCompraJPanel.atualizaTabela(consultaItensCompraJPanel.criaConsulta(""));
    }//GEN-LAST:event_jInternalFrameConsultaItensCompraInternalFrameClosed

    private void jMenuItemCadastroItensVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroItensVendaActionPerformed
        // TODO add your handling code here:
        exibeJInternalFrameCadastroItensVenda();
    }//GEN-LAST:event_jMenuItemCadastroItensVendaActionPerformed

    private void jMenuItemConsultaItensVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaItensVendaActionPerformed
        // TODO add your handling code here:
        exibeJInternalFrameConsultaItensVenda();
    }//GEN-LAST:event_jMenuItemConsultaItensVendaActionPerformed

    private void jInternalFrameCadastroItensVendaInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameCadastroItensVendaInternalFrameClosed
        // TODO add your handling code here:
        cadastroItensVendaJPanel.restauraCampos(1);
    }//GEN-LAST:event_jInternalFrameCadastroItensVendaInternalFrameClosed

    private void jInternalFrameConsultaItensVendaInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameConsultaItensVendaInternalFrameClosed
        // TODO add your handling code here:
        consultaItensVendaJPanel.atualizaTabela(consultaItensVendaJPanel.criaConsulta(""));
    }//GEN-LAST:event_jInternalFrameConsultaItensVendaInternalFrameClosed

    private void jMenuItemCadastroPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroPessoaActionPerformed
        // TODO add your handling code here:
        exibeJInternalFrameCadastroPessoa();
    }//GEN-LAST:event_jMenuItemCadastroPessoaActionPerformed

    private void jMenuItemConsultaPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaPessoaActionPerformed
        // TODO add your handling code here:
        exibeJInternalFrameConsultaPessoa();
    }//GEN-LAST:event_jMenuItemConsultaPessoaActionPerformed

    private void jInternalFrameCadastroPessoaInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameCadastroPessoaInternalFrameClosed
        // TODO add your handling code here:
        cadastroPessoaJPanel.restauraCampos(1);
    }//GEN-LAST:event_jInternalFrameCadastroPessoaInternalFrameClosed

    private void jInternalFrameConsultaPessoaInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameConsultaPessoaInternalFrameClosed
        // TODO add your handling code here:
        consultaPessoaJPanel.atualizaTabela(consultaPessoaJPanel.criaConsulta(""));
    }//GEN-LAST:event_jInternalFrameConsultaPessoaInternalFrameClosed

    private void jMenuItemCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroProdutoActionPerformed
        // TODO add your handling code here:
        exibeJInternalFrameCadastroProduto();
    }//GEN-LAST:event_jMenuItemCadastroProdutoActionPerformed

    private void jMenuItemConsultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaProdutoActionPerformed
        // TODO add your handling code here:
        exibeJInternalFrameConsultaProduto();
    }//GEN-LAST:event_jMenuItemConsultaProdutoActionPerformed

    private void jInternalFrameCadastroProdutoInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameCadastroProdutoInternalFrameClosed
        // TODO add your handling code here:
        cadastroProdutoJPanel.restauraCampos(1);
    }//GEN-LAST:event_jInternalFrameCadastroProdutoInternalFrameClosed

    private void jInternalFrameConsultaProdutoInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameConsultaProdutoInternalFrameClosed
        // TODO add your handling code here:
        consultaProdutoJPanel.atualizaTabela(consultaProdutoJPanel.criaConsulta(""));
    }//GEN-LAST:event_jInternalFrameConsultaProdutoInternalFrameClosed

    private void jMenuItemCadastroVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroVendaActionPerformed
        // TODO add your handling code here:
        exibeJInternalFrameCadastroVenda();
    }//GEN-LAST:event_jMenuItemCadastroVendaActionPerformed

    private void jMenuItemConsultaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaVendaActionPerformed
        // TODO add your handling code here:
        exibeJInternalFrameConsultaVenda();
    }//GEN-LAST:event_jMenuItemConsultaVendaActionPerformed

    private void jInternalFrameCadastroVendaInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameCadastroVendaInternalFrameClosed
        // TODO add your handling code here:
        cadastroVendaJPanel.restauraCampos(1);
    }//GEN-LAST:event_jInternalFrameCadastroVendaInternalFrameClosed

    private void jInternalFrameConsultaVendaInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrameConsultaVendaInternalFrameClosed
        // TODO add your handling code here:
        consultaVendaJPanel.atualizaTabela(consultaVendaJPanel.criaConsulta(""));
    }//GEN-LAST:event_jInternalFrameConsultaVendaInternalFrameClosed

    public void exibeJInternalFrameCadastroCategoria() {
        jInternalFrameCadastroCategoria.setVisible(true); // mostra o quadro interno
        jInternalFrameCadastroCategoria.pack();

        if (!jDesktopPane.isAncestorOf(jInternalFrameCadastroCategoria)) {
            jDesktopPane.add(jInternalFrameCadastroCategoria); // anexa o quadro interno
        }

        // reposiciona a janela quando o botao de fechar estiver fora do frame
        if (jInternalFrameCadastroCategoria.getY() < 0 || jInternalFrameCadastroCategoria.getX()
                > (this.getContentPane().getWidth() - 50) || (jInternalFrameCadastroCategoria.getX()
                < -(jInternalFrameCadastroCategoria.getWidth() - 50))) {
            jInternalFrameCadastroCategoria.setLocation(0, 0);
        }

        jDesktopPane.moveToFront(jInternalFrameCadastroCategoria); // traz a janela para frente
    }

    public void exibeJInternalFrameCadastroCliente() {
        jInternalFrameCadastroCliente.setVisible(true); // mostra o quadro interno
        jInternalFrameCadastroCliente.pack();

        if (!jDesktopPane.isAncestorOf(jInternalFrameCadastroCliente)) {
            jDesktopPane.add(jInternalFrameCadastroCliente); // anexa o quadro interno
        }

        // reposiciona a janela quando o botao de fechar estiver fora do frame
        if (jInternalFrameCadastroCliente.getY() < 0 || jInternalFrameCadastroCliente.getX()
                > (this.getContentPane().getWidth() - 50) || (jInternalFrameCadastroCliente.getX()
                < -(jInternalFrameCadastroCliente.getWidth() - 50))) {
            jInternalFrameCadastroCliente.setLocation(0, 0);
        }

        jDesktopPane.moveToFront(jInternalFrameCadastroCliente); // traz a janela para frente
    }

    public void exibeJInternalFrameCadastroCompra() {
        jInternalFrameCadastroCompra.setVisible(true); // mostra o quadro interno
        jInternalFrameCadastroCompra.pack();

        if (!jDesktopPane.isAncestorOf(jInternalFrameCadastroCompra)) {
            jDesktopPane.add(jInternalFrameCadastroCompra); // anexa o quadro interno
        }

        // reposiciona a janela quando o botao de fechar estiver fora do frame
        if (jInternalFrameCadastroCompra.getY() < 0 || jInternalFrameCadastroCompra.getX()
                > (this.getContentPane().getWidth() - 50) || (jInternalFrameCadastroCompra.getX()
                < -(jInternalFrameCadastroCompra.getWidth() - 50))) {
            jInternalFrameCadastroCompra.setLocation(0, 0);
        }

        jDesktopPane.moveToFront(jInternalFrameCadastroCompra); // traz a janela para frente
    }

    public void exibeJInternalFrameCadastroFornecedor() {
        jInternalFrameCadastroFornecedor.setVisible(true); // mostra o quadro interno
        jInternalFrameCadastroFornecedor.pack();

        if (!jDesktopPane.isAncestorOf(jInternalFrameCadastroFornecedor)) {
            jDesktopPane.add(jInternalFrameCadastroFornecedor); // anexa o quadro interno
        }

        // reposiciona a janela quando o botao de fechar estiver fora do frame
        if (jInternalFrameCadastroFornecedor.getY() < 0 || jInternalFrameCadastroFornecedor.getX()
                > (this.getContentPane().getWidth() - 50) || (jInternalFrameCadastroFornecedor.getX()
                < -(jInternalFrameCadastroFornecedor.getWidth() - 50))) {
            jInternalFrameCadastroFornecedor.setLocation(0, 0);
        }

        jDesktopPane.moveToFront(jInternalFrameCadastroFornecedor); // traz a janela para frente
    }

    public void exibeJInternalFrameCadastroItensCompra() {
        jInternalFrameCadastroItensCompra.setVisible(true); // mostra o quadro interno
        jInternalFrameCadastroItensCompra.pack();

        if (!jDesktopPane.isAncestorOf(jInternalFrameCadastroItensCompra)) {
            jDesktopPane.add(jInternalFrameCadastroItensCompra); // anexa o quadro interno
        }

        // reposiciona a janela quando o botao de fechar estiver fora do frame
        if (jInternalFrameCadastroItensCompra.getY() < 0 || jInternalFrameCadastroItensCompra.getX()
                > (this.getContentPane().getWidth() - 50) || (jInternalFrameCadastroItensCompra.getX()
                < -(jInternalFrameCadastroItensCompra.getWidth() - 50))) {
            jInternalFrameCadastroItensCompra.setLocation(0, 0);
        }

        jDesktopPane.moveToFront(jInternalFrameCadastroItensCompra); // traz a janela para frente
    }

    public void exibeJInternalFrameCadastroItensVenda() {
        jInternalFrameCadastroItensVenda.setVisible(true); // mostra o quadro interno
        jInternalFrameCadastroItensVenda.pack();

        if (!jDesktopPane.isAncestorOf(jInternalFrameCadastroItensVenda)) {
            jDesktopPane.add(jInternalFrameCadastroItensVenda); // anexa o quadro interno
        }

        // reposiciona a janela quando o botao de fechar estiver fora do frame
        if (jInternalFrameCadastroItensVenda.getY() < 0 || jInternalFrameCadastroItensVenda.getX()
                > (this.getContentPane().getWidth() - 50) || (jInternalFrameCadastroItensVenda.getX()
                < -(jInternalFrameCadastroItensVenda.getWidth() - 50))) {
            jInternalFrameCadastroItensVenda.setLocation(0, 0);
        }

        jDesktopPane.moveToFront(jInternalFrameCadastroItensVenda); // traz a janela para frente
    }

    public void exibeJInternalFrameCadastroPessoa() {
        jInternalFrameCadastroPessoa.setVisible(true); // mostra o quadro interno
        jInternalFrameCadastroPessoa.pack();

        if (!jDesktopPane.isAncestorOf(jInternalFrameCadastroPessoa)) {
            jDesktopPane.add(jInternalFrameCadastroPessoa); // anexa o quadro interno
        }

        // reposiciona a janela quando o botao de fechar estiver fora do frame
        if (jInternalFrameCadastroPessoa.getY() < 0 || jInternalFrameCadastroPessoa.getX()
                > (this.getContentPane().getWidth() - 50) || (jInternalFrameCadastroPessoa.getX()
                < -(jInternalFrameCadastroPessoa.getWidth() - 50))) {
            jInternalFrameCadastroPessoa.setLocation(0, 0);
        }

        jDesktopPane.moveToFront(jInternalFrameCadastroPessoa); // traz a janela para frente
    }

    public void exibeJInternalFrameCadastroProduto() {
        jInternalFrameCadastroProduto.setVisible(true); // mostra o quadro interno
        jInternalFrameCadastroProduto.pack();

        if (!jDesktopPane.isAncestorOf(jInternalFrameCadastroProduto)) {
            jDesktopPane.add(jInternalFrameCadastroProduto); // anexa o quadro interno
        }

        // reposiciona a janela quando o botao de fechar estiver fora do frame
        if (jInternalFrameCadastroProduto.getY() < 0 || jInternalFrameCadastroProduto.getX()
                > (this.getContentPane().getWidth() - 50) || (jInternalFrameCadastroProduto.getX()
                < -(jInternalFrameCadastroProduto.getWidth() - 50))) {
            jInternalFrameCadastroProduto.setLocation(0, 0);
        }

        jDesktopPane.moveToFront(jInternalFrameCadastroProduto); // traz a janela para frente
    }

    public void exibeJInternalFrameCadastroVenda() {
        jInternalFrameCadastroVenda.setVisible(true); // mostra o quadro interno
        jInternalFrameCadastroVenda.pack();

        if (!jDesktopPane.isAncestorOf(jInternalFrameCadastroVenda)) {
            jDesktopPane.add(jInternalFrameCadastroVenda); // anexa o quadro interno
        }

        // reposiciona a janela quando o botao de fechar estiver fora do frame
        if (jInternalFrameCadastroVenda.getY() < 0 || jInternalFrameCadastroVenda.getX()
                > (this.getContentPane().getWidth() - 50) || (jInternalFrameCadastroVenda.getX()
                < -(jInternalFrameCadastroVenda.getWidth() - 50))) {
            jInternalFrameCadastroVenda.setLocation(0, 0);
        }

        jDesktopPane.moveToFront(jInternalFrameCadastroVenda); // traz a janela para frente
    }

    public void exibeJInternalFrameConsultaCategoria() {
        consultaCategoriaJPanel.atualizaTabela(consultaCategoriaJPanel.criaConsulta(""));

        jInternalFrameConsultaCategoria.setVisible(true); // mostra o quadro interno
        jInternalFrameConsultaCategoria.pack();

        if (!jDesktopPane.isAncestorOf(jInternalFrameConsultaCategoria)) {
            jDesktopPane.add(jInternalFrameConsultaCategoria); // anexa o quadro interno
        }

        // reposiciona a janela quando o botao de fechar estiver fora do frame
        if (jInternalFrameConsultaCategoria.getY() < 0 || jInternalFrameConsultaCategoria.getX()
                > (this.getContentPane().getWidth() - 50) || (jInternalFrameConsultaCategoria.getX()
                < -(jInternalFrameConsultaCategoria.getWidth() - 50))) {
            jInternalFrameConsultaCategoria.setLocation(this.getContentPane().getWidth() - jInternalFrameConsultaCategoria.getWidth(), 0);
        }

        jDesktopPane.moveToFront(jInternalFrameConsultaCategoria); // traz a janela para frente
    }

    public void exibeJInternalFrameConsultaCliente() {
        consultaClienteJPanel.atualizaTabela(consultaClienteJPanel.criaConsulta(""));

        jInternalFrameConsultaCliente.setVisible(true); // mostra o quadro interno
        jInternalFrameConsultaCliente.pack();

        if (!jDesktopPane.isAncestorOf(jInternalFrameConsultaCliente)) {
            jDesktopPane.add(jInternalFrameConsultaCliente); // anexa o quadro interno
        }

        // reposiciona a janela quando o botao de fechar estiver fora do frame
        if (jInternalFrameConsultaCliente.getY() < 0 || jInternalFrameConsultaCliente.getX()
                > (this.getContentPane().getWidth() - 50) || (jInternalFrameConsultaCliente.getX()
                < -(jInternalFrameConsultaCliente.getWidth() - 50))) {
            jInternalFrameConsultaCliente.setLocation(this.getContentPane().getWidth() - jInternalFrameConsultaCliente.getWidth(), 0);
        }

        jDesktopPane.moveToFront(jInternalFrameConsultaCliente); // traz a janela para frente
    }

    public void exibeJInternalFrameConsultaCompra() {
        consultaCompraJPanel.atualizaTabela(consultaCompraJPanel.criaConsulta(""));

        jInternalFrameConsultaCompra.setVisible(true); // mostra o quadro interno
        jInternalFrameConsultaCompra.pack();

        if (!jDesktopPane.isAncestorOf(jInternalFrameConsultaCompra)) {
            jDesktopPane.add(jInternalFrameConsultaCompra); // anexa o quadro interno
        }

        // reposiciona a janela quando o botao de fechar estiver fora do frame
        if (jInternalFrameConsultaCompra.getY() < 0 || jInternalFrameConsultaCompra.getX()
                > (this.getContentPane().getWidth() - 50) || (jInternalFrameConsultaCompra.getX()
                < -(jInternalFrameConsultaCompra.getWidth() - 50))) {
            jInternalFrameConsultaCompra.setLocation(this.getContentPane().getWidth() - jInternalFrameConsultaCompra.getWidth(), 0);
        }

        jDesktopPane.moveToFront(jInternalFrameConsultaCompra); // traz a janela para frente
    }

    public void exibeJInternalFrameConsultaFornecedor() {
        consultaFornecedorJPanel.atualizaTabela(consultaFornecedorJPanel.criaConsulta(""));

        jInternalFrameConsultaFornecedor.setVisible(true); // mostra o quadro interno
        jInternalFrameConsultaFornecedor.pack();

        if (!jDesktopPane.isAncestorOf(jInternalFrameConsultaFornecedor)) {
            jDesktopPane.add(jInternalFrameConsultaFornecedor); // anexa o quadro interno
        }

        // reposiciona a janela quando o botao de fechar estiver fora do frame
        if (jInternalFrameConsultaFornecedor.getY() < 0 || jInternalFrameConsultaFornecedor.getX()
                > (this.getContentPane().getWidth() - 50) || (jInternalFrameConsultaFornecedor.getX()
                < -(jInternalFrameConsultaFornecedor.getWidth() - 50))) {
            jInternalFrameConsultaFornecedor.setLocation(this.getContentPane().getWidth() - jInternalFrameConsultaFornecedor.getWidth(), 0);
        }

        jDesktopPane.moveToFront(jInternalFrameConsultaFornecedor); // traz a janela para frente
    }

    public void exibeJInternalFrameConsultaItensCompra() {
        consultaItensCompraJPanel.atualizaTabela(consultaItensCompraJPanel.criaConsulta(""));

        jInternalFrameConsultaItensCompra.setVisible(true); // mostra o quadro interno
        jInternalFrameConsultaItensCompra.pack();

        if (!jDesktopPane.isAncestorOf(jInternalFrameConsultaItensCompra)) {
            jDesktopPane.add(jInternalFrameConsultaItensCompra); // anexa o quadro interno
        }

        // reposiciona a janela quando o botao de fechar estiver fora do frame
        if (jInternalFrameConsultaItensCompra.getY() < 0 || jInternalFrameConsultaItensCompra.getX()
                > (this.getContentPane().getWidth() - 50) || (jInternalFrameConsultaItensCompra.getX()
                < -(jInternalFrameConsultaItensCompra.getWidth() - 50))) {
            jInternalFrameConsultaItensCompra.setLocation(this.getContentPane().getWidth() - jInternalFrameConsultaItensCompra.getWidth(), 0);
        }

        jDesktopPane.moveToFront(jInternalFrameConsultaItensCompra); // traz a janela para frente
    }

    public void exibeJInternalFrameConsultaItensVenda() {
        consultaItensVendaJPanel.atualizaTabela(consultaItensVendaJPanel.criaConsulta(""));

        jInternalFrameConsultaItensVenda.setVisible(true); // mostra o quadro interno
        jInternalFrameConsultaItensVenda.pack();

        if (!jDesktopPane.isAncestorOf(jInternalFrameConsultaItensVenda)) {
            jDesktopPane.add(jInternalFrameConsultaItensVenda); // anexa o quadro interno
        }

        // reposiciona a janela quando o botao de fechar estiver fora do frame
        if (jInternalFrameConsultaItensVenda.getY() < 0 || jInternalFrameConsultaItensVenda.getX()
                > (this.getContentPane().getWidth() - 50) || (jInternalFrameConsultaItensVenda.getX()
                < -(jInternalFrameConsultaItensVenda.getWidth() - 50))) {
            jInternalFrameConsultaItensVenda.setLocation(this.getContentPane().getWidth() - jInternalFrameConsultaItensVenda.getWidth(), 0);
        }

        jDesktopPane.moveToFront(jInternalFrameConsultaItensVenda); // traz a janela para frente
    }

    public void exibeJInternalFrameConsultaPessoa() {
        consultaPessoaJPanel.atualizaTabela(consultaPessoaJPanel.criaConsulta(""));

        jInternalFrameConsultaPessoa.setVisible(true); // mostra o quadro interno
        jInternalFrameConsultaPessoa.pack();

        if (!jDesktopPane.isAncestorOf(jInternalFrameConsultaPessoa)) {
            jDesktopPane.add(jInternalFrameConsultaPessoa); // anexa o quadro interno
        }

        // reposiciona a janela quando o botao de fechar estiver fora do frame
        if (jInternalFrameConsultaPessoa.getY() < 0 || jInternalFrameConsultaPessoa.getX()
                > (this.getContentPane().getWidth() - 50) || (jInternalFrameConsultaPessoa.getX()
                < -(jInternalFrameConsultaPessoa.getWidth() - 50))) {
            jInternalFrameConsultaPessoa.setLocation(this.getContentPane().getWidth() - jInternalFrameConsultaPessoa.getWidth(), 0);
        }

        jDesktopPane.moveToFront(jInternalFrameConsultaPessoa); // traz a janela para frente
    }

    public void exibeJInternalFrameConsultaProduto() {
        consultaProdutoJPanel.atualizaTabela(consultaProdutoJPanel.criaConsulta(""));

        jInternalFrameConsultaProduto.setVisible(true); // mostra o quadro interno
        jInternalFrameConsultaProduto.pack();

        if (!jDesktopPane.isAncestorOf(jInternalFrameConsultaProduto)) {
            jDesktopPane.add(jInternalFrameConsultaProduto); // anexa o quadro interno
        }

        // reposiciona a janela quando o botao de fechar estiver fora do frame
        if (jInternalFrameConsultaProduto.getY() < 0 || jInternalFrameConsultaProduto.getX()
                > (this.getContentPane().getWidth() - 50) || (jInternalFrameConsultaProduto.getX()
                < -(jInternalFrameConsultaProduto.getWidth() - 50))) {
            jInternalFrameConsultaProduto.setLocation(this.getContentPane().getWidth() - jInternalFrameConsultaProduto.getWidth(), 0);
        }

        jDesktopPane.moveToFront(jInternalFrameConsultaProduto); // traz a janela para frente
    }

    public void exibeJInternalFrameConsultaVenda() {
        consultaVendaJPanel.atualizaTabela(consultaVendaJPanel.criaConsulta(""));

        jInternalFrameConsultaVenda.setVisible(true); // mostra o quadro interno
        jInternalFrameConsultaVenda.pack();

        if (!jDesktopPane.isAncestorOf(jInternalFrameConsultaVenda)) {
            jDesktopPane.add(jInternalFrameConsultaVenda); // anexa o quadro interno
        }

        // reposiciona a janela quando o botao de fechar estiver fora do frame
        if (jInternalFrameConsultaVenda.getY() < 0 || jInternalFrameConsultaVenda.getX()
                > (this.getContentPane().getWidth() - 50) || (jInternalFrameConsultaVenda.getX()
                < -(jInternalFrameConsultaVenda.getWidth() - 50))) {
            jInternalFrameConsultaVenda.setLocation(this.getContentPane().getWidth() - jInternalFrameConsultaVenda.getWidth(), 0);
        }

        jDesktopPane.moveToFront(jInternalFrameConsultaVenda); // traz a janela para frente
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                NovoPrograma1Teste app = null;

                try {
                    // seta o Look and Feel
                    UIManager.setLookAndFeel("com.jtattoo.plaf.pampa.PampaLookAndFeel");

                    // inicia o aplicativo
                    app = new NovoPrograma1Teste();
                } catch (Exception ex) {
                    ex.printStackTrace();

                    JOptionPane.showMessageDialog(app,
                            "Ocorreu um erro ao abrir o aplicativo.\n"
                            + "Exception: " + ex.getMessage(),
                            "Erro ao abrir aplicativo",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
} // fim da classe NovoPrograma1Teste
