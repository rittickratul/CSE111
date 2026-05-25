public class Department {
    public String dept;
    public Studeant [] detail = new Studeant[5];
    public int count;
    public Department(String d){
        dept = d;
    }
    public void addStudent(Studeant s){
        if(count<detail.length){
            detail[count] = s;
            System.out.println("Welcome to "+dept+" department, "+detail[count].name);
            count++;
        }
    }
    public void addStudent(Studeant s1,Studeant s2,Studeant s3){
        addStudent(s1);
        addStudent(s2);
        addStudent(s3);
    }
    public void findStudent(int ix){
        for(int i = 0;i<count;i++){
            if(detail[i].getId()==ix){
                System.out.println("");
            }
        }
    }
}
