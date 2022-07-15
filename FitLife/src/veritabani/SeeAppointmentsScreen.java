package veritabani;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class SeeAppointmentsScreen extends JFrame {
	private JPanel contentPane;
	private static final long serialVersionUID = 1L;
	private JTextField hour19;
	private JTextField hour18;
	private JTextField hour17;
	private JTextField hour16;
	private JTextField hour15;
	private JTextField hour14;
	private JTextField hour13;
	private JTextField hour12;
	private JTextField hour11;
	private JTextField hour10;
	private JTextField hour9;
	private final JLabel lblNewLabel_4 = new JLabel("BOOKED APPOINTMENTS");

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public SeeAppointmentsScreen() throws Exception {
		setTitle("FitLife");
		setIconImage(Toolkit.getDefaultToolkit().getImage(SeeAppointmentsScreen.class.getResource("/icons/apple.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 922, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ArrayList<JButton> days = new ArrayList<JButton>();
		Database database = new Database();
		Client client = database.loggedUser();
		ArrayList<Appointment> appoList = database.loadAppointments();
		ArrayList<JTextField> hours = new ArrayList<JTextField>();
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CHOOSE", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"}));
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		comboBox.setBackground(new Color(210, 180, 140));
		comboBox.setBounds(115, 169, 132, 32);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel(" 2022");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel.setBounds(253, 169, 54, 32);
		contentPane.add(lblNewLabel);
		
		JButton day1 = new JButton();
		day1.setText("1");
		day1.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day1.setEnabled(false);
		day1.setBackground(new Color(250, 240, 230));
		day1.setBounds(60, 211, 45, 45);
		days.add(day1);
		contentPane.add(day1);
		
		JButton day2 = new JButton();
		day2.setText("2");
		day2.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day2.setEnabled(false);
		day2.setBackground(new Color(250, 240, 230));
		day2.setBounds(104, 211, 45, 45);
		days.add(day2);
		contentPane.add(day2);
		
		JButton day3 = new JButton();
		day3.setText("3");
		day3.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day3.setEnabled(false);
		day3.setBackground(new Color(250, 240, 230));
		day3.setBounds(148, 211, 45, 45);
		days.add(day3);
		contentPane.add(day3);
		
		JButton day4 = new JButton();
		day4.setText("4");
		day4.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day4.setEnabled(false);
		day4.setBackground(new Color(250, 240, 230));
		day4.setBounds(192, 211, 45, 45);
		days.add(day4);
		contentPane.add(day4);
		
		JButton day5 = new JButton();
		day5.setText("5");
		day5.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day5.setEnabled(false);
		day5.setBackground(new Color(250, 240, 230));
		day5.setBounds(236, 211, 45, 45);
		days.add(day5);
		contentPane.add(day5);
		
		JButton day6 = new JButton();
		day6.setText("6");
		day6.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day6.setEnabled(false);
		day6.setBackground(new Color(250, 240, 230));
		day6.setBounds(280, 211, 45, 45);
		days.add(day6);
		contentPane.add(day6);
		
		JButton day7 = new JButton();
		day7.setText("7");
		day7.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day7.setEnabled(false);
		day7.setBackground(new Color(250, 240, 230));
		day7.setBounds(324, 211, 45, 45);
		days.add(day7);
		contentPane.add(day7);
		
		JButton day8 = new JButton();
		day8.setText("8");
		day8.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day8.setEnabled(false);
		day8.setBackground(new Color(250, 240, 230));
		day8.setBounds(60, 255, 45, 45);
		days.add(day8);
		contentPane.add(day8);
		
		JButton day9 = new JButton();
		day9.setText("9");
		day9.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day9.setEnabled(false);
		day9.setBackground(new Color(250, 240, 230));
		day9.setBounds(104, 255, 45, 45);
		days.add(day9);
		contentPane.add(day9);
		
		JButton day10 = new JButton();
		day10.setText("10");
		day10.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day10.setEnabled(false);
		day10.setBackground(new Color(250, 240, 230));
		day10.setBounds(148, 255, 45, 45);
		days.add(day10);
		contentPane.add(day10);
		
		JButton day11 = new JButton();
		day11.setText("11");
		day11.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day11.setEnabled(false);
		day11.setBackground(new Color(250, 240, 230));
		day11.setBounds(192, 255, 45, 45);
		days.add(day11);
		contentPane.add(day11);
		
		JButton day12 = new JButton();
		day12.setText("12");
		day12.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day12.setEnabled(false);
		day12.setBackground(new Color(250, 240, 230));
		day12.setBounds(236, 255, 45, 45);
		days.add(day12);
		contentPane.add(day12);
		
		JButton day13 = new JButton();
		day13.setText("13");
		day13.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day13.setEnabled(false);
		day13.setBackground(new Color(250, 240, 230));
		day13.setBounds(280, 255, 45, 45);
		days.add(day13);
		contentPane.add(day13);
		
		JButton day14 = new JButton();
		day14.setText("14");
		day14.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day14.setEnabled(false);
		day14.setBackground(new Color(250, 240, 230));
		day14.setBounds(324, 255, 45, 45);
		days.add(day14);
		contentPane.add(day14);
		
		JButton day15 = new JButton();
		day15.setText("15");
		day15.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day15.setEnabled(false);
		day15.setBackground(new Color(250, 240, 230));
		day15.setBounds(60, 299, 45, 45);
		days.add(day15);
		contentPane.add(day15);
		
		JButton day16 = new JButton();
		day16.setText("16");
		day16.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day16.setEnabled(false);
		day16.setBackground(new Color(250, 240, 230));
		day16.setBounds(104, 299, 45, 45);
		days.add(day16);
		contentPane.add(day16);
		
		JButton day17 = new JButton();
		day17.setText("17");
		day17.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day17.setEnabled(false);
		day17.setBackground(new Color(250, 240, 230));
		day17.setBounds(148, 299, 45, 45);
		days.add(day17);
		contentPane.add(day17);
		
		JButton day18 = new JButton();
		day18.setText("18");
		day18.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day18.setEnabled(false);
		day18.setBackground(new Color(250, 240, 230));
		day18.setBounds(192, 299, 45, 45);
		days.add(day18);
		contentPane.add(day18);
		
		JButton day19 = new JButton();
		day19.setText("19");
		day19.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day19.setEnabled(false);
		day19.setBackground(new Color(250, 240, 230));
		day19.setBounds(236, 299, 45, 45);
		days.add(day19);
		contentPane.add(day19);
		
		JButton day20 = new JButton();
		day20.setText("20");
		day20.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day20.setEnabled(false);
		day20.setBackground(new Color(250, 240, 230));
		day20.setBounds(280, 299, 45, 45);
		days.add(day20);
		contentPane.add(day20);
		
		JButton day21 = new JButton();
		day21.setText("21");
		day21.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day21.setEnabled(false);
		day21.setBackground(new Color(250, 240, 230));
		day21.setBounds(324, 299, 45, 45);
		days.add(day21);
		contentPane.add(day21);
		
		JButton day22 = new JButton();
		day22.setText("22");
		day22.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day22.setEnabled(false);
		day22.setBackground(new Color(250, 240, 230));
		day22.setBounds(60, 343, 45, 45);
		days.add(day22);
		contentPane.add(day22);
		
		JButton day23 = new JButton();
		day23.setText("23");
		day23.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day23.setEnabled(false);
		day23.setBackground(new Color(250, 240, 230));
		day23.setBounds(104, 343, 45, 45);
		days.add(day23);
		contentPane.add(day23);
		
		JButton day24 = new JButton();
		day24.setText("24");
		day24.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day24.setEnabled(false);
		day24.setBackground(new Color(250, 240, 230));
		day24.setBounds(148, 343, 45, 45);
		days.add(day24);
		contentPane.add(day24);
		
		JButton day25 = new JButton();
		day25.setText("25");
		day25.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day25.setEnabled(false);
		day25.setBackground(new Color(250, 240, 230));
		day25.setBounds(192, 343, 45, 45);
		days.add(day25);
		contentPane.add(day25);
		
		JButton day26 = new JButton();
		day26.setText("26");
		day26.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day26.setEnabled(false);
		day26.setBackground(new Color(250, 240, 230));
		day26.setBounds(236, 343, 45, 45);
		days.add(day26);
		contentPane.add(day26);
		
		JButton day27 = new JButton();
		day27.setText("27");
		day27.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day27.setEnabled(false);
		day27.setBackground(new Color(250, 240, 230));
		day27.setBounds(280, 343, 45, 45);
		days.add(day27);
		contentPane.add(day27);
		
		JButton day28 = new JButton();
		day28.setText("28");
		day28.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day28.setEnabled(false);
		day28.setBackground(new Color(250, 240, 230));
		day28.setBounds(324, 343, 45, 45);
		days.add(day28);
		contentPane.add(day28);
		
		JButton day29 = new JButton();
		day29.setText("29");
		day29.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day29.setEnabled(false);
		day29.setBackground(new Color(250, 240, 230));
		day29.setBounds(60, 387, 45, 45);
		days.add(day29);
		contentPane.add(day29);
		
		JButton day30 = new JButton();
		day30.setText("30");
		day30.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day30.setEnabled(false);
		day30.setBackground(new Color(250, 240, 230));
		day30.setBounds(104, 387, 45, 45);
		days.add(day30);
		contentPane.add(day30);
		
		JButton day31 = new JButton();
		day31.setText("31");
		day31.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day31.setEnabled(false);
		day31.setBackground(new Color(250, 240, 230));
		day31.setBounds(148, 387, 45, 45);
		days.add(day31);
		contentPane.add(day31);
		
		JLabel lblNewLabel_1 = new JLabel("09.00");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1.setBounds(443, 169, 45, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("10.00");
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(442, 194, 45, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("11.00");
		lblNewLabel_1_2.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(442, 219, 45, 25);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("12.00");
		lblNewLabel_1_3.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(442, 244, 45, 25);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("13.00");
		lblNewLabel_1_4.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_4.setBounds(442, 269, 45, 25);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("14.00");
		lblNewLabel_1_5.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_5.setBounds(442, 294, 45, 25);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("15.00");
		lblNewLabel_1_6.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_6.setBounds(442, 319, 45, 25);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("16.00");
		lblNewLabel_1_7.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_7.setBounds(442, 344, 45, 25);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("17.00");
		lblNewLabel_1_8.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_8.setBounds(442, 369, 45, 25);
		contentPane.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("18.00");
		lblNewLabel_1_9.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_9.setBounds(442, 394, 45, 25);
		contentPane.add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_10 = new JLabel("19.00");
		lblNewLabel_1_10.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_10.setBounds(442, 419, 45, 25);
		contentPane.add(lblNewLabel_1_10);
		
		hour9 = new JTextField();
		hour9.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour9.setEditable(false);
		hour9.setColumns(10);
		hour9.setBackground(new Color(250, 240, 230));
		hour9.setBounds(486, 169, 243, 26);
		hours.add(hour9);
		contentPane.add(hour9);
		
		hour10 = new JTextField();
		hour10.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour10.setEditable(false);
		hour10.setColumns(10);
		hour10.setBackground(new Color(250, 240, 230));
		hour10.setBounds(486, 194, 243, 26);
		hours.add(hour10);
		contentPane.add(hour10);
		
		hour11 = new JTextField();
		hour11.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour11.setEditable(false);
		hour11.setColumns(10);
		hour11.setBackground(new Color(250, 240, 230));
		hour11.setBounds(486, 219, 243, 26);
		hours.add(hour11);
		contentPane.add(hour11);
		
		hour12 = new JTextField();
		hour12.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour12.setEditable(false);
		hour12.setColumns(10);
		hour12.setBackground(new Color(250, 240, 230));
		hour12.setBounds(486, 244, 243, 26);
		hours.add(hour12);
		contentPane.add(hour12);
		
		hour13 = new JTextField();
		hour13.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour13.setEditable(false);
		hour13.setColumns(10);
		hour13.setBackground(new Color(250, 240, 230));
		hour13.setBounds(486, 269, 243, 26);
		hours.add(hour13);
		contentPane.add(hour13);
		
		hour14 = new JTextField();
		hour14.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour14.setEditable(false);
		hour14.setColumns(10);
		hour14.setBackground(new Color(250, 240, 230));
		hour14.setBounds(486, 294, 243, 26);
		hours.add(hour14);
		contentPane.add(hour14);
		
		hour15 = new JTextField();
		hour15.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour15.setEditable(false);
		hour15.setColumns(10);
		hour15.setBackground(new Color(250, 240, 230));
		hour15.setBounds(486, 319, 243, 26);
		hours.add(hour15);
		contentPane.add(hour15);
		
		hour16 = new JTextField();
		hour16.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour16.setEditable(false);
		hour16.setColumns(10);
		hour16.setBackground(new Color(250, 240, 230));
		hour16.setBounds(486, 344, 243, 26);
		hours.add(hour16);
		contentPane.add(hour16);
		
		hour17 = new JTextField();
		hour17.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour17.setEditable(false);
		hour17.setColumns(10);
		hour17.setBackground(new Color(250, 240, 230));
		hour17.setBounds(486, 369, 243, 26);
		hours.add(hour17);
		contentPane.add(hour17);
		
		hour18 = new JTextField();
		hour18.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour18.setEditable(false);
		hour18.setColumns(10);
		hour18.setBackground(new Color(250, 240, 230));
		hour18.setBounds(486, 394, 243, 26);
		hours.add(hour18);
		contentPane.add(hour18);
		
		hour19 = new JTextField();
		hour19.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour19.setEditable(false);
		hour19.setColumns(10);
		hour19.setBackground(new Color(250, 240, 230));
		hour19.setBounds(486, 419, 243, 26);
		hours.add(hour19);
		contentPane.add(hour19);
		
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
		btnNewButton_2.setIcon(new ImageIcon(SeeAppointmentsScreen.class.getResource("/icons/arrow (1).png")));
		btnNewButton_2.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		btnNewButton_2.setBackground(new Color(210, 180, 140));
		btnNewButton_2.setBounds(21, 20, 97, 32);
		contentPane.add(btnNewButton_2);
		lblNewLabel_4.setForeground(new Color(139, 0, 0));
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.BOLD, 35));
		lblNewLabel_4.setBounds(60, 101, 443, 36);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(SeeAppointmentsScreen.class.getResource("/icons/mainBackground.jpg")));
		lblNewLabel_2.setBounds(0, 0, 922, 615);
		contentPane.add(lblNewLabel_2);
		
		comboBox.addActionListener(new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	for(JButton b: days) {
		    		b.setEnabled(false);
		    		b.setBackground(new Color(250, 240, 230));
		    	}
				for(Appointment a : appoList) {
					if(client == a.getClient()) {
						String[] date = a.getDate().split("-");
						if(Integer.valueOf(date[1]) == (comboBox.getSelectedIndex())) {
							days.get(Integer.valueOf(date[2])-1).setEnabled(true);
							days.get(Integer.valueOf(date[2])-1).setBackground(new Color(210, 180, 140));
						}
					}
				}
		    }
		});
		
		day1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day1.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day2.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day3.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day4.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day5.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day6.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day7.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day8.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day9.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day10.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day11.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day12.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day13.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day14.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day15.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day16.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day17.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day18.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day19.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day20.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day21.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day22.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day23.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day24.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day25.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day26.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day27.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day28.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day29.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day30.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
		
		day31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day31.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getNutritionist().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getNutritionist().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
	}
}
