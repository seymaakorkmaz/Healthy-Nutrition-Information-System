package veritabani;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class DietListInformationScreen extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String activities[];
	private String aim[];
	int hata = 0;
	int gender;
	Database database;
	Client client;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public DietListInformationScreen() throws Exception {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DietListInformationScreen.class.getResource("/icons/apple.png")));
		setTitle("FitLife");
		database = new Database();
		client = new Client();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 922, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GENDER");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel.setBounds(45, 175, 93, 28);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("FEMALE");
		rdbtnNewRadioButton_1.setBackground(new Color(210, 180, 140));
		rdbtnNewRadioButton_1.setFont(new Font("Tw Cen MT", Font.BOLD, 13));
		rdbtnNewRadioButton_1.setBounds(218, 178, 79, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("MALE");
		rdbtnNewRadioButton.setBackground(new Color(210, 180, 140));
		rdbtnNewRadioButton.setFont(new Font("Tw Cen MT", Font.BOLD, 13));
		rdbtnNewRadioButton.setBounds(159, 178, 62, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton_1.setSelected(false);
			}
		});
		
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton.setSelected(false);
			}
		});
		
		JLabel hata_age = new JLabel("Age isn't valid.");
		hata_age.setFont(new Font("Tahoma", Font.BOLD, 11));
		hata_age.setBounds(255, 288, 205, 14);
		contentPane.add(hata_age);
		hata_age.setVisible(false);
		
		JLabel hata_height = new JLabel("Height isn't valid.");
		hata_height.setFont(new Font("Tahoma", Font.BOLD, 11));
		hata_height.setBounds(255, 326, 205, 14);
		contentPane.add(hata_height);
		hata_height.setVisible(false);
		
		JLabel hata_weight = new JLabel("Weight isn't valid.");
		hata_weight.setFont(new Font("Tahoma", Font.BOLD, 11));
		hata_weight.setBounds(255, 358, 205, 14);
		contentPane.add(hata_weight); 
		hata_weight.setVisible(false);

		activities = new String[] {"choose","Lowest level activity","Light activity","Moderate activity","High level activity","Extra level activity"};
		aim = new String[] {"choose","Build muscle","Gaining weight","Maintain the current situation", "Lose weight"};
				 
		JComboBox comboBox = new JComboBox(activities);
		comboBox.setBackground(new Color(210, 180, 140));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox.setBounds(159, 210, 342, 30);
		contentPane.add(comboBox);
		
		JLabel lblAktiviteDzeyi = new JLabel("ACTIVITY LEVEL");
		lblAktiviteDzeyi.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblAktiviteDzeyi.setBounds(45, 210, 118, 28);
		contentPane.add(lblAktiviteDzeyi);
		
		JLabel lblHedef = new JLabel("GOAL");
		lblHedef.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblHedef.setBounds(45, 245, 93, 28);
		contentPane.add(lblHedef);
		
		JComboBox comboBox_1 = new JComboBox(aim);
		comboBox_1.setBackground(new Color(210, 180, 140));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_1.setBounds(159, 245, 342, 28);
		contentPane.add(comboBox_1);
		
		JLabel lblYa = new JLabel("AGE");
		lblYa.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblYa.setBounds(45, 280, 93, 28);
		contentPane.add(lblYa);
		
		JLabel lblBoy = new JLabel("HEIGHT(CM)");
		lblBoy.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblBoy.setBounds(45, 315, 93, 28);
		contentPane.add(lblBoy);
		
		JLabel lblKilo = new JLabel("WEIGHT(KG)");
		lblKilo.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblKilo.setBounds(45, 350, 93, 28);
		contentPane.add(lblKilo);
		
		JTextField textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField.setBounds(159, 280, 86, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(159, 315, 86, 28);
		contentPane.add(textField_1);
		
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(159, 350, 86, 28);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setBackground(new Color(210, 180, 140));
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
		private BreakfastScreen screen;
			public void actionPerformed(ActionEvent e) {
				hata = 0;
				if(comboBox.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null,"Choose the activity!");
					hata = 1;
				}
				if(comboBox_1.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null,"Choose the aim!");
					hata = 1;
				}
				
				if(client.isStringEmpty(textField.getText())) {
					hata = 2;
				}else if(client.isThereCharacter(textField.getText())){
					hata_age.setVisible(true);	
					textField.setText("");
					hata = 1;	
				}else if(!client.isAgeValid(Integer.parseInt(textField.getText()))){
					hata_age.setVisible(true);	
					textField.setText("");
					hata = 1;	
				}
				
				if(client.isStringEmpty(textField_1.getText())) {
					hata = 2;
				}else if(client.isThereCharacter(textField_1.getText())){
					hata_height.setVisible(true);	
					textField_1.setText("");
					hata = 1;	
				}else if(!(Integer.parseInt(textField_1.getText()) > 0 && Integer.parseInt(textField_1.getText()) < 250)){
					hata_height.setVisible(true);	
					textField_1.setText("");
					hata = 1;	
				}
				
				if(client.isStringEmpty(textField_2.getText())) {
					hata = 2;
				}else if(client.isThereCharacter(textField_2.getText())){
					hata_weight.setVisible(true);	
					textField_2.setText("");
					hata = 1;	
				}else if(!(Integer.parseInt(textField_2.getText()) > 0 && Integer.parseInt(textField_2.getText()) < 400)){
					hata_weight.setVisible(true);	
					textField_2.setText("");
					hata = 1;	
				}
				
				gender = -1;
				
				if(rdbtnNewRadioButton.isSelected()) 
					gender = 0 ;
				else if(rdbtnNewRadioButton_1.isSelected())
					gender = 1;
				
				if(gender == -1) {
					JOptionPane.showMessageDialog(null,"Choose the gender!");
				}
				
				if(hata == 2) {
					JOptionPane.showMessageDialog(null,"Please fill all the fields!!!");
				}else if(hata == 0 && gender != -1) {
					try {
						screen = new BreakfastScreen(gender, comboBox.getSelectedIndex()+1, comboBox_1.getSelectedIndex()+1, Integer.parseInt(textField.getText()), Integer.parseInt(textField_1.getText()),Integer.parseInt(textField_2.getText()));
						screen.setVisible(true);
						dispose();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton.setBounds(206, 430, 93, 45);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreen main;
				try {
					main = new MainScreen();
					main.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(DietListInformationScreen.class.getResource("/icons/arrow (1).png")));
		btnNewButton_2.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		btnNewButton_2.setBackground(new Color(210, 180, 140));
		btnNewButton_2.setBounds(10, 10, 97, 32);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("MAKE A DIET LIST");
		lblNewLabel_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 35));
		lblNewLabel_1.setBounds(45, 110, 326, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(DietListInformationScreen.class.getResource("/icons/mainBackground.jpg")));
		lblNewLabel_2.setBounds(0, 0, 922, 615);
		contentPane.add(lblNewLabel_2);
	}
}
