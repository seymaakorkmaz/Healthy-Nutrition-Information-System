package veritabani;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class SleepTrackerScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	int flag=0,x=0;
	Client client;
	Database database;
	DateTimeFormatter dtf;
	LocalDateTime   now;
	String a;
	int target;
	
	public SleepTrackerScreen() throws Exception {
		setTitle("FitLife");
		setIconImage(Toolkit.getDefaultToolkit().getImage(SleepTrackerScreen.class.getResource("/icons/apple.png")));
		
		Database database =  new Database();
		client = database.loggedUser();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 909, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinner.setBounds(253, 213, 66, 41);
		contentPane.add(spinner);
		spinner.setEnabled(false);
		
		dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
    	now = LocalDateTime.now();  
    	a = dtf.format(now);
    	
    	textField = new JTextField();
    	textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(253, 156, 66, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_2.setBounds(58, 320, 357, 34);
		contentPane.add(lblNewLabel_2);


		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(58, 360, 357, 34);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_2_1_1.setBounds(58, 404, 434, 34);
		contentPane.add(lblNewLabel_2_1_1);
		
		
    	SleepTracker tracker = database.loadTracker(client.getUsername());
    	System.out.println(tracker.getTracker());
    	if(tracker.getTracker() != 0) {
    		textField.setText(Integer.toString(tracker.getSleepTarget()));
    		textField.setEditable(false);
    	}else {
    		spinner.setEnabled(true);
    		textField.setEditable(true);
    	}
    	
	     if(database.dayChange(client.getUsername())) {
	    	tracker.setTracker(tracker.getTracker()+1);
	    	spinner.setEnabled(true);
	    	x = 1;
	     }
	     
	     if(tracker.getTracker() != 0) {
             lblNewLabel_2.setText(tracker.getTracker() + "  HOUR(S) YOUR DAILY AVARAGE");
             float ort = (float)tracker.getHour()/(float)tracker.getTracker();
             lblNewLabel_2_1.setText(new DecimalFormat("##.##").format(ort) + "HOUR");
             if(tracker.getHour() < tracker.getSleepTarget()) {
                 float num = ((float)tracker.getSleepTarget() + ort) ;
                 lblNewLabel_2_1_1.setText("YOU HAVE SLEPT " +new DecimalFormat("##.##").format(num) + " HOUR(S) MORE THAN YOUR DAILY GOAL.");
             }else if(tracker.getHour() > tracker.getSleepTarget()) {
                 float num = ((float)tracker.getSleepTarget() - ort) ;
                 lblNewLabel_2_1_1.setText("YOU HAVE SLEPT " +new DecimalFormat("##.##").format(num) + " HOUR(S) LESS THAN YOUR DAILY GOAL.");
             }
         }
	     
		JLabel lblNewLabel = new JLabel("HOW MANY HOURS");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblNewLabel.setBounds(58, 213, 148, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblGnlkUykuHedefi = new JLabel("DAILY SLEEP GOAL: ");
		lblGnlkUykuHedefi.setForeground(new Color(255, 255, 255));
		lblGnlkUykuHedefi.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblGnlkUykuHedefi.setBounds(58, 151, 148, 52);
		contentPane.add(lblGnlkUykuHedefi);
	
		JButton btnNewButton = new JButton("EDIT");
		btnNewButton.setBackground(new Color(255, 255, 255));
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
					try {
						database.changeSleepTarget(client.getUsername(), target);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					textField.setEditable(false);
				}
				
			}
		});
		
		btnNewButton.setBounds(332, 158, 83, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SAVE");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setEditable(false);
				spinner.setEnabled(false);
				try {
					int b=(tracker.getHour() + (Integer)spinner.getValue());
					database.saveSleepTracker(client.getUsername(),b,Integer.parseInt(textField.getText()),a,tracker.getTracker());
					lblNewLabel_2.setText(tracker.getTracker() + " HOURS IS YOUR DAILY GOAL");
			    	float ort = (float)b/(float)tracker.getTracker();
			    	lblNewLabel_2_1.setText(new DecimalFormat("##.##").format(ort) + "HOUR");
				    if(tracker.getTracker() == 8) {
					    database.saveSleepTracker(client.getUsername(),0,0,a,0);
					    textField.setText(""); 
					 }
				} catch (NumberFormatException | SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		btnNewButton_1.setBounds(332, 213, 83, 41);
		contentPane.add(btnNewButton_1);	
		
		JLabel lblNewLabel_1 = new JLabel("WEEKLY FEEDBACK");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 23));
		lblNewLabel_1.setBounds(58, 281, 196, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("SLEEP TRACKER");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.BOLD, 35));
		lblNewLabel_3.setBounds(58, 90, 285, 40);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("HAVE YOU SLEEP TODAY?");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblNewLabel_4.setBounds(58, 236, 196, 18);
		contentPane.add(lblNewLabel_4);
		
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
		btnNewButton_2.setIcon(new ImageIcon(SleepTrackerScreen.class.getResource("/icons/arrow (1).png")));
		btnNewButton_2.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(10, 10, 97, 32);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(SleepTrackerScreen.class.getResource("/icons/sleepBackground.jpg")));
		lblNewLabel_5.setBounds(0, 0, 910, 537);
		contentPane.add(lblNewLabel_5);
		
	}
}
