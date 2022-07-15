package veritabani;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class WaterTrackerScreen extends JFrame {

	private JPanel contentPane;
	Database database;
	Client client;
	int flag=0;
	int target;
	DateTimeFormatter dtf;
	LocalDateTime   now;
	String a;
	WaterTracker tracker;
	private JButton btnNewButton_2;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	int count = 0 ;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JButton btnNewButton_4;
	private JLabel lblNewLabel_7;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public WaterTrackerScreen() throws Exception {
		setTitle("FitLife");
		setIconImage(Toolkit.getDefaultToolkit().getImage(WaterTrackerScreen.class.getResource("/icons/apple.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);

		database = new Database();
		client = database.loggedUser();
	
		   
        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(173, 122, 53, 33);
		contentPane.add(textField);
		textField.setColumns(10); 
		
		dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
    	now = LocalDateTime.now();  
    	a = dtf.format(now);
		tracker = database.loadTracker1(client.getUsername());
		
		textField.setText(""+tracker.getWaterTarget());
		textField.setEditable(false);
		
        if(database.dayChange(client.getUsername())) {
        	database.saveWaterTracker(client.getUsername(),0,0,a,0);
	    }
        
        
    	lblNewLabel_3 = new JLabel("DAILY FEEDBACK");
    	lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_3.setBounds(58, 272, 241, 33);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("THE NUMBER OF GLASSES YOU DRINK TODAY: " +tracker.getGlassNum());
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		lblNewLabel_4.setBounds(58, 229, 330, 33);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(58, 315, 241, 33);
		contentPane.add(lblNewLabel_5);
		
		if(tracker.getGlassNum() < tracker.getWaterTarget())
			lblNewLabel_5.setText("YOU DRANK " + (tracker.getWaterTarget()-tracker.getGlassNum()) + "GLASS LESS THAN YOUR GOAL");
		else if(tracker.getGlassNum() > tracker.getWaterTarget())
			lblNewLabel_5.setText("YOU DRANK " + (tracker.getWaterTarget()-tracker.getGlassNum()) + "GLASS MORE THAN YOUR GOAL");
		
		JButton btnNewButton = new JButton("EDIT");
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag==0) {
					textField.setEditable(true);
					btnNewButton.setText("SAVE");
					btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
					flag=1;
				}else if(flag == 1) {
					target =Integer.parseInt(textField.getText());
					btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
					btnNewButton.setText("SAVE");
					try {
						database.changeWaterTarget(client.getUsername(), target);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					textField.setEditable(false);
				}
				
			}
		});
		btnNewButton.setBounds(236, 124, 68, 33);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("DAILY GOAL:");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(58, 116, 105, 42);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel(""+tracker.getGlassNum());
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(144, 181, 68, 33);
		contentPane.add(lblNewLabel_2);
		btnNewButton_1 = new JButton("+");
		btnNewButton_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					database.addGlass(client.getUsername(), tracker.getGlassNum()+1);
					tracker = database.loadTracker1(client.getUsername());
					
					lblNewLabel_2.setText("" + (tracker.getGlassNum()));
				}catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(222, 181, 47, 33);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_3 = new JButton("-");
		btnNewButton_3.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
					database.addGlass(client.getUsername(), tracker.getGlassNum()-1);
					tracker = database.loadTracker1(client.getUsername());
					
					lblNewLabel_2.setText("" + (tracker.getGlassNum()));
				} catch (SQLException e1) {
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setBounds(87, 181, 47, 33);
		contentPane.add(btnNewButton_3);
		
		lblNewLabel_6 = new JLabel("WATER TRACKER");
		lblNewLabel_6.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		lblNewLabel_6.setBounds(58, 64, 221, 42);
		contentPane.add(lblNewLabel_6);
		
		btnNewButton_4 = new JButton("BACK");
		btnNewButton_4.addActionListener(new ActionListener() {
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
		btnNewButton_4.setIcon(new ImageIcon(WaterTrackerScreen.class.getResource("/icons/arrow (1).png")));
		btnNewButton_4.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setBounds(10, 10, 97, 32);
		contentPane.add(btnNewButton_4);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(WaterTrackerScreen.class.getResource("/icons/WaterBackground.png")));
		lblNewLabel_7.setBounds(0, 0, 762, 465);
		contentPane.add(lblNewLabel_7);
	}
}
