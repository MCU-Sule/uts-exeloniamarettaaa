package Model;

public class user {
    private int userid;
    private String Username;
    private String password;

    public user(int userid, String Username, String password){
        this.userid=userid;
        this.Username=Username;
        this.password=password;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
