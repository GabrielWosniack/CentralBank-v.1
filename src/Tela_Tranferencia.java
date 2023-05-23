import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela_Tranferencia extends JFrame {
    private JTextField txtCPFDestinatario;
    private JTextField txtDigiteSuaSenha1;
    private JTextField txtValorSerTransferido;
    private JButton txtAnteriorMenu1;
    private JButton txtConfirmar1;
    private JLabel txtCentralBank5;
    private JLabel txtTransferencia;
    private JLabel txtSeuSlado2;
    private JLabel txtDinheiro2;
    private JLabel txtNumeroAgencia2;
    private JLabel txtNumeroConta2;
    private JLabel txtAjuda2;
    private JLabel txtComunidade2;
    private JLabel txtSuporte2;
    private JPanel pnlTransf;

    public Tela_Tranferencia() {
    iniciarComponentes();

    txtAnteriorMenu1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {Tela_Menu tela_menu = new Tela_Menu();

        }
    });
    txtConfirmar1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {Tela_Comprovante telaComprovante = new Tela_Comprovante();

        }

    public void dadosBeneficiario () {
            String cpf = txtCPFDestinatario.getText();
            String valor = txtValorSerTransferido.getText();
            String senha = txtDigiteSuaSenha1.getText();
    }
    });
}

    public void iniciarComponentes() {
        setTitle("Efetuando transferência...");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlTransf);
        setVisible(true);
}}
