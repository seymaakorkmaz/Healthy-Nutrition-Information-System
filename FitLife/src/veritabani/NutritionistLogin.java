package veritabani;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class NutritionistLogin extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public NutritionistLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NutritionistLogin.class.getResource("/icons/apple.png")));
		setTitle("FitLife");
		Database database = new Database();
		database.getNutritionistsName();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 490);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 100, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNutrtonstLognScreen = new JLabel("NUTRITIONIST LOGIN");
		lblNutrtonstLognScreen.setForeground(new Color(0, 100, 0));
		lblNutrtonstLognScreen.setBounds(-39, 109, 616, 83);
		lblNutrtonstLognScreen.setHorizontalAlignment(SwingConstants.CENTER);
		lblNutrtonstLognScreen.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		contentPane.add(lblNutrtonstLognScreen);
		
		JLabel lblNewLabel = new JLabel("NUTRITIONIST ID :");
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(40, 180, 211, 40);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(236, 184, 239, 31);
		contentPane.add(textField);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setForeground(new Color(0, 100, 0));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblPassword.setBounds(88, 220, 163, 40);
		contentPane.add(lblPassword);
		
		textField_1 = new JPasswordField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(236, 228, 239, 31);
		contentPane.add(textField_1);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(new Color(143, 188, 143));
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setIcon(new ImageIcon(NutritionistLogin.class.getResource("/icons/login.png")));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Database database = new Database();
				Nutritionist nut = database.searchNutritionist(textField.getText(),textField_1.getText());
				if(nut == null){

					JOptionPane.showMessageDialog(null, "Nutritionist ID or password is incorrect...");
					textField.setText("");
					textField_1.setText("");
				}
				else {
					setVisible(false);
					try {
						database.saveLoggedNutritionist(nut);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					NutritionistCalendar calendar;
					try {
						calendar = new NutritionistCalendar();
						calendar.setVisible(true);	
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		btnLogin.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnLogin.setBounds(197, 282, 140, 62);
		contentPane.add(btnLogin);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login;
				try {
					login = new Login();
					login.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(ClientLogin.class.getResource("/icons/arrow (1).png")));
		btnNewButton_2.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		btnNewButton_2.setBackground(new Color(143, 188, 143));
		btnNewButton_2.setBounds(10, 10, 97, 32);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(NutritionistLogin.class.getResource("/icons/background.png")));
		lblNewLabel_1.setBounds(0, 0, 828, 465);
		contentPane.add(lblNewLabel_1);
	}
}
