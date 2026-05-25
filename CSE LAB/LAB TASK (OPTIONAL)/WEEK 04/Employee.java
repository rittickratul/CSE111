public class Employee {
    private String name ;
    private int id;
    private String type; 
    public Employee(){
        System.out.println("A default employee has been created");
    }
    public Employee(String n,int i,String t){
        name = n;
        id = i;
        type = t;
    }
    public void  SetDetails(String n,int i,String t){
        name = n;
        id = i;
        type = t;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getType(){
        return type;
    }
}
