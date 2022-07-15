package veritabani;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class Login extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/icons/apple.png")));
		setTitle("FitLife");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("CLIENT LOGIN");
		btnNewButton_2.setBackground(new Color(143, 188, 143));
		btnNewButton_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClientLogin frm1 =  new ClientLogin();
				setVisible(false);
				frm1.setVisible(true);
			}
		});
		
		btnNewButton_2.setBounds(174, 232, 264, 57);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("NUTRITIONIST LOGIN");
		btnNewButton_2_1.setBackground(new Color(143, 188, 143));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NutritionistLogin frm2 = new NutritionistLogin();
				setVisible(false);
				frm2.setVisible(true);
			}
		});
		btnNewButton_2_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton_2_1.setBounds(174, 298, 264, 57);
		contentPane.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("WELCOME TO FITLIFE");
		lblNewLabel_2.setForeground(new Color(0, 100, 0));
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 35));
		lblNewLabel_2.setBounds(145, 136, 350, 57);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/icons/background.png")));
		lblNewLabel_1.setBounds(0, 0, 826, 474);
		contentPane.add(lblNewLabel_1);
	}
}
