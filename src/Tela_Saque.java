import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Tela_Saque extends JFrame {
    private JTextField txtValorSacar;
    private JTextField txtDigiteSuaSenha2;
    private JButton txtConfirmar2;
    private JButton txtAnteriorMenu2;
    private JLabel txtCentralBank6;
    private JLabel txtNumeroAgencia3;
    private JLabel txtNumeroConta3;
    private JLabel txtAjuda3;
    private JLabel txtComunidade3;
    private JLabel txtSuporte3;
    private JLabel txtSaque;
    private JLabel txtSeuSlado3;
    private JLabel txtDinheiro3;
    private JPanel pnlSaque;

    public Tela_Saque() {
    iniciarComponentes();
    txtConfirmar2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    txtAnteriorMenu2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {Tela_Menu tela_menu = new Tela_Menu();

        }
    });
}
    public void iniciarComponentes() {
        setTitle("Saque...");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlSaque);
        setVisible(true);
    }

    public void valorSaque() {
        String valorSaque = txtValorSacar.getText();
        String senha = txtDigiteSuaSenha2.getText();


        }


    }

