import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela_Solicitar_Cobranca extends JFrame {
    private JLabel txtCentralBank8;
    private JLabel txtNumeroAgencia6;
    private JLabel txtNumeroConta6;
    private JLabel txtAjuda6;
    private JLabel txtComunidade6;
    private JLabel txtSuporte6;
    private JLabel txtSolicitaçãoDestinatario;
    private JLabel txtNomeDestinatario;
    private JLabel txtCPFDestinatario;
    private JLabel txtValor_Solicitado;
    private JLabel txtAguardandoConfirmacao;
    private JButton txtAnteriorMenu5;
    private JPanel pnlCobranca;

    public Tela_Solicitar_Cobranca() {
    iniciarComponentes();
    txtAnteriorMenu5.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {Tela_Menu tela_menu = new Tela_Menu();
        }
    });
}
    public void iniciarComponentes() {
        setTitle("Emitindo solicitação de cobrança...");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlCobranca);
        setVisible(true);
    }
}
