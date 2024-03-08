package objectbasic.bank;

public class User {

    private long userId;
    private String username;
    private String gender;
    private String password;

    public User(long userId, String username, String gender, String password) {
        this.userId = userId;
        this.username = username;
        this.gender = gender;
        this.password = password;
    }

    public void saveUser(){
        // password is encrypted first anda saved to database
    }

    public boolean checkPassword(String passwordToCheck){
        // check the password
        return this.password == passwordToCheck;
    }
}
