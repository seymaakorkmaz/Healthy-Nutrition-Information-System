package veritabani;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class ClientLogin extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEnterUsernameHere;
	private JTextField textField_1;

	public ClientLogin() {
		setTitle("FitLife");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ClientLogin.class.getResource("/icons/apple.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JLabel lblClentLognScreen = new JLabel("CLIENT LOGIN");
		lblClentLognScreen.setForeground(new Color(0, 100, 0));
		lblClentLognScreen.setHorizontalAlignment(SwingConstants.CENTER);
		lblClentLognScreen.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		lblClentLognScreen.setBounds(72, 89, 371, 75);
		contentPane.add(lblClentLognScreen);
		
		JLabel lblNewLabel = new JLabel("USERNAME:");
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(72, 160, 173, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setForeground(new Color(0, 100, 0));
		lblPassword.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(72, 204, 173, 34);
		contentPane.add(lblPassword);
		
		txtEnterUsernameHere = new JTextField();
		txtEnterUsernameHere.setForeground(new Color(0, 0, 0));
		txtEnterUsernameHere.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEnterUsernameHere.setToolTipText("");
		txtEnterUsernameHere.setBounds(229, 160, 195, 34);
		contentPane.add(txtEnterUsernameHere);
		txtEnterUsernameHere.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(229, 204, 195, 34);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBackground(new Color(143, 188, 143));
		btnNewButton.setIcon(new ImageIcon(ClientLogin.class.getResource("/icons/login.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Database database = new Database();
				//ArrayList<Client> clients = database.loadClients();
				Client client =database.searchClient(txtEnterUsernameHere.getText(),textField_1.getText());
				if(client == null){
					JOptionPane.showMessageDialog(null, "Username or password is incorrect...");
					txtEnterUsernameHere.setText("");
					textField_1.setText("");
				}
				else {
					//JOptionPane.showMessageDialog(null, "Successful Login...");
					setVisible(false);
					try {
						database.saveLoggedUser(client);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					MainScreen main;
					try {
						main = new MainScreen();
						main.setVisible(true);	
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton.setBounds(72, 270, 173, 67);
		contentPane.add(btnNewButton);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setBackground(new Color(143, 188, 143));
		btnRegister.setIcon(new ImageIcon(ClientLogin.class.getResource("/icons/register.png")));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClientRegister frame2 = new ClientRegister();
				setVisible(false);
				frame2.setVisible(true);
			}
		});
		btnRegister.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnRegister.setBounds(270, 270, 173, 67);
		contentPane.add(btnRegister);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ClientLogin.class.getResource("/icons/background.png")));
		lblNewLabel_1.setBounds(0, 0, 823, 463);
		contentPane.add(lblNewLabel_1);
	}
}
