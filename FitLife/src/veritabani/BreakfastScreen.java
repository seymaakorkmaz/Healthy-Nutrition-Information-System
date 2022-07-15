package veritabani;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class BreakfastScreen extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Client client = new Client();
	ArrayList<JLabel> labels,labels_1,labels_2;
	ArrayList<JSpinner> spinners;
	ArrayList<Nutrient> nutrients;
	ArrayList<Nutrient> nutrients_1 = new ArrayList<>();
	SpinnerNumberModel model,model_1;
	DietList diet = new DietList();
	int j,k,l,m,n,flag=0;
	double calorie,carb,protein,fat;
	double topCalorie=0, topCarb=0, topProtein=0, topFat=0;
	public static int x=0;
	String text;
	ArrayList<String> foods;
	Calculations calculation;
	public BreakfastScreen(int gender, int activity, int aim, int age, int height, int weight) throws Exception {
		setIconImage(Toolkit.getDefaultToolkit().getImage(BreakfastScreen.class.getResource("/icons/apple.png")));
		setTitle("FitLife");
		Database database = new Database();
		client = database.loggedUser();
		nutrients = database.loadNutrients();
		calculation = new Calculations();
		float h = height;
		foods = new ArrayList<>();
		labels = new ArrayList<JLabel>();
		labels_1 = new ArrayList<JLabel>();
		spinners = new ArrayList<>();
		labels_2 = new ArrayList<>();
		calorie = calculation.idealCalorie(weight,h , age, activity, aim, gender);
		carb = calculation.idealCarb(weight, h, age, activity, aim, gender);
		protein = calculation.idealProtein(weight, h, age, activity, aim, gender);
		fat = calculation.idealFat(weight, h, age, activity, aim, gender);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(253, 245, 230));
		panel.setBounds(20, 46, 170, 530);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(253, 245, 230));
		panel_1.setBounds(200, 46, 170, 530);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(253, 245, 230));
		panel_1_1.setBounds(380, 46, 170, 530);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(253, 245, 230));
		panel_1_2.setBounds(560, 46, 170, 530);
		contentPane.add(panel_1_2);
		panel_1_2.setLayout(null);
		
	
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setBackground(new Color(253, 245, 230));
		panel_1_2_1.setBounds(740, 46, 186, 530);
		contentPane.add(panel_1_2_1);
		panel_1_2_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(253, 245, 230));
		panel_2.setBounds(965, 97, 170, 481);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		j = 0;
		k = 0;
		l = 0;
		m = 0;
		n = 0;
		
		for(int i = 0; i < nutrients.size(); i++) {
			labels.add(new JLabel(nutrients.get(i).getName()));
			labels.get(i).setBackground(new Color(245, 222, 179));
			labels.get(i).setOpaque(true);
			spinners.add(new JSpinner());
			if(nutrients.get(i).getType() == 1) {
				labels.get(i).setBounds(20,j*30, 115, 28);
				spinners.get(i).setBounds(135, j*30 , 35, 28);
				spinners.get(i).setModel(new SpinnerNumberModel(0, 0, 10, 1));
				panel.add(labels.get(i));
				panel.add(spinners.get(i));
				j++;
			}else if(nutrients.get(i).getType() == 2) {
				labels.get(i).setBounds(20,k*30, 115, 28);
				spinners.get(i).setBounds(135, k*30 , 35, 28);
				spinners.get(i).setModel(new SpinnerNumberModel(0, 0, 10, 1));
				panel_1.add(labels.get(i));
				panel_1.add(spinners.get(i));
				k++;
			}else if(nutrients.get(i).getType() == 3) {
				labels.get(i).setBounds(20,l*30, 115, 28);
				spinners.get(i).setBounds(135, l*30 , 35, 28);
				spinners.get(i).setModel(new SpinnerNumberModel(0, 0, 10, 1));
				panel_1_1.add(labels.get(i));
				panel_1_1.add(spinners.get(i));
				l++;
			}else if(nutrients.get(i).getType() == 4) {
				labels.get(i).setBounds(20, m*30, 115, 28);
				spinners.get(i).setBounds(135, m*30 , 35, 28);
				spinners.get(i).setModel(new SpinnerNumberModel(0, 0, 10, 1));
				panel_1_2.add(labels.get(i));
				panel_1_2.add(spinners.get(i));
				m++;
			}else if(nutrients.get(i).getType() == 5){
				labels.get(i).setBounds(20, n*30, 115, 28);
				spinners.get(i).setBounds(135, n*30 , 35, 28);
				spinners.get(i).setModel(new SpinnerNumberModel(0, 0, 10, 1));
				panel_1_2_1.add(labels.get(i));
				panel_1_2_1.add(spinners.get(i));
				n++;
			}
		}	
	
		JButton btnSave_1 = new JButton("SAVE");
		btnSave_1.setBackground(new Color(245, 222, 179));
		btnSave_1.addActionListener(new ActionListener() {
			Nutrient temp;
			public void actionPerformed(ActionEvent e) {
				int i;
				flag = 1;
				for(i = 0; i < nutrients.size(); i++) {
					if(((Integer)spinners.get(i).getValue()) > 0) {
						temp = nutrients.get(i);
						if(isThere(nutrients.get(i).getName()) == -1){
							labels_1.add(new JLabel(nutrients.get(i).getName()));
							labels_2.add(new JLabel(" X " + (Integer)spinners.get(i).getValue()));
							
							labels_1.get(x).setBackground(new Color(245, 222, 179));
							labels_1.get(x).setOpaque(true);
							contentPane.add(labels_1.get(x));
							labels_1.get(x).setBounds(20,x*30,115,28);
							panel_2.add(labels_1.get(x));
							
							labels_2.get(x).setBackground(new Color(245, 222, 179));
							labels_2.get(x).setOpaque(true);
							contentPane.add(labels_2.get(x));
							labels_2.get(x).setBounds(136,x*30,35,28);
							panel_2.add(labels_2.get(x));
					
							temp.setNumber(((Integer)spinners.get(i).getValue()));
							topCalorie += temp.getCalorie()*((Integer)spinners.get(i).getValue());
							topCarb += temp.getCarbs()*((Integer)spinners.get(i).getValue());
							topFat += temp.getFat()*((Integer)spinners.get(i).getValue());
							topProtein += temp.getProtein()*((Integer)spinners.get(i).getValue());
							
							x++;
						}else if( isThere(nutrients.get(i).getName()) != -1) {
							int a =isThere(nutrients.get(i).getName());
							labels_2.get(a).setText(" X " + (Integer)spinners.get(i).getValue());
							labels_1.get(a).setVisible(true);
							labels_2.get(a).setVisible(true);
							
							topCalorie -= temp.getCalorie()*(temp.getNumber() - ((Integer)spinners.get(i).getValue()));
							topCarb -= temp.getCarbs()*(temp.getNumber() - ((Integer)spinners.get(i).getValue()));
							topFat -= temp.getFat()*(temp.getNumber() - ((Integer)spinners.get(i).getValue()));
							topProtein -= temp.getProtein()*(temp.getNumber() - ((Integer)spinners.get(i).getValue()));
							temp.setNumber(((Integer)spinners.get(i).getValue()));
						}
					}else if(((Integer)spinners.get(i).getValue()) == 0 && isThere(nutrients.get(i).getName()) != -1) {
						int a = isThere(nutrients.get(i).getName());
						labels_1.get(a).setVisible(false);
						labels_2.get(a).setVisible(false);
						
						topCalorie -= temp.getCalorie();
						topCarb -= temp.getCarbs();
						topFat -= temp.getFat();
						topProtein -= temp.getProtein();
					}
				}
				if((topCalorie + temp.getCalorie()) > calorie) {
					JOptionPane.showMessageDialog(null,"You've reached your calorie limit.");
				}
				if((topCarb + temp.getCarbs()) > carb) {
					JOptionPane.showMessageDialog(null,"You've reached your daily carbohydrate limit.");
				}
				if((topFat + temp.getFat()) > fat) {
					JOptionPane.showMessageDialog(null,"You've reached your daily fat limit.");
				}
				if((topProtein + temp.getProtein()) > protein) {
					JOptionPane.showMessageDialog(null,"You've reached your daily protein limit.");
				}
			}
		});
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.setIcon(new ImageIcon(BreakfastScreen.class.getResource("/icons/next.png")));
		btnNewButton.setBackground(new Color(245, 222, 179));
		btnNewButton.addActionListener(new ActionListener() {
			Nutrient temp;
			public void actionPerformed(ActionEvent e) {
				if(flag == 0) {
					JOptionPane.showMessageDialog(null, "Please save your list first.");
				}else if(flag == 1){
					for(int i = 0; i < nutrients.size(); i++) {
						if(((Integer)spinners.get(i).getValue()) > 0) {
							temp = nutrients.get(i);
							temp.setRepast(1);
							temp.setNumber((Integer)spinners.get(i).getValue());
							nutrients_1.add(temp);
						}
					}
					diet.setNutrients(nutrients_1);
					client.setDietList(diet);
					LunchScreen lunch;
					try {
						lunch = new LunchScreen(client,gender, activity, aim, age, height, weight,topCalorie,topCarb,topFat,topProtein);
						lunch.setVisible(true);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					dispose();
				}
			}
		});
		
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton.setBounds(1059, 586, 115, 48);
		contentPane.add(btnNewButton);
	
		btnSave_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnSave_1.setBounds(943, 586, 115, 48);
		contentPane.add(btnSave_1);
		
		JLabel lblNewLabel = new JLabel("CARBOHYDRATE");
		lblNewLabel.setIcon(new ImageIcon(BreakfastScreen.class.getResource("/icons/wheat.png")));
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 17, 170, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblYa = new JLabel("FAT");
		lblYa.setIcon(new ImageIcon(BreakfastScreen.class.getResource("/icons/trans-fat.png")));
		lblYa.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblYa.setHorizontalAlignment(SwingConstants.CENTER);
		lblYa.setBounds(200, 17, 170, 25);
		contentPane.add(lblYa);
		
		JLabel lblProtein = new JLabel("PROTEIN");
		lblProtein.setIcon(new ImageIcon(BreakfastScreen.class.getResource("/icons/protein.png")));
		lblProtein.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblProtein.setHorizontalAlignment(SwingConstants.CENTER);
		lblProtein.setBounds(380, 17, 170, 25);
		contentPane.add(lblProtein);
	
		JLabel lblMeyveSebze = new JLabel("FRUITS AND VEGETABLES");
		lblMeyveSebze.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblMeyveSebze.setHorizontalAlignment(SwingConstants.CENTER);
		lblMeyveSebze.setBounds(571, 17, 170, 25);
		contentPane.add(lblMeyveSebze);
		
		JLabel lblIecek = new JLabel("DRINK");
		lblIecek.setIcon(new ImageIcon(BreakfastScreen.class.getResource("/icons/drink.png")));
		lblIecek.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblIecek.setHorizontalAlignment(SwingConstants.CENTER);
		lblIecek.setBounds(740, 17, 186, 25);
		contentPane.add(lblIecek);
	
		
		JLabel lblKahvalt = new JLabel("BREAKFAST");
		lblKahvalt.setIcon(new ImageIcon(BreakfastScreen.class.getResource("/icons/breakfast (1).png")));
		lblKahvalt.setForeground(new Color(0, 0, 0));
		lblKahvalt.setFont(new Font("Tw Cen MT", Font.BOLD, 24));
		lblKahvalt.setHorizontalAlignment(SwingConstants.CENTER);
		lblKahvalt.setBounds(951, 56, 223, 44);
		contentPane.add(lblKahvalt);
		
		JLabel lblNewLabel_1 = new JLabel("Please save your list before going next");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(953, 640, 219, 13);
		contentPane.add(lblNewLabel_1);

	}	
	
	public int isThere(String text) {
		for(int j=0;j<labels_1.size();j++) {
			if(text.compareTo(labels_1.get(j).getText())==0) {
				return j;
			}
		}
		return -1;
	}
}

		
		
	
	

	
	



