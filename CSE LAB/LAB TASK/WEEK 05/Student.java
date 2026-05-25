public class Student {
    public static int total_students;
    public static double totalmarks;
    public int id;
    public String name;
    private int mark1;
    private int mark2;
    public Student(String n){
        name = n;
        total_students++;
        id = total_students;
    }
    public Student(String na, int m, int n){
        this(na);
        setCodingMarks(m);
        setTracingMarks(n);
    }
    public void setCodingMarks(int m){
        mark1 = m;
        totalmarks+=m;
    }
   public void setTracingMarks(int n){
        mark2 = n;
        totalmarks+=n;
    } 
    public int getCodingMarks(){
        return mark1;
    }
    public int getTracingMarks(){
        return mark2;
    }
    public void individualDetail(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Coding Marks: "+getCodingMarks());
        System.out.println("Tracing Marks: "+getTracingMarks());
        int marks = 0;
        marks = getCodingMarks()+getTracingMarks();
        if(marks<50){
            System.out.println(name+ " has failed with "+marks+ " marks");
        } 
        else{
            System.out.println(name+" has passed with "+marks+" marks");
        }
    }
    public static double averageMarks(){
        if(total_students==0){
            return 0;
        }
        else{
            return totalmarks/total_students;
        }
    }
}
