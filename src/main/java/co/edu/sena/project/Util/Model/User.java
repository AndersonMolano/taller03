package co.edu.sena.project.Util.Model;

public class   User {
    private Integer user_id;
    private String user_fistmame;
    private String user_Lastname;
    private String user_email;
    private String password;


    public User() {
    }

    public User(Integer user_id, String user_fistmame, String user_Lastname, String user_email, String password) {
        this.user_id = user_id;
        this.user_fistmame = user_fistmame;
        this.user_Lastname = user_Lastname;
        this.user_email = user_email;
        this.password = password;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public String getUser_fistmame() {
        return user_fistmame;
    }

    public String getUser_Lastname() {
        return user_Lastname;
    }

    public String getUser_email() {
        return user_email;
    }

    public String getPassword() {
        return password;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setUser_fistmame(String user_fistmame) {
        this.user_fistmame = user_fistmame;
    }

    public void setUser_Lastname(String user_Lastname) {
        this.user_Lastname = user_Lastname;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_fistmame='" + user_fistmame + '\'' +
                ", user_Lastname='" + user_Lastname + '\'' +
                ", user_email='" + user_email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
