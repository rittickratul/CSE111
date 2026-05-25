// Having array glitch problem
public class Student {
    public String name;
    public int id;
    public double cg;
    public String [] courses ;
    public int count;
    public Student (int i){
        id = i;
        System.out.println("A student with ID "+i+" has been created.");
    }
    public Student (int i,double c){
        id = i;
        cg = c;
    }
    public void storeCG(double c){
        cg = c;
    }
    public void storeID(int i){
        id = i;
    }
    public void addCourse(String c){
        if(cg==0){
            System.out.println("Failed to add "+c);
            System.out.println("Set CG first");
        }
        if(cg<3){
            courses = new String[3];
            if(count<courses.length){
                courses[count]=c;
                count++;
            }
            else{
                System.out.println("Failed to add "+c);
                System.out.println("CG is low. Can't add more than 3 courses.");
            }
        }
        else{
            courses = new String[4];
            if(count<courses.length){
                courses[count]=c;
                count++;
            }
            else{
                System.out.println("Failed to add "+c);
                System.out.println("Maximum 4 courses allowed.");
            }
        }
    }
    public void addCourse(String [] d){
        addCourse(d);
    }
    public void removeAllCourse() {
        courses = new String[3];
        count = 0;
    }
    public void showAdvisee(){
        System.out.println("Student ID: "+id+", CGPA: "+cg);
        System.out.println("Added courses are: ");
        for(int i = 0;i<count;i++){
                System.out.print(courses[i]+" ");
        }
        System.out.println();
    }
}
