public class Student {
    public String name;
    public int id;
    public String dept;
    public String email;
    private String password;
    private boolean loginStatus = false;
    public String courses;
    public Student(String n,int i,String d){
        name = n;
        id = i;
        dept = d;
        System.out.println("Student object is created");
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setloginStatus(boolean b){
        this.loginStatus = true;
    }
    public boolean  getloginStatus(){
        return loginStatus;
    }
}
