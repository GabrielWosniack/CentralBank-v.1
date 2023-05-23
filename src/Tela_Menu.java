import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela_Menu extends JFrame {
    private JButton btnPoupanca;
    private JButton btnReceber;
    private JButton btnTransferir;
    private JButton btnAnteriorTelaPrinciapl;
    private JLabel txtCentralBank4;
    private JLabel txtMenu;
    private JLabel txtSeuSaldo1;
    private JLabel txtDinheiro1;
    private JLabel txtNumeroAgencia1;
    private JLabel txtNumeroConta1;
    private JLabel txtAjuda1;
    private JLabel txtComunidade1;
    private JLabel txtSuporte1;
    private JPanel pnlMenu;
    public Tela_Menu() {
        iniciarComponentes();

            btnTransferir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
            btnReceber.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Tela_Saque telaSaque = new Tela_Saque();

                }
            });
            btnPoupanca.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
            btnAnteriorTelaPrinciapl.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Tela_Login tela_login = new Tela_Login();

                }

            });
        }
    public void iniciarComponentes() {
        setTitle("Menu de opções...");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlMenu);
        setVisible(true);
    }
}


            
