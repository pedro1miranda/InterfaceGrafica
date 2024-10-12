package InterfaceGrafica.View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txt_nome;

 
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 479, 342);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lbl_nome = new JLabel("Nome: ");
        lbl_nome.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbl_nome.setHorizontalAlignment(SwingConstants.LEFT);
        lbl_nome.setBounds(26, 33, 46, 14);
        contentPane.add(lbl_nome);

        txt_nome = new JTextField();
        txt_nome.setBounds(26, 58, 86, 20);
        contentPane.add(txt_nome);
        txt_nome.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Idade:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(26, 89, 46, 14);
        contentPane.add(lblNewLabel_1);

        JSpinner Spin_idade = new JSpinner();
        Spin_idade.setBounds(26, 114, 30, 20);
        contentPane.add(Spin_idade);

        JLabel lblNewLabel = new JLabel("Sexo: ");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(26, 145, 46, 14);
        contentPane.add(lblNewLabel);

        JRadioButton rd_masculino = new JRadioButton("Masculino");
        rd_masculino.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rd_masculino.setBounds(26, 166, 109, 23);
        contentPane.add(rd_masculino);

        JRadioButton rd_feminino = new JRadioButton("Feminino");
        rd_feminino.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rd_feminino.setBounds(26, 192, 109, 23);
        contentPane.add(rd_feminino);

        ButtonGroup sexoGroup = new ButtonGroup();
        sexoGroup.add(rd_feminino);
        sexoGroup.add(rd_masculino);

        JLabel lb_resumo = new JLabel("Resumo:");
        lb_resumo.setVerticalAlignment(SwingConstants.TOP);
        lb_resumo.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lb_resumo.setBounds(185, 32, 190, 213);
        contentPane.add(lb_resumo);
        
        JButton btnNewButton = new JButton("Enviar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
 
                String nome = txt_nome.getText();
                int idade = (int) Spin_idade.getValue();
                String sexo = rd_masculino.isSelected() ? "Masculino" : rd_feminino.isSelected() ? "Feminino" : "Não selecionado";

                lb_resumo.setText("<html>Nome: " + nome + "<br>Idade: " + idade + "<br>Sexo: " + sexo + "</html>");
            }
        });
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setBounds(26, 222, 89, 23);
        contentPane.add(btnNewButton);


    }
}
