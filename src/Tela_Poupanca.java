import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela_Poupanca extends JFrame {
    private JTextField txtValordepositar;
    private JButton txtConfirmar2;
    private JButton txtAnteriorMenu3;
    private JLabel txtCentralBank7;
    private JLabel txtNumeroAgencia4;
    private JLabel txtNumeroConta4;
    private JLabel txtAjuda4;
    private JLabel txtComunidade4;
    private JLabel txtSuporte4;
    private JLabel txtPoupanca;
    private JLabel txtSeuSlado4;
    private JLabel txtDinheiro4;
    private JLabel txtMensassemPoupanca;
    private JTextField txtDigiteSuaSenha2;
    private JPanel pnlPoupanca;

    public Tela_Poupanca() {
    iniciarComponentes();
    txtAnteriorMenu3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    txtConfirmar2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}
    public void iniciarComponentes() {
        setTitle("Poupança...");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlPoupanca);
        setVisible(true);
    }
}
