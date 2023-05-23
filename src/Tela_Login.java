import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela_Login extends JFrame {
    private JTextField txtCPF;
    private JTextField txtSenha;
    private JLabel txtCentralBank3;
    private JLabel txtJaTemUmaConta;
    private JButton btnConfirmar;
    private JPanel pnlLogin;

    public Tela_Login() {
    iniciarComponentes();
    criarListeners();

}

    public void iniciarComponentes() {
    setTitle("Tela de login");
    setSize(600,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(pnlLogin);
    setVisible(true);
    }

    public void criarListeners() {

        btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    Tela_Menu tela_menu = new Tela_Menu();
            }
        });
    }
    public void validarLogin() {
        String cpf = txtCPF.getText();
        String senha = txtSenha.getText();


    }
}
