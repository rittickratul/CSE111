public class Course {
    public String name;
    public String code;
    public int credit;
    public void updateDetails(String name, String code,int credit){
        this.name = name ;
        this.code = code ;
        this.credit = credit;
    }
    public void displayCourse(){
        System.out.println("Course name: "+ name);
        System.out.println("Course code: "+ code);
        System.out.println("Course credit: "+ credit);
    }
}
