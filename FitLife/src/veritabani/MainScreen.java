package veritabani;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Locale;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class MainScreen extends JFrame {
	Client client = new Client();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public MainScreen() throws Exception {
		Database database = new Database();
		client = database.loggedUser();
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainScreen.class.getResource("/icons/apple.png")));
		setTitle("FitLife");
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 922, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel( (client.getFirstName() + " " + client.getSurname()).toUpperCase(new Locale("UTF-8")));
		lblNewLabel_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 40));
		lblNewLabel_2.setBounds(55, 78, 561, 37);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("WELCOME, ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 40));
		lblNewLabel.setBounds(53, 10, 200, 81);
		contentPane.add(lblNewLabel);
		
		JButton btnWater = new JButton("WATER TRACKER");
		btnWater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					WaterTrackerScreen wTracker = new WaterTrackerScreen();
					wTracker.setVisible(true);
					dispose();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnWater.setBackground(new Color(204, 153, 102));
		btnWater.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnWater.setBounds(313, 435, 191, 33);
		btnWater.setVisible(false);
		contentPane.add(btnWater);
		
		JButton btnSleep = new JButton("SLEEP TRACKER");
		btnSleep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					SleepTrackerScreen sTracker = new SleepTrackerScreen();
					sTracker.setVisible(true);
					dispose();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnSleep.setBackground(new Color(204, 153, 102));
		btnSleep.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnSleep.setBounds(313, 395, 191, 33);
		btnSleep.setVisible(false);
		contentPane.add(btnSleep);
		
		JButton btnBookApntmnt = new JButton("BOOK APPOINTMENT");
		btnBookApntmnt.setVisible(false);
		btnBookApntmnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppointmentScreen app;
				try {
					app = new AppointmentScreen();
					app.setVisible(true);
				} catch (ParseException e1) {
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnBookApntmnt.setBackground(new Color(204, 153, 102));
		btnBookApntmnt.setForeground(new Color(0, 0, 0));
		btnBookApntmnt.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnBookApntmnt.setBounds(313, 160, 191, 33);
		contentPane.add(btnBookApntmnt);
		
		JButton btnSeeApntmnt = new JButton("SEE APPOINTMENTS");
		btnSeeApntmnt.setBackground(new Color(204, 153, 102));
		btnSeeApntmnt.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnSeeApntmnt.setVisible(false);
		btnSeeApntmnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				SeeAppointmentsScreen app;
				try {
					app = new SeeAppointmentsScreen();
					app.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();

			}
		});
		btnSeeApntmnt.setBounds(313, 195, 191, 33);
		contentPane.add(btnSeeApntmnt);
		
		JButton btnSeeDetLst = new JButton("SEE DIET LIST");
		btnSeeDetLst.setBackground(new Color(204, 153, 102));
		btnSeeDetLst.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnSeeDetLst.setBounds(313, 238, 191, 33);
		btnSeeDetLst.setVisible(false);
		btnSeeDetLst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					client = database.loadDietList(database.loggedUser());
					SeeDietList screen = new SeeDietList(client);
					screen.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		contentPane.add(btnSeeDetLst);
		
		JButton btnMakeDetLst = new JButton("MAKE A DIET LIST");
		btnMakeDetLst.setVisible(false);
		btnMakeDetLst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DietListInformationScreen app;
				try {
					if(database.isThereDietList(client.getUsername())) {
						database.deleteDietList(client.getUsername());
						JOptionPane.showMessageDialog(null,"You are already have a diet list, Your existing diet list will be deleted.");
					}
					app = new DietListInformationScreen();
					app.setVisible(true);
					
				} catch (ParseException e1) {
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}			
		});
		btnMakeDetLst.setBackground(new Color(204, 153, 102));
		btnMakeDetLst.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnMakeDetLst.setBounds(313, 273, 191, 33);
		contentPane.add(btnMakeDetLst);
		
		JButton btnAppointment = new JButton("  APPOINTMENT");
		btnAppointment.setIcon(new ImageIcon(MainScreen.class.getResource("/icons/appointment.png")));
		btnAppointment.setBackground(new Color(210, 180, 140));
		btnAppointment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnWater.setVisible(false);
				btnSleep.setVisible(false);
				btnSeeDetLst.setVisible(false);
				btnMakeDetLst.setVisible(false);
				btnBookApntmnt.setVisible(true);
				btnSeeApntmnt.setVisible(true);
			}
		});
		btnAppointment.setForeground(new Color(0, 0, 0));
		btnAppointment.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnAppointment.setBounds(55, 160, 248, 68);
		contentPane.add(btnAppointment);
		
		JButton btnDetLst = new JButton(" DIET LIST");
		btnDetLst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnWater.setVisible(false);
				btnSleep.setVisible(false);
				btnBookApntmnt.setVisible(false);
				btnSeeApntmnt.setVisible(false);
				btnSeeDetLst.setVisible(true);
				btnMakeDetLst.setVisible(true);
			}
		});
		btnDetLst.setIcon(new ImageIcon(MainScreen.class.getResource("/icons/diet.png")));
		btnDetLst.setBackground(new Color(210, 180, 140));
		btnDetLst.setForeground(new Color(0, 0, 0));
		btnDetLst.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnDetLst.setBounds(55, 238, 248, 68);
		contentPane.add(btnDetLst);
		
		JButton btnCalculatons = new JButton("  CALCULATIONS");
		btnCalculatons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CalculationsScreen calculate = new CalculationsScreen();
					calculate.setVisible(true);
					dispose();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				btnWater.setVisible(false);
				btnSleep.setVisible(false);
				btnBookApntmnt.setVisible(false);
				btnSeeApntmnt.setVisible(false);
				btnSeeDetLst.setVisible(false);
				btnMakeDetLst.setVisible(false);
			}
		});
		btnCalculatons.setIcon(new ImageIcon(MainScreen.class.getResource("/icons/nutrient.png")));
		btnCalculatons.setBackground(new Color(210, 180, 140));
		btnCalculatons.setForeground(new Color(0, 0, 0));
		btnCalculatons.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnCalculatons.setBounds(55, 316, 248, 68);
		contentPane.add(btnCalculatons);
		
		JButton btnSgnOut = new JButton("  SIGN OUT");
		btnSgnOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					database.logOut();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				Login login = new Login();
				login.setVisible(true);
				dispose();
			}
		});
		btnSgnOut.setIcon(new ImageIcon(MainScreen.class.getResource("/icons/logout.png")));
		btnSgnOut.setBackground(new Color(210, 180, 140));
		btnSgnOut.setForeground(new Color(0, 0, 0));
		btnSgnOut.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnSgnOut.setBounds(55, 480, 248, 68);
		contentPane.add(btnSgnOut);
		
		JButton btnTracker = new JButton("TRACKERS");
		btnTracker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnWater.setVisible(true);
				btnSleep.setVisible(true);
				btnBookApntmnt.setVisible(false);
				btnSeeApntmnt.setVisible(false);
				btnSeeDetLst.setVisible(false);
				btnMakeDetLst.setVisible(false);
			}
		});
		btnTracker.setIcon(new ImageIcon(MainScreen.class.getResource("/icons/glass-of-water.png")));
		btnTracker.setForeground(new Color(0, 0, 0));
		btnTracker.setBackground(new Color(210, 180, 140));
		btnTracker.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnTracker.setBounds(55, 395, 248, 73);
		contentPane.add(btnTracker);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MainScreen.class.getResource("/icons/mainBackground.jpg")));
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 0, 922, 615);
		contentPane.add(lblNewLabel_1);
	}
}
	
					
				
