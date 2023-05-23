import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Tela_Cadastro extends JFrame {
    private JLabel txtCentralBank;
    private JPanel txtCentralBank2;
    private JLabel txtCadastreSeAgora;
    private JTextField txtNomeCompleto;
    private JTextField txtCPF;
    private JTextField txtSenha;
    private JTextField txtEndereco;
    private JTextField txtProfissao;
    private JTextField txtRenda;
    private JButton btnConfirmar;

    final String URL = "jbdc:mysql://localhost:3006/cadbanco";
    final String USER = "root";
    final String PASSWORD = "root99";
    final String CONFIRMAR = "INSERT INTO usuario (nome, cpf, senha, endereco, profissao, renda) VALUES (?,?,?,?,?,?)";

    public Tela_Cadastro() {
        iniciarComponentes();
        Conecta();
    }

    public void iniciarComponentes() {
        setTitle("Cadastro de Usuário");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(txtCentralBank2);
        setVisible(true);

    }

    public void Conecta() {

        try {
            Class.forName("com.mysql.jdcb.Driver");
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado!");

            final PreparedStatement stmtConfirmar;

            stmtConfirmar = connection.prepareStatement(CONFIRMAR);


            btnConfirmar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nome = txtNomeCompleto.getText();
                    String cpfstr = txtCPF.getText();
                    String senha = txtSenha.getText();
                    String endereco = txtEndereco.getText();
                    String profissao = txtProfissao.getText();
                    String renda = txtRenda.getText();

                    try {
                        int cpf = Integer.parseInt(cpfstr);
                        stmtConfirmar.setString(1, nome);
                        stmtConfirmar.setInt(2, cpf);
                        stmtConfirmar.setString(3, senha);
                        stmtConfirmar.setString(4, endereco);
                        stmtConfirmar.setString(5, profissao);
                        stmtConfirmar.setString(6, renda);
                        stmtConfirmar.executeUpdate();
                        System.out.println("Dados inseridos!");
                        JOptionPane.showMessageDialog(btnConfirmar, "Dados inseridos!");
                        txtNomeCompleto.setText("");
                        txtCPF.setText("");
                        txtSenha.setText("");
                        txtEndereco.setText("");
                        txtProfissao.setText("");
                        txtRenda.getText();
                    } catch (Exception ex) {
                        System.out.println("Erro ao conectar o banco de dados!");
                    }                   }


            });
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

        public static void main(String[] args) {
                     Tela_Cadastro tela_cadastro = new Tela_Cadastro();

                }
}
