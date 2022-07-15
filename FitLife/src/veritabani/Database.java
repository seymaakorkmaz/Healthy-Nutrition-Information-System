package veritabani;

import javax.swing.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;

public class Database {
    public ArrayList<Client> clients;
    public ArrayList<Nutritionist> nutritionists;
    public ArrayList<Nutrient> nutrients;
    public ArrayList<Appointment> appointments;
    MySQLConnection myConnection = new MySQLConnection();
    
    public Database() {
        this.clients = new ArrayList<>();
        this.nutritionists = new ArrayList<>();
        this.nutrients = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public ArrayList<Nutritionist> loadNutritionists(){
        try {
            Connection myCon = myConnection.getConnection();
            Statement myStat = myCon.createStatement();
            String sql = "SELECT * FROM database.nutritionists";
            ResultSet resultSet = myStat.executeQuery(sql);
            while(resultSet.next()){
                Nutritionist nutritionist = new Nutritionist(resultSet.getString("nut_id"),resultSet.getString("nut_name"),resultSet.getString("nut_surname"),resultSet.getString("password"));
                nutritionists.add(nutritionist);
                
            }
        }catch (Exception e1) {
            e1.printStackTrace();
        }
        
        return nutritionists;
    }
    
    public ArrayList<Appointment> loadAppointments(){
    	 try {
             Connection myCon = myConnection.getConnection();
             Statement myStat = myCon.createStatement();
             String sql = "SELECT * FROM database.appointments";
             ResultSet resultSet = myStat.executeQuery(sql);

             while(resultSet.next()){
                 Appointment appointment = new Appointment(resultSet.getString("date"),resultSet.getString("hour"),searchClient(resultSet.getString("cli_username")),searchNutritionist(resultSet.getString("nut_id")));
                 appointments.add(appointment);
             }
         }catch (Exception e1) {
             e1.printStackTrace();
         }
         return appointments;
    }

    public ArrayList<Nutrient> loadNutrients(){
        try {
            Connection myCon = myConnection.getConnection();
            Statement myStat = myCon.createStatement();
            String sql = "SELECT * FROM database.nutrients";
            ResultSet resultSet = myStat.executeQuery(sql);
            while(resultSet.next()){
                Nutrient nutrient = new Nutrient(resultSet.getString("name"),resultSet.getInt("calories"),resultSet.getInt("fat"),resultSet.getInt("carbs"),resultSet.getInt("protein"),resultSet.getInt("fiber"),resultSet.getInt("type"));
                nutrients.add(nutrient);
                
            }
        }catch (Exception e1) {
            e1.printStackTrace();
        }
        return nutrients;
    }
    
    public Client loadDietList(Client client) throws Exception {
    	DietList diet = new DietList();
    	Nutrient nutrient = new Nutrient();
    	ArrayList<Nutrient> nutrients = new ArrayList<>();
            Connection myCon = myConnection.getConnection();
            String sql = "SELECT * FROM dietlist where client_username = ?";
            PreparedStatement myStat = myCon.prepareStatement(sql);
            myStat.setString(1, client.getUsername());
            ResultSet resultSet = myStat.executeQuery();
        
        while(resultSet.next()) {
        	nutrient = searchNutrients(resultSet.getString("nutrient_name"));
        	Nutrient nutrient_2 = new Nutrient(nutrient.getName(),nutrient.getCalorie(),nutrient.getFat(),nutrient.getCarbs(),nutrient.getProtein(),nutrient.getFiber(),nutrient.getType());
        	
        	nutrient_2.setRepast(resultSet.getInt("repast"));
        	
        	nutrient_2.setNumber(resultSet.getInt("nutrient_number"));
        	nutrients.add(nutrient_2);
        	
        }
        diet.setNutrients(nutrients);
        client.setDietList(diet);
        
        return client;
        
    }
    
    public Nutrient searchNutrients(String name) {
    	loadNutrients();
    	for(int i= 0; i < nutrients.size();i++) 
    		if(nutrients.get(i).getName().compareTo(name)==0 )
    			return nutrients.get(i);
    		
    	return null;	
    }
    
    public ArrayList<Client> loadClients(){
        try {
            Connection myCon = myConnection.getConnection();
            Statement myStat = myCon.createStatement();
            String sql = "SELECT * FROM database.clients";
            ResultSet resultSet = myStat.executeQuery(sql);

            while(resultSet.next()){
                Client client = new Client(resultSet.getString("cli_name"),resultSet.getString("cli_surname"),resultSet.getString("username"),resultSet.getString("password"),resultSet.getString("email"),resultSet.getString("phoneNumber"),resultSet.getInt("" +
                        "cli_gender"),resultSet.getInt("cli_age"));
                clients.add(client);
            }
        }catch (Exception e1) {
            e1.printStackTrace();
        }
        
        return clients;
    }

    public Client searchClient(String username,String password){
        loadClients();
        for(Client c : clients){
            if((c.getUsername().compareTo(username) == 0) && (c.getPassword().compareTo(password) == 0)) {
                return c;
            }
        }
        return null;
    }
    
    public Client searchClient(String username){
        loadClients();
        for(Client c : clients){
            if((c.getUsername().compareTo(username) == 0)) {
                return c;
            }
        }
        return null;
    }
    
    public boolean isThereUsername(String string) {
    	loadClients();
    	for(Client client : clients)
    		if(client.getUsername().equals(string))
    			return true;
    	return false;
    }
    public boolean dayChange(String username) throws Exception {
    	String d,a;
    	int x=0,y=0;
    	DateTimeFormatter dtf;
    	LocalDateTime   now;
    	 Connection myCon = myConnection.getConnection();
  	   	 String sql_sorgu = "select date from tracker where username = ?" ;
         PreparedStatement myStat = myCon.prepareStatement(sql_sorgu);
         myStat.setString(1, username);
         ResultSet resultSet = myStat.executeQuery();
         
         if(resultSet.next()){
        	d = resultSet.getString(1);
        	dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
        	now = LocalDateTime.now();  
        	a = dtf.format(now);
        	String[] date1 =a.split("-");
        	x = Integer.valueOf(date1[2]);
        	String[] date2 =d.split("-");
        	y = Integer.valueOf(date2[2]);
      	 }
         
         
         if(x == y) {
        	 return false;
         }else {
        	 return true;
         }
		

    }
    
    public SleepTracker loadTracker(String username) throws SQLException, Exception {
    	SleepTracker tracker;
 	   Connection myCon = myConnection.getConnection();
 	   String sql_sorgu = "select * from tracker where username = ?" ;
        PreparedStatement myStat = myCon.prepareStatement(sql_sorgu);
        myStat.setString(1, username);
        ResultSet resultSet = myStat.executeQuery();
        
        if(resultSet.next()){
        	tracker = new SleepTracker(searchClient(username),resultSet.getInt("sleepTarget"),resultSet.getInt("dayNum"),resultSet.getInt("sleep"));
        	return tracker;
     	}
		return null;
      
    }
    
    public WaterTracker loadTracker1(String username) throws SQLException, Exception {
    	WaterTracker tracker;
 	   Connection myCon = myConnection.getConnection();
 	   String sql_sorgu = "select * from tracker where username = ?" ;
        PreparedStatement myStat = myCon.prepareStatement(sql_sorgu);
        myStat.setString(1, username);
        ResultSet resultSet = myStat.executeQuery();
        
        if(resultSet.next()){
        	tracker = new WaterTracker(searchClient(username),resultSet.getInt("waterTarget"),resultSet.getInt("water"));
        	return tracker;
     	}
		return null;
    }
    
    public void saveSleepTracker(String username,int sleep,int sleepTarget,String date,int dayNum) throws SQLException {
		Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "1234");
		String sql = "update tracker set sleep = ? , sleepTarget = ?, date = ?, dayNum = ? where username = ? ";
		PreparedStatement myStat = myCon.prepareStatement(sql);
		myStat.setInt(1, sleep);
	    myStat.setInt(2, sleepTarget);
	    myStat.setString(3, date);
		myStat.setInt(4, dayNum);
		 myStat.setString(5, username);
		myStat.executeUpdate();   
    }
    
    public void saveWaterTracker(String username,int water,int waterTarget,String date,int dayNum) throws SQLException {
    
    	Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "1234");
    	String sql = "update into tracker (username, water, waterTarget, date, dayNum)"
    					+ "values(?,?,?,?,?)";
    	PreparedStatement statement = myCon.prepareStatement(sql);
    	statement.setString(1, username);
    	statement.setInt(2, water);
    	statement.setInt(3, waterTarget);
    	statement.setString(4, date);
    	statement.setInt(5, dayNum);
    	statement.executeUpdate();	
    }
    
    public void changeWaterTarget(String username, int target) throws SQLException {
    	Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "1234");
    	String sql = "update tracker set waterTarget = ? where username = ?";
    	PreparedStatement statement = myCon.prepareStatement(sql);
    	statement.setInt(1, target);
    	statement.setString(2, username);
    	statement.executeUpdate();	
    }
    
    public void changeSleepTarget(String username, int target) throws SQLException {
    	Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "1234");
    	String sql = "update tracker set sleepTarget = ? where username = ?";
    	PreparedStatement statement = myCon.prepareStatement(sql);
    	statement.setInt(1, target);
    	statement.setString(2, username);
    	statement.executeUpdate();	
    }
    
    public void addGlass(String username, int num1) throws SQLException {
    	Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "1234");
    	Statement st = myCon.createStatement();
    	var rs = st.executeQuery("select * from tracker where username = '"+username+"'");
    	if(rs.next()) {
    		System.out.println(rs.getString("water"));
        	st.executeUpdate("UPDATE tracker set water = " + num1+ " WHERE username in ('" +username+"')");	
        	
    	}
    }
    
    public void saveTracker(String username,int sleep, int sleepTarget, int water,int waterTarget,String date,int dayNum) {
     	try {
			Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "1234");
			String sql = "insert into tracker (username, sleep, sleepTarget, water, waterTarget, date, dayNum)"
					+ "values(?,?,?,?,?,?,?)";
			PreparedStatement statement = myCon.prepareStatement(sql);
			statement.setString(1, username);
			statement.setInt(2, sleep);
			statement.setInt(3, sleepTarget);
			statement.setInt(4, water);
			statement.setInt(5, waterTarget);
			statement.setString(6, date);
			statement.setInt(7, dayNum);
			statement.executeUpdate();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
    	
    }
    
    public boolean isThereDietList(String username) throws Exception {
    	int flag=0;
        Connection myCon = myConnection.getConnection();
        String sql = "SELECT * FROM dietlist where client_username = ?";
        PreparedStatement myStat = myCon.prepareStatement(sql);
         myStat.setString(1, username);
            ResultSet resultSet = myStat.executeQuery();
        
        while(resultSet.next()) {
        	flag = 1;
        	
        }
        if(flag == 1) {
        	return true;
        }
        return false;
    }
    
    public void deleteDietList(String username) throws Exception {
    	Connection myCon = myConnection.getConnection();
    	Statement st = myCon.createStatement();
    	var rs = st.executeQuery("select * from dietlist");
    	
    	while(isThereDietList(username)) {
    		st.executeUpdate("DELETE FROM  dietlist WHERE client_username = ('"+username +"')");
    	}
    }
    
  
    public Nutritionist searchNutritionist(String nut_id, String password){
        loadNutritionists();
        for(Nutritionist n : nutritionists){
            if((n.getNutritionistId().compareTo(nut_id) == 0) && (n.getPassword().compareTo(password) == 0)) {
                return n;
            }
        }
        return null;
    }
    
    public Nutritionist searchNutritionist(String nut_id){
        loadNutritionists();
        for(Nutritionist n : nutritionists){
            if((n.getNutritionistId().compareTo(nut_id)) == 0) {
                return n;
            }
        }
        return null;
    }
    
    public boolean clientRegister(Client client) throws Exception{
    	clients.add(client);
    	DateTimeFormatter dtf;
    	LocalDateTime   now;
    	String a;
    	try {
			Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "1234");
			String sql = "insert into database.clients (id, cli_name, cli_surname, cli_gender, cli_age, email, phoneNumber, username, password)"
					+ "values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = myCon.prepareStatement(sql);
			statement.setString(1, Integer.toString(clients.size()));
			statement.setString(2, client.getFirstName());
			statement.setString(3, client.getSurname());
			statement.setString(4, Integer.toString(client.getGender()));
			statement.setString(5, Integer.toString(client.getAge()));
			statement.setString(6, client.getE_mail());
			statement.setString(7, client.getPhoneNumber());
			statement.setString(8, client.getUsername());
			statement.setString(9, client.getPassword());
			statement.executeUpdate();
			JOptionPane.showMessageDialog(null,"Registration Completed");
			dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
        	now = LocalDateTime.now();  
        	a = dtf.format(now);
			saveTracker(client.getUsername(), 0, 0, 0,0, a, 0);
			return true;
		}catch(Exception e1) {
			e1.printStackTrace();
			return false;
		}
    }
    
    public void saveDietList(DietList dietList) throws Exception {
    	Client client = loggedUser();
    	try {
			Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "1234");
			String sql = "insert into dietlist (client_username,nutrient_name, nutrient_number,repast) VALUES (?,?,?,?)";
			PreparedStatement statement = myCon.prepareStatement(sql);
			
			for(int i=0;i<dietList.getNutrients().size();i++) {
					statement.setString(1, client.getUsername());
					statement.setString(2, dietList.getNutrients().get(i).getName());
					statement.setInt(3, dietList.getNutrients().get(i).getNumber());
					statement.setInt(4, dietList.getNutrients().get(i).getRepast());
					statement.executeUpdate();
			}
		
		}catch(Exception e1) {
			e1.printStackTrace();
		}
    }
    
    public boolean bookAppointment(Appointment appointment) throws Exception {
    	appointments.add(appointment);
    	appointment.getNutritionist();
    	try {
			Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "1234");
			String sql = "insert into database.appointments (date,hour, cli_username, nut_id) VALUES (?,?,?,?)";
			PreparedStatement statement = myCon.prepareStatement(sql);
			//statement.setString(1, Integer.toString(appointments.size()));
			statement.setString(1, appointment.getDate());
			statement.setString(2, appointment.getHour());
			statement.setString(3, appointment.getClient().getUsername());
			statement.setString(4, appointment.getNutritionist().getNutritionistId());
			statement.executeUpdate();
			return true;
		}catch(Exception e1) {
			e1.printStackTrace();
			return false;
		}
    	
    }

    public Appointment isThereAppointmentForNutritionist(Nutritionist n, String date ,String hour) {
    	loadAppointments();
    	for(Appointment a : appointments)
    			if(a.getNutritionist().getNutritionistId().compareTo(n.getNutritionistId())==0)
    				if((a.getDate().compareTo(date)) == 0)
    					if(a.getHour().compareTo(hour) == 0)
    			   			return a;
    	return  null;
    }
    
    public Appointment isThereAppointmentForClient(Client c, String date ,String hour) {
    	loadAppointments();
    	for(Appointment a : appointments)
    			if(a.getClient().getUsername().compareTo(c.getUsername())==0)
    				if((a.getDate().compareTo(date)) == 0)
    					if(a.getHour().compareTo(hour) == 0)
    			   			return a;
    	return  null;
    }

    public String[] getNutritionistsName() {
    	String name[] = new String[nutritionists.size()+1];
    	name[0] = "choose";
    	for(int i=1;i<=nutritionists.size();i++)
    		name[i] = nutritionists.get(i-1).getNutritionistId().concat(" - ").concat(nutritionists.get(i-1).getFirstName().concat(" ").concat(nutritionists.get(i-1).getSurname()));
    	
    	return name;
    }
    
    public void saveLoggedUser(Client client) throws Exception  { 
    	Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "1234");
    	String sql_sorgu;
    	sql_sorgu = "update clients set isLoggedUser = ? where username = ?" ;
    	PreparedStatement myStat = myCon.prepareStatement(sql_sorgu);
    	myStat.setInt  (1, 1);
    	myStat.setString(2, client.getUsername());
    	myStat.executeUpdate();
    	myCon.close();
    }
    
    public Client loggedUser() throws Exception {
	   Connection myCon = myConnection.getConnection();
	   String sql_sorgu = "select username from clients where isLoggedUser = ?" ;
       PreparedStatement myStat = myCon.prepareStatement(sql_sorgu);
       myStat.setInt(1, 1);
       ResultSet resultSet = myStat.executeQuery();
       
       if(resultSet.next()){
    	   return searchClient(resultSet.getString(1));
    	}
       return null;
    }
    
    public void logOut() throws Exception {
    	Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "1234");
    	String sql_sorgu;
    	sql_sorgu = "update clients set isLoggedUser = ? where isLoggedUser = ?" ;
    	PreparedStatement myStat = myCon.prepareStatement(sql_sorgu);
    	myStat.setInt  (1, 0);
    	myStat.setInt(2, 1);
    	myStat.executeUpdate();
    	myCon.close();
    }
    
    public Nutritionist loggedNutritionist() throws Exception {
 	   Connection myCon = myConnection.getConnection();
 	   String sql_sorgu = "select nut_id from nutritionists where isLoggedUser = ?" ;
        PreparedStatement myStat = myCon.prepareStatement(sql_sorgu);
        myStat.setInt(1, 1);
        ResultSet resultSet = myStat.executeQuery();
        
        if(resultSet.next()){
     	   return searchNutritionist(resultSet.getString(1));
     	}
        return null;
     }
    
    public void saveLoggedNutritionist(Nutritionist nutritionist) throws Exception  { 
    	Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "1234");
    	String sql_sorgu;
    	sql_sorgu = "update nutritionists set isLoggedUser = ? where nut_id = ?" ;
    	PreparedStatement myStat = myCon.prepareStatement(sql_sorgu);
    	myStat.setInt  (1, 1);
    	myStat.setString(2, nutritionist.getNutritionistId());
    	myStat.executeUpdate();
    	myCon.close();
    }
    
    public void logOutNutritionist() throws Exception {
    	Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "1234");
    	String sql_sorgu;
    	sql_sorgu = "update nutritionists set isLoggedUser = ? where isLoggedUser = ?" ;
    	PreparedStatement myStat = myCon.prepareStatement(sql_sorgu);
    	myStat.setInt  (1, 0);
    	myStat.setInt(2, 1);
    	myStat.executeUpdate();
    	myCon.close();
    }
    
}
