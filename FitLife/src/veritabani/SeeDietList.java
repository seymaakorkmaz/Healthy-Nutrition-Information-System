package veritabani;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class SeeDietList extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Client client_1;
	ArrayList<JLabel> labels = new ArrayList<>();
	ArrayList<JLabel> labels_1 = new ArrayList<>();
	int j,k,l,m;
	
	public SeeDietList(Client client) throws Exception {
		setTitle("FitLife");
		setIconImage(Toolkit.getDefaultToolkit().getImage(SeeDietList.class.getResource("/icons/apple.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 726);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		btnNewButton_2.setIcon(new ImageIcon(SeeDietList.class.getResource("/icons/arrow (1).png")));
		btnNewButton_2.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		btnNewButton_2.setBackground(SystemColor.controlHighlight);
		btnNewButton_2.setBounds(10, 10, 97, 32);
		contentPane.add(btnNewButton_2);
		JLabel lblNewLabel = new JLabel("YOUR DIET LIST");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 35));
		lblNewLabel.setBounds(304, 10, 303, 74);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(60, 115, 180, 484);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setLayout(null);
		panel_1.setBounds(270, 115, 180, 484);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.controlHighlight);
		panel_2.setLayout(null);
		panel_2.setBounds(480, 115, 180, 484);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.controlHighlight);
		panel_3.setLayout(null);
		panel_3.setBounds(690, 115, 180, 484);
		contentPane.add(panel_3);
		j=0;
		k=0;
		l=0;
		m=0;
		
		for(int i=0;i<client.getDietList().getNutrients().size();i++) {
			labels.add(new JLabel(client.getDietList().getNutrients().get(i).getName()));
			labels.get(i).setBackground(SystemColor.controlHighlight);
			labels.get(i).setOpaque(true);
			labels_1.add(new JLabel(" X " + client.getDietList().getNutrients().get(i).getNumber()));
			labels_1.get(i).setBackground(SystemColor.controlHighlight);
			labels_1.get(i).setOpaque(true);
			if(client.getDietList().getNutrients().get(i).getRepast() == 1) {
				labels.get(i).setBounds(15,j*30, 115, 28);
				contentPane.add(labels.get(i));
				panel.add(labels.get(i));
				labels_1.get(i).setBounds(130, j*30 , 35, 28);
				contentPane.add(labels_1.get(i));
				panel.add(labels_1.get(i));
				j++;
			}else if(client.getDietList().getNutrients().get(i).getRepast() == 2) {
				labels.get(i).setBounds(15,k*30, 115, 28);
				contentPane.add(labels.get(i));
				panel_1.add(labels.get(i));
				labels_1.get(i).setBounds(130, k*30 , 35, 28);
				contentPane.add(labels_1.get(i));
				panel_1.add(labels_1.get(i));
				k++;
			}else if(client.getDietList().getNutrients().get(i).getRepast() == 3) {
				labels.get(i).setBounds(15,l*30, 115, 28);
				contentPane.add(labels.get(i));
				panel_2.add(labels.get(i));
				labels_1.get(i).setBounds(130, l*30 , 35, 28);
				contentPane.add(labels_1.get(i));
				panel_2.add(labels_1.get(i));
				l++;
			}
			else if(client.getDietList().getNutrients().get(i).getRepast() == 4) {
				labels.get(i).setBounds(15, m*30, 115, 28);
				contentPane.add(labels.get(i));
				panel_3.add(labels.get(i));
				labels_1.get(i).setBounds(130, m*30 , 35, 28);
				contentPane.add(labels_1.get(i));
				panel_3.add(labels_1.get(i));
				m++;
			}
		}
		
		JLabel lblNewLabel_1 = new JLabel("BREAKFAST");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(60, 80, 180, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("LUNCH");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(270, 80, 180, 38);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("DINNER");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(480, 80, 180, 38);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("SNACKS");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(690, 80, 180, 38);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(SeeDietList.class.getResource("/icons/seebackground.png")));
		lblNewLabel_2.setBounds(0, 0, 950, 726);
		contentPane.add(lblNewLabel_2);
	}
}
