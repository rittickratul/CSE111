public class Company {
    public String name = "ABC";
    public int totalEmployee;
    public Employee [] detail = new Employee[3];
    public int count ;
    public void addEmployee(Employee e){
        if(count<detail.length){
            detail[count] = e;
            System.out.println(e.getName()+" has joined the company");
            count++;
        }
        else{
            System.out.println("No more vacancy");
        }
    }
    public void removeEmployee(Employee e){
        for(int i =0;i<count;i++){
            if(detail[i].getName().equals(e.getName())){
                System.err.println(detail[i].getName()+" has left the company");
                detail[i].SetDetails("null",0,"null");
            }
        }
    }
    public void details(){
        System.out.println("Company Name: "+name+" Company");
        System.out.println("Total Employee: "+count);
        for(int i =0;i<count;i++){
            if(detail[i].getType().equals("Fulltime")){
                System.out.println("Fulltime Employee: ");
                System.out.println("Name: "+detail[i].getName()+", ID: "+detail[i].getId());
            }
            else{
                System.out.println("Part-Time Employee: ");
                System.out.println("Name: "+detail[i].getName()+", ID: "+detail[i].getId());
            }
         }
     }
 }

