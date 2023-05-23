import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela_Comprovante extends JFrame {
    private JButton txtAnteriorMenu7;
    private JLabel txtCentralBank10;
    private JLabel txtNumeroAgencia8;
    private JLabel txtNumeroConta8;
    private JLabel txtAjuda8;
    private JLabel txtComunidade8;
    private JLabel txtSuporte8;
    private JLabel txtComrpovante_Transferencia;
    private JPanel pnlComprov;

    public Tela_Comprovante() {
        iniciarComponentes();
    txtAnteriorMenu7.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}
    public void iniciarComponentes() {
        setTitle("Emitindo comprovante...");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlComprov);
        setVisible(true);
    }
}
