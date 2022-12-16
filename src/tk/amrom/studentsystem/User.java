package tk.amrom.studentsystem;

public class User {
    //属性：用户名、密码、身份证号码、手机号码
    private String username;
    private String password;
    private String personID;
    private String phoneNumber;

    //空参构造
    public User(){

    }

    //全参构造
    public User(String username,String password, String personID, String phoneNumber ){
        this.username = username;
        this.password = password;
        this.personID = personID;
        this.phoneNumber = phoneNumber;

    }

    //get/set方法
    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void setPersonID(String personID){
        this.personID = personID;
    }

    public String getPersonID(){
        return personID;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
}
