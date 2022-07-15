package veritabani;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class ClientRegister extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField name;
	private JTextField surname;
	private JTextField e_mail;
	private JTextField phone;
	private JTextField password;
	private JTextField age;
	private JTextField username;


	public ClientRegister() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ClientRegister.class.getResource("/icons/apple.png")));
		setTitle("FitLife");
		Database database = new Database();
		Client client = new Client();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 490);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
	
		
		JLabel lblClentRegster = new JLabel("CLIENT REGISTER");
		lblClentRegster.setForeground(new Color(0, 100, 0));
		lblClentRegster.setHorizontalAlignment(SwingConstants.CENTER);
		lblClentRegster.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		lblClentRegster.setBounds(32, 29, 395, 62);
		getContentPane().add(lblClentRegster);
		
		JLabel lblNewLabel_1 = new JLabel("NAME:");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(75, 82, 117, 32);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SURNAME:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(51, 113, 141, 32);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("AGE:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(83, 145, 109, 32);
		getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("E-MAIL:");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(51, 210, 160, 32);
		getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("PHONE NUMBER:");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_4.setBounds(29, 240, 141, 32);
		getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("USERNAME:");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_5.setBounds(32, 282, 150, 32);
		getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("PASSWORD:");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_6.setBounds(42, 312, 150, 32);
		getContentPane().add(lblNewLabel_1_6);
		
		JLabel hata_phone = new JLabel("phone number is incorrect");
		hata_phone.setForeground(new Color(139, 0, 0));
		hata_phone.setHorizontalAlignment(SwingConstants.LEFT);
		hata_phone.setBounds(389, 243, 200, 29);
		getContentPane().add(hata_phone);
		hata_phone.setVisible(false);
		
		JLabel hata_username = new JLabel("username already taken");
		hata_username.setHorizontalAlignment(SwingConstants.LEFT);
		hata_username.setForeground(new Color(139, 0, 0));
		hata_username.setBounds(389, 283, 200, 24);
		getContentPane().add(hata_username);
		hata_username.setVisible(false);
		
		JLabel hata_age = new JLabel("age is incorrect");
		hata_age.setHorizontalAlignment(SwingConstants.LEFT);
		hata_age.setForeground(new Color(139, 0, 0));
		hata_age.setBounds(389, 151, 219, 22);
		getContentPane().add(hata_age);
		hata_age.setVisible(false);
		
		JLabel hata_email = new JLabel("e-mail is incorrect");
		hata_email.setForeground(new Color(139, 0, 0));
		hata_email.setHorizontalAlignment(SwingConstants.LEFT);
		hata_email.setBounds(389, 219, 200, 21);
		getContentPane().add(hata_email);
		hata_email.setVisible(false);

		
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		name.setBounds(169, 87, 210, 25);
		getContentPane().add(name);
		name.setColumns(10);
		
		surname = new JTextField();
		surname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		surname.setColumns(10);
		surname.setBounds(169, 118, 210, 25);
		getContentPane().add(surname);
		
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.PLAIN, 14));
		age.setColumns(10);
		age.setBounds(169, 150, 210, 25);
		getContentPane().add(age);
		

		
		e_mail = new JTextField();
		e_mail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		e_mail.setColumns(10);
		e_mail.setBounds(169, 215, 210, 25);
		getContentPane().add(e_mail);
		
		
		phone = new JTextField();
		phone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		phone.setColumns(10);
		phone.setBounds(169, 248, 210, 25);
		getContentPane().add(phone);

		username = new JTextField();
		username.setFont(new Font("Tahoma", Font.PLAIN, 14));
		username.setColumns(10);
		username.setBounds(169, 285, 210, 25);
		getContentPane().add(username);
		
		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 14));
		password.setColumns(10);
		password.setBounds(169, 317, 210, 25);
		getContentPane().add(password);
		
		
		JLabel lblNewLabel_1_2_1 = new JLabel("GENDER:");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_2_1.setBounds(51, 176, 150, 32);
		getContentPane().add(lblNewLabel_1_2_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("FEMALE");
		rdbtnNewRadioButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBackground(new Color(143, 188, 143));
		rdbtnNewRadioButton.setBounds(169, 181, 78, 28);
		getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("MALE");
		rdbtnNewRadioButton_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setBackground(new Color(143, 188, 143));
		rdbtnNewRadioButton_1.setBounds(243, 181, 65, 28);
		getContentPane().add(rdbtnNewRadioButton_1);
		

		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("OTHER");
		rdbtnNewRadioButton_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		rdbtnNewRadioButton_2.setBackground(new Color(143, 188, 143));
		rdbtnNewRadioButton_2.setBounds(307, 181, 72, 28);
		getContentPane().add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(false);
		}
		});
		
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton_2.setSelected(false);
				rdbtnNewRadioButton.setSelected(false);
		}
		});
		
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton.setSelected(false);
			}
		});
		
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setBackground(new Color(143, 188, 143));
		btnNewButton.setIcon(new ImageIcon(ClientRegister.class.getResource("/icons/register.png")));
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hata = 0;
				
				if(client.isStringEmpty(phone.getText())) {
					hata = 2;
				}else if(!client.isPhoneValid(phone.getText())) {
					hata_phone.setVisible(true);	
					phone.setText("");	
					hata = 1;
				}
				
				if(client.isStringEmpty(e_mail.getText())) {
					hata = 	2;
				}else if(!client.isEMailValid(e_mail.getText())) {
					hata_email.setVisible(true);	
					e_mail.setText("");
					hata = 1;
				}
				
				if(client.isStringEmpty(age.getText())) {
					hata = 2;
				}else if(client.isThereCharacter(age.getText())){
					hata_age.setVisible(true);	
					age.setText("");
					hata = 1;
				}else if(!client.isAgeValid(Integer.parseInt(age.getText()))){
					hata_age.setVisible(true);	
					age.setText("");
					hata = 1;
				}
				
				if(client.isStringEmpty((username.getText()))) {
					hata = 2;
				}else if(database.isThereUsername(username.getText())) {
					hata_username.setVisible(true);	
					username.setText("");
					hata = 1 ;
				} 
				
				if(client.isStringEmpty((name.getText()))) {
					hata = 2;
				}
				
				if(client.isStringEmpty((surname.getText()))) {
					hata = 2;
				}
				
				if(client.isStringEmpty((password.getText()))) {
					hata = 2;
				}
				
				
				int gender = -1;
				if(rdbtnNewRadioButton.isSelected()) 
					gender = 0 ;
				else if(rdbtnNewRadioButton_1.isSelected())
					gender = 1;
				else if(rdbtnNewRadioButton_2.isSelected())
					gender = 2;
				if(hata == 2) {
					JOptionPane.showMessageDialog(null,"Please fill all the fields!!!");
				}else if(hata == 0){
					Client client = new Client(name.getText(), surname.getText(),username.getText(),password.getText().toString(),e_mail.getText(), phone.getText(),gender,Integer.parseInt(age.getText()));
					if(database.searchClient(client.getUsername(),client.getPassword()) != null) {
						JOptionPane.showMessageDialog(null,"You are already registered, log in");
						ClientLogin cL =new ClientLogin();
						setVisible(false);
						cL.setVisible(true);
					}else {
						try {
							database.clientRegister(client);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(null,"Registration successful, log in");
						ClientLogin cL =new ClientLogin();
						setVisible(false);
						cL.setVisible(true);	
					}
				}
			}
		});
		
		btnNewButton.setBounds(150, 354, 141, 62);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 ClientLogin login;
				try {
					login = new ClientLogin();
					login.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(ClientRegister.class.getResource("/icons/arrow (1).png")));
		btnNewButton_2.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		btnNewButton_2.setBackground(new Color(143, 188, 143));
		btnNewButton_2.setBounds(10, 10, 97, 32);
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("0(5XX) XXX XX XX");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(51, 262, 119, 13);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ClientRegister.class.getResource("/icons/background.png")));
		lblNewLabel.setBounds(0, 0, 828, 468);
		getContentPane().add(lblNewLabel);

		
	}
}
