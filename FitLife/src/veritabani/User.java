package veritabani;

public abstract class User {
    private int id;
    private String firstName;
    private String surname;
    private String password;
    
    public User() {
    }
    
    public User(String firstName, String surname, String password) {
        this.firstName = firstName;
        this.surname = surname;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
