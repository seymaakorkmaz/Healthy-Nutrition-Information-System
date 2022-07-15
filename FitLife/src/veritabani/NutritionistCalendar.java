package veritabani;

import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class NutritionistCalendar extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField hour9;
	private JTextField hour10;
	private JTextField hour11;
	private JTextField hour12;
	private JTextField hour13;
	private JTextField hour14;
	private JTextField hour15;
	private JTextField hour16;
	private JTextField hour17;
	private JTextField hour18;
	private JTextField hour19;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public NutritionistCalendar() throws Exception {
		setTitle("FitLife");
		setIconImage(Toolkit.getDefaultToolkit().getImage(NutritionistCalendar.class.getResource("/icons/apple.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 922, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ArrayList<JButton> days = new ArrayList<JButton>();
		Database database = new Database();
		Nutritionist nut = database.loggedNutritionist();
		ArrayList<Appointment> appoList = database.loadAppointments();
		ArrayList<JTextField> hours = new ArrayList<JTextField>();
		
		JButton day1 = new JButton();
		day1.setBackground(new Color(250, 240, 230));
		day1.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day1.setEnabled(false);
		day1.setText("1");
		days.add(day1);
		day1.setBounds(55, 207, 45, 45);
		contentPane.add(day1);
		
		JButton day2 = new JButton();
		day2.setBackground(new Color(250, 240, 230));
		day2.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day2.setEnabled(false);
		day2.setText("2");
		days.add(day2);
		day2.setBounds(99, 207, 45, 45);
		contentPane.add(day2);
		
		JButton day3 = new JButton();
		day3.setBackground(new Color(250, 240, 230));
		day3.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day3.setEnabled(false);
		day3.setText("3");
		days.add(day3);
		day3.setBounds(143, 207, 45, 45);
		contentPane.add(day3);
		
		JButton day4 = new JButton();
		day4.setBackground(new Color(250, 240, 230));
		day4.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day4.setEnabled(false);
		day4.setText("4");
		days.add(day4);
		day4.setBounds(187, 207, 45, 45);
		contentPane.add(day4);
		
		JButton day5 = new JButton();
		day5.setBackground(new Color(250, 240, 230));
		day5.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day5.setEnabled(false);
		day5.setText("5");
		days.add(day5);
		day5.setBounds(231, 207, 45, 45);
		contentPane.add(day5);
		
		JButton day6 = new JButton();
		day6.setBackground(new Color(250, 240, 230));
		day6.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day6.setEnabled(false);
		day6.setText("6");
		days.add(day6);
		day6.setBounds(275, 207, 45, 45);
		contentPane.add(day6);
		
		JButton day7 = new JButton();
		day7.setBackground(new Color(250, 240, 230));
		day7.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day7.setEnabled(false);
		day7.setText("7");
		days.add(day7);
		day7.setBounds(319, 207, 45, 45);
		contentPane.add(day7);
		
		JButton day8 = new JButton();
		day8.setBackground(new Color(250, 240, 230));
		day8.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day8.setEnabled(false);
		day8.setText("8");
		days.add(day8);
		day8.setBounds(55, 251, 45, 45);
		contentPane.add(day8);
		
		JButton day9 = new JButton();
		day9.setBackground(new Color(250, 240, 230));
		day9.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day9.setEnabled(false);
		day9.setText("9");
		days.add(day9);
		day9.setBounds(99, 251, 45, 45);
		contentPane.add(day9);
		
		JButton day10 = new JButton();
		day10.setBackground(new Color(250, 240, 230));
		day10.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day10.setEnabled(false);
		day10.setText("10");
		days.add(day10);
		day10.setBounds(143, 251, 45, 45);
		contentPane.add(day10);
		
		JButton day11 = new JButton();
		day11.setBackground(new Color(250, 240, 230));
		day11.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day11.setEnabled(false);
		day11.setText("11");
		days.add(day11);
		day11.setBounds(187, 251, 45, 45);
		contentPane.add(day11);
		
		JButton day12 = new JButton();
		day12.setBackground(new Color(250, 240, 230));
		day12.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day12.setEnabled(false);
		day12.setText("12");
		days.add(day12);
		day12.setBounds(231, 251, 45, 45);
		contentPane.add(day12);
		
		JButton day13 = new JButton();
		day13.setBackground(new Color(250, 240, 230));
		day13.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day13.setEnabled(false);
		day13.setText("13");
		days.add(day13);
		day13.setBounds(275, 251, 45, 45);
		contentPane.add(day13);
		
		JButton day14 = new JButton();
		day14.setBackground(new Color(250, 240, 230));
		day14.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day14.setEnabled(false);
		day14.setText("14");
		days.add(day14);
		day14.setBounds(319, 251, 45, 45);
		contentPane.add(day14);
		
		JButton day15 = new JButton();
		day15.setBackground(new Color(250, 240, 230));
		day15.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day15.setEnabled(false);
		day15.setText("15");
		days.add(day15);
		day15.setBounds(55, 295, 45, 45);
		contentPane.add(day15);
		
		JButton day16 = new JButton();
		day16.setBackground(new Color(250, 240, 230));
		day16.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day16.setEnabled(false);
		day16.setText("16");
		days.add(day16);
		day16.setBounds(99, 295, 45, 45);
		contentPane.add(day16);
		
		JButton day17 = new JButton();
		day17.setBackground(new Color(250, 240, 230));
		day17.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day17.setEnabled(false);
		day17.setText("17");
		days.add(day17);
		day17.setBounds(143, 295, 45, 45);
		contentPane.add(day17);
		
		JButton day18 = new JButton();
		day18.setBackground(new Color(250, 240, 230));
		day18.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day18.setEnabled(false);
		day18.setText("18");
		days.add(day18);
		day18.setBounds(187, 295, 45, 45);
		contentPane.add(day18);
		
		JButton day19 = new JButton();
		day19.setBackground(new Color(250, 240, 230));
		day19.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day19.setEnabled(false);
		day19.setText("19");
		days.add(day19);
		day19.setBounds(231, 295, 45, 45);
		contentPane.add(day19);
		
		JButton day20 = new JButton();
		day20.setBackground(new Color(250, 240, 230));
		day20.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day20.setEnabled(false);
		day20.setText("20");
		days.add(day20);
		day20.setBounds(275, 295, 45, 45);
		contentPane.add(day20);
		
		JButton day21 = new JButton();
		day21.setBackground(new Color(250, 240, 230));
		day21.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day21.setEnabled(false);
		day21.setText("21");
		days.add(day21);
		day21.setBounds(319, 295, 45, 45);
		contentPane.add(day21);
		
		JButton day22 = new JButton();
		day22.setBackground(new Color(250, 240, 230));
		day22.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day22.setEnabled(false);
		day22.setText("22");
		days.add(day22);
		day22.setBounds(55, 339, 45, 45);
		contentPane.add(day22);
		
		JButton day23 = new JButton();
		day23.setBackground(new Color(250, 240, 230));
		day23.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day23.setEnabled(false);
		day23.setText("23");
		days.add(day23);
		day23.setBounds(99, 339, 45, 45);
		contentPane.add(day23);
		
		JButton day24 = new JButton();
		day24.setBackground(new Color(250, 240, 230));
		day24.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day24.setEnabled(false);
		day24.setText("24");
		days.add(day24);
		day24.setBounds(143, 339, 45, 45);
		contentPane.add(day24);
		
		JButton day25 = new JButton();
		day25.setBackground(new Color(250, 240, 230));
		day25.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day25.setEnabled(false);
		day25.setText("25");
		days.add(day25);
		day25.setBounds(187, 339, 45, 45);
		contentPane.add(day25);
		
		JButton day26 = new JButton();
		day26.setBackground(new Color(250, 240, 230));
		day26.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day26.setEnabled(false);
		day26.setText("26");
		days.add(day26);
		day26.setBounds(231, 339, 45, 45);
		contentPane.add(day26);
		
		JButton day27 = new JButton();
		day27.setBackground(new Color(250, 240, 230));
		day27.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day27.setEnabled(false);
		day27.setText("27");
		days.add(day27);
		day27.setBounds(275, 339, 45, 45);
		contentPane.add(day27);
		
		JButton day28 = new JButton();
		day28.setBackground(new Color(250, 240, 230));
		day28.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day28.setEnabled(false);
		day28.setText("28");
		days.add(day28);
		day28.setBounds(319, 339, 45, 45);
		contentPane.add(day28);
		
		JButton day29 = new JButton();
		day29.setBackground(new Color(250, 240, 230));
		day29.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day29.setEnabled(false);
		day29.setText("29");
		days.add(day29);
		day29.setBounds(55, 383, 45, 45);
		contentPane.add(day29);
		
		JButton day30 = new JButton();
		day30.setBackground(new Color(250, 240, 230));
		day30.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day30.setEnabled(false);
		day30.setText("30");
		days.add(day30);
		day30.setBounds(99, 383, 45, 45);
		contentPane.add(day30);
		
		JButton day31 = new JButton();
		day31.setBackground(new Color(250, 240, 230));
		day31.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		day31.setEnabled(false);
		day31.setText("31");
		days.add(day31);
		day31.setBounds(143, 383, 45, 45);
		contentPane.add(day31);
		
		JLabel lblNewLabel = new JLabel(" 2022");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel.setBounds(245, 165, 54, 32);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(210, 180, 140));
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CHOOSE", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"}));
		comboBox.setBounds(103, 165, 132, 32);
		contentPane.add(comboBox);
		
		comboBox.addActionListener(new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	for(JButton b: days) {
		    		b.setEnabled(false);
		    		b.setBackground(new Color(250, 240, 230));
		    	}
				for(Appointment a : appoList) {
					if(nut == a.getNutritionist()) {
						String[] date = a.getDate().split("-");
						if(Integer.valueOf(date[1]) == (comboBox.getSelectedIndex())) {
							days.get(Integer.valueOf(date[2])-1).setEnabled(true);
							days.get(Integer.valueOf(date[2])-1).setBackground(new Color(210, 180, 140));
						}
					}
				}
		    }
		});
		
		JButton btnNewButton_1 = new JButton("SIGN OUT");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(210, 180, 140));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					database.logOutNutritionist();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				Login login = new Login();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(NutritionistCalendar.class.getResource("/icons/logout.png")));
		btnNewButton_1.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		btnNewButton_1.setBounds(55, 485, 156, 44);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("09.00");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1.setBounds(438, 165, 45, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("10.00");
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(437, 190, 45, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("11.00");
		lblNewLabel_1_2.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(437, 215, 45, 25);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("12.00");
		lblNewLabel_1_3.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(437, 240, 45, 25);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("13.00");
		lblNewLabel_1_4.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_4.setBounds(437, 265, 45, 25);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("14.00");
		lblNewLabel_1_5.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_5.setBounds(437, 290, 45, 25);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("15.00");
		lblNewLabel_1_6.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_6.setBounds(437, 315, 45, 25);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("16.00");
		lblNewLabel_1_7.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_7.setBounds(437, 340, 45, 25);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("17.00");
		lblNewLabel_1_8.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_8.setBounds(437, 365, 45, 25);
		contentPane.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("18.00");
		lblNewLabel_1_9.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_9.setBounds(437, 390, 45, 25);
		contentPane.add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_10 = new JLabel("19.00");
		lblNewLabel_1_10.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_10.setBounds(437, 415, 45, 25);
		contentPane.add(lblNewLabel_1_10);
		
		hour9 = new JTextField();
		hour9.setBackground(new Color(250, 240, 230));
		hour9.setEditable(false);
		hour9.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour9.setBounds(481, 165, 243, 26);
		contentPane.add(hour9);
		hours.add(hour9);
		hour9.setColumns(10);
		
		hour10 = new JTextField();
		hour10.setBackground(new Color(250, 240, 230));
		hour10.setEditable(false);
		hour10.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour10.setBounds(481, 190, 243, 26);
		contentPane.add(hour10);
		hours.add(hour10);
		hour10.setColumns(10);
		
		hour11 = new JTextField();
		hour11.setBackground(new Color(250, 240, 230));
		hour11.setEditable(false);
		hour11.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour11.setColumns(10);
		hour11.setBounds(481, 215, 243, 26);
		hours.add(hour11);
		contentPane.add(hour11);
		
		hour12 = new JTextField();
		hour12.setBackground(new Color(250, 240, 230));
		hour12.setEditable(false);
		hour12.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour12.setColumns(10);
		hour12.setBounds(481, 240, 243, 26);
		hours.add(hour12);
		contentPane.add(hour12);
		
		hour13 = new JTextField();
		hour13.setBackground(new Color(250, 240, 230));
		hour13.setEditable(false);
		hour13.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour13.setColumns(10);
		hour13.setBounds(481, 265, 243, 26);
		hours.add(hour13);
		contentPane.add(hour13);
		
		hour14 = new JTextField();
		hour14.setBackground(new Color(250, 240, 230));
		hour14.setEditable(false);
		hour14.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour14.setColumns(10);
		hour14.setBounds(481, 290, 243, 26);
		hours.add(hour14);
		contentPane.add(hour14);
		
		hour15 = new JTextField();
		hour15.setBackground(new Color(250, 240, 230));
		hour15.setEditable(false);
		hour15.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour15.setColumns(10);
		hour15.setBounds(481, 315, 243, 26);
		hours.add(hour15);
		contentPane.add(hour15);
		
		hour16 = new JTextField();
		hour16.setBackground(new Color(250, 240, 230));
		hour16.setEditable(false);
		hour16.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour16.setColumns(10);
		hour16.setBounds(481, 340, 243, 26);
		hours.add(hour16);
		contentPane.add(hour16);
		
		hour17 = new JTextField();
		hour17.setBackground(new Color(250, 240, 230));
		hour17.setEditable(false);
		hour17.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour17.setColumns(10);
		hour17.setBounds(481, 365, 243, 26);
		hours.add(hour17);
		contentPane.add(hour17);
		
		hour18 = new JTextField();
		hour18.setBackground(new Color(250, 240, 230));
		hour18.setEditable(false);
		hour18.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour18.setColumns(10);
		hour18.setBounds(481, 390, 243, 26);
		hours.add(hour18);
		contentPane.add(hour18);
		
		hour19 = new JTextField();
		hour19.setBackground(new Color(250, 240, 230));
		hour19.setEditable(false);
		hour19.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		hour19.setColumns(10);
		hour19.setBounds(481, 415, 243, 26);
		hours.add(hour19);
		contentPane.add(hour19);
		
		JLabel tarih = new JLabel("");
		tarih.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		tarih.setBounds(527, 35, 243, 32);
		contentPane.add(tarih);
		
		JLabel lblNewLabel_2 = new JLabel("WELCOME, ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 35));
		lblNewLabel_2.setBounds(45, 35, 186, 64);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel( (nut.getFirstName() + " " + nut.getSurname()).toUpperCase(new Locale("UTF-8")));
		lblNewLabel_3.setForeground(new Color(139, 0, 0));
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.BOLD, 35));
		lblNewLabel_3.setBounds(55, 90, 551, 37);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(NutritionistCalendar.class.getResource("/icons/mainBackground.jpg")));
		lblNewLabel_4.setBounds(0, 0, 922, 615);
		contentPane.add(lblNewLabel_4);
		
		day1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JTextField j : hours)
					j.setText("");
				String date = "2022".concat("-").concat(Integer.toString(comboBox.getSelectedIndex())).concat("-").concat(day1.getText());
				for(Appointment a: appoList) {
					String[] hour = a.getHour().split("\\.");
					Integer index = Integer.valueOf(hour[0]) - 9;
					if(a.getDate().compareTo(date) == 0) {
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
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
						hours.get(index).setText(a.getClient().getFirstName().toUpperCase(new Locale("UTF-8")) + " " + a.getClient().getSurname().toUpperCase(new Locale("UTF-8")));
					}
				}
			}
		});
	}
}
