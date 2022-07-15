package veritabani;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class CalculationsScreen extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String activities[];
	private String aim[];
	int hata = 0;
	int gender;
	Database database;
	Client client;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public CalculationsScreen() throws Exception {
		setTitle("FitLife");
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalculationsScreen.class.getResource("/icons/apple.png")));
		Database database = new Database();
		Client client = database.loggedUser();
		Calculations cal = new Calculations();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 922, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GENDER");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel.setBounds(61, 131, 61, 23);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("MALE");
		rdbtnNewRadioButton.setBackground(new Color(210, 180, 140));
		rdbtnNewRadioButton.setFont(new Font("Tw Cen MT", Font.BOLD, 13));
		rdbtnNewRadioButton.setBounds(174, 131, 67, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("FEMALE");
		rdbtnNewRadioButton_1.setBackground(new Color(210, 180, 140));
		rdbtnNewRadioButton_1.setFont(new Font("Tw Cen MT", Font.BOLD, 13));
		rdbtnNewRadioButton_1.setBounds(236, 131, 78, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
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
		
		JLabel hata_height = new JLabel("Height isn't valid.");
		hata_height.setForeground(new Color(139, 0, 0));
		hata_height.setFont(new Font("Tahoma", Font.BOLD, 11));
		hata_height.setBounds(270, 234, 205, 14);
		contentPane.add(hata_height);
		hata_height.setVisible(false);
		
		JLabel hata_weight = new JLabel("Weight isn't valid.");
		hata_weight.setForeground(new Color(139, 0, 0));
		hata_weight.setFont(new Font("Tahoma", Font.BOLD, 11));
		hata_weight.setBounds(270, 262, 205, 14);
		contentPane.add(hata_weight); 
		hata_weight.setVisible(false);
		
		activities = new String[] {"Choose","Lowest Level Activity",
				"Light Activity","Moderate Activity","High Level Activity","Extra Level Activity"};
		
		aim = new String[] {"Choose", "Lose Weight","Maintain The Current Situation","\r\n"
						+ "Gain Weight","Build Muscle"};
		
		JComboBox comboBox = new JComboBox(activities);
		comboBox.setBackground(new Color(210, 180, 140));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox.setBounds(174, 161, 250, 25);
		contentPane.add(comboBox);
		
		JLabel lblAktiviteDzeyi = new JLabel("ACTIVITY LEVEL");
		lblAktiviteDzeyi.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblAktiviteDzeyi.setBounds(61, 157, 118, 33);
		contentPane.add(lblAktiviteDzeyi);
		
		JLabel lblHedef = new JLabel("GOAL");
		lblHedef.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblHedef.setBounds(61, 188, 67, 33);
		contentPane.add(lblHedef);
		
		JComboBox comboBox_1 = new JComboBox(aim);
		comboBox_1.setBackground(new Color(210, 180, 140));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_1.setBounds(174, 192, 250, 25);
		contentPane.add(comboBox_1);
		
		JLabel lblBoy = new JLabel("HEIGHT(CM)");
		lblBoy.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblBoy.setBounds(61, 224, 93, 33);
		contentPane.add(lblBoy);
		
		JLabel lblKilo = new JLabel("WEIGHT(KG)");
		lblKilo.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblKilo.setBounds(61, 252, 93, 33);
		contentPane.add(lblKilo);
		
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 227, 86, 23);
		contentPane.add(textField_1);
		
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(174, 258, 86, 23);
		contentPane.add(textField_2);
		
		JLabel basalLabel = new JLabel("");
		basalLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		basalLabel.setBounds(196, 395, 118, 25);
		contentPane.add(basalLabel);
		
		JLabel bodyMassLabel = new JLabel("");
		bodyMassLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		bodyMassLabel.setBounds(185, 425, 93, 25);
		contentPane.add(bodyMassLabel);
		
		JLabel calLabel = new JLabel("");
		calLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		calLabel.setBounds(216, 455, 103, 25);
		contentPane.add(calLabel);
		
		JLabel lblNewLabel_2 = new JLabel("BASAL METABOLISM: ");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		lblNewLabel_2.setBounds(61, 395, 138, 25);
		lblNewLabel_2.setVisible(false);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BODY MASS INDEX:");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		lblNewLabel_3.setBounds(61, 425, 138, 25);
		lblNewLabel_3.setVisible(false);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("IDEAL CALORIE INTAKE:");
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		lblNewLabel_4.setBounds(61, 455, 160, 25);
		lblNewLabel_4.setVisible(false);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.setBackground(new Color(210, 180, 140));
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hata = 0;
				if(comboBox.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null,"Choose the activity!");
					hata = 1;
				}
				if(comboBox_1.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null,"Choose the goal!");
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
					JOptionPane.showMessageDialog(null,"Please fill all the fields!");
				}else if(hata == 0 && gender != -1) {
					lblNewLabel_2.setVisible(true);
					lblNewLabel_3.setVisible(true);
					lblNewLabel_4.setVisible(true);
					basalLabel.setText(new DecimalFormat("##.##").format(cal.basalMethabolism(Double.valueOf(textField_2.getText()), Double.valueOf(textField_1.getText()), client.getAge(), gender)));
					bodyMassLabel.setText(new DecimalFormat("##.##").format(cal.bodyMassIndex(Double.valueOf(textField_2.getText()), Double.valueOf(textField_1.getText()))));
					calLabel.setText(new DecimalFormat("##.##").format(cal.idealCarb(Double.valueOf(textField_2.getText()), Double.valueOf(textField_1.getText()), client.getAge(), comboBox.getSelectedIndex(), comboBox_1.getSelectedIndex(), gender)));
				}
			}
		});
		
		btnNewButton.setBounds(174, 304, 115, 46);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("CALCULATIONS");
		lblNewLabel_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		lblNewLabel_1.setBounds(61, 77, 216, 33);
		contentPane.add(lblNewLabel_1);
		
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
		btnNewButton_2.setIcon(new ImageIcon(CalculationsScreen.class.getResource("/icons/arrow (1).png")));
		btnNewButton_2.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		btnNewButton_2.setBackground(new Color(210, 180, 140));
		btnNewButton_2.setBounds(10, 10, 97, 32);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(CalculationsScreen.class.getResource("/icons/mainBackground.jpg")));
		lblNewLabel_5.setBounds(0, 0, 922, 615);
		contentPane.add(lblNewLabel_5);
	}
}
