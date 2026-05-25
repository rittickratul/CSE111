public class Connect {
    public int totalAdvisee;
    public Student [] detail = new Student[5];
    public Connect(){
        System.out.println("Connect is ready to use!");
    }
    public void login(Student s1){
        if(s1.email==null || s1.getPassword()==null){
            System.out.println("Email and password need to be set.");
        }
        else{
            s1.setloginStatus(true);
            System.out.println("Login successful");
        }
    }
    public void advising(Student s1){
        if (!s1.getloginStatus()) {
            System.out.println("Please login to advise courses!"); 
        } else {
            System.out.println("You haven't selected any courses."); 
        }
    }
    public void advising(Student s1,String n1,String n2,String n3){
       if(totalAdvisee<detail.length){
        detail[totalAdvisee] = s1;
        totalAdvisee++;
       }
       s1.courses = n1 + " " + n2 + " " + n3; 
        System.out.println("Advising successful!"); 
    }
    public void advising(Student s1,String n1,String n2,String n3,String n4){
        System.out.println("You need special approval to take more than 3 courses.");
    }
    public void allAdviseeInfo(){
        if(totalAdvisee!=0){
            System.out.println("Total Advisee: "+totalAdvisee);
        }
            for(int i =0;i<totalAdvisee;i++){
                System.out.println("Name: "+ detail[i].name +" ID: "+detail[i].id);
                System.out.println("Department: "+ detail[i].dept );
                System.out.println("Advised Courses:");
                System.out.println(detail[i].courses);
            }
    }
}
