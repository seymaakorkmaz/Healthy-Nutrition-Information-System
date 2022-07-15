package veritabani;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AppointmentScreen extends JFrame {

	private String hour;
	private String date;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public int hata = 0;
	private Nutritionist selectedNutritionist ;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public AppointmentScreen() throws Exception {
		Database database = new Database();
		Client client = database.loggedUser();
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(AppointmentScreen.class.getResource("/icons/apple.png")));
		setTitle("FitLife");
		
		ArrayList<Nutritionist> nutritionists = database.loadNutritionists();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 922, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String days[] = {"choose","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String months[] = {"choose","1","2","3","4","5","6","7","8","9","10","11","12"};
		String years[] = {"choose","2022"};
		String hours[] = {"choose","09.00","10.00","11.00",
							"12.00","13.00","14.00",
							"15.00","16.00","17.00",
							"18.00","19.00"};
		
		JComboBox comboBox = new JComboBox(days);
		comboBox.setBackground(new Color(210, 180, 140));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setBounds(61, 299, 65, 33);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(months);
		comboBox_1.setBackground(new Color(210, 180, 140));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox_1.setBounds(125, 299, 78, 33);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox(years);
		comboBox_2.setBackground(new Color(210, 180, 140));
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox_2.setBounds(202, 299, 78, 33);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox(hours);
		comboBox_3.setBackground(new Color(210, 180, 140));
		comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox_3.setBounds(297, 299, 85, 33);
		contentPane.add(comboBox_3);
		
		
		System.out.println(date);
		JComboBox comboBox_4 = new JComboBox(database.getNutritionistsName());
		comboBox_4.setBackground(new Color(210, 180, 140));
		comboBox_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_4.setBounds(61, 220, 321, 33);
		contentPane.add(comboBox_4);
		
		
		JButton btnNewButton = new JButton("CONFIRM");
		btnNewButton.setBackground(new Color(204, 153, 102));
		btnNewButton.setIcon(new ImageIcon(AppointmentScreen.class.getResource("/icons/confirmation.png")));
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hata = 0;
				if(comboBox.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null,"Choose the appointment day!");
					hata = 1;
				}
					
				if(comboBox_1.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null,"Choose the appointment month!");
					hata = 1;
				}
					
				if(comboBox_2.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null,"Choose the appointment year!");
					hata = 1;
				}
					
				if(comboBox_3.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null,"Choose the appointment hour!");
					hata = 1;
				}
					
				if(comboBox_4.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null,"Choose a nutritionist!");
					hata = 1;
				}
					
				date = years[comboBox_2.getSelectedIndex()].concat("-").concat(months[comboBox_1.getSelectedIndex()]).concat("-").concat(days[comboBox.getSelectedIndex()]);
				hour = hours[comboBox_3.getSelectedIndex()];
				if(hata == 0) {
					selectedNutritionist = new Nutritionist(nutritionists.get(comboBox_4.getSelectedIndex()-1).getNutritionistId(),nutritionists.get(comboBox_4.getSelectedIndex()-1).getFirstName(),nutritionists.get(comboBox_4.getSelectedIndex()-1).getSurname(),nutritionists.get(comboBox_4.getSelectedIndex()-1).getPassword());
					if((database.isThereAppointmentForNutritionist(selectedNutritionist,date,hour)) != null) {
						JOptionPane.showMessageDialog(null,"This appointment is already taken!");
					}else if((database.isThereAppointmentForClient(client,date,hour)) != null) {
						JOptionPane.showMessageDialog(null,"You have an another appointment on this day and hour!");
					}else {
						Appointment appointment = new Appointment(date,hour,client,selectedNutritionist);
						try {
							database.bookAppointment(appointment);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(null,"You have successfully booked an appointment.");
					}
				}
			}	
		});
		btnNewButton.setBounds(61, 365, 142, 58);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("NUTRITIONIST ID - NAME - SURNAME");
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(61, 197, 353, 23);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.setBackground(new Color(210, 180, 140));
		btnNewButton_2.setIcon(new ImageIcon(AppointmentScreen.class.getResource("/icons/arrow (1).png")));
		btnNewButton_2.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
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
		btnNewButton_2.setBounds(10, 10, 97, 32);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("BOOK APPOINTMENT");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 35));
		lblNewLabel_1.setBounds(61, 139, 375, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DAY      MONTH    YEAR");
		lblNewLabel_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblNewLabel_2.setBounds(61, 275, 219, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("HOUR");
		lblNewLabel_3.setForeground(new Color(139, 0, 0));
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblNewLabel_3.setBounds(297, 274, 78, 24);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(AppointmentScreen.class.getResource("/icons/mainBackground.jpg")));
		lblNewLabel_4.setBounds(0, 0, 922, 615);
		contentPane.add(lblNewLabel_4);
		
	}
}
