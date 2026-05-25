public class Animalkeepers {
    public static String [] Animals = {"Lion","Tiger","Seal","Gorila","Deer"};
    public String name;
    private int id = 100;
    public static int EmployeeCount ;
    public static String [] task = new String[5];
    public static int taskCount;
    public static int animalCount;
    public static void details(){
        if(EmployeeCount==0){
            System.out.println("No Animal Keepers working yet.");
        }
        else{
            System.out.println("Total animal Keeper: "+EmployeeCount);
            System.out.println("Total task assigned: "+taskCount);
            printTasks();
        }
    }
    public Animalkeepers(String n){
        name = n;
        EmployeeCount +=1;
        id+=EmployeeCount;
        System.out.println(name +" with ID "+this.getID()+" got the job! "); 
    }
    public int getID(){
        return id;
    }
    public static void printTasks(){
        if(taskCount==0){
            System.out.println("No tasks assigned");
        }
        else{
            for(int i =0;i<taskCount;i++){
                System.out.println(task[i]);
            }
        }
    }
    public void doTask(String a,String t){
        boolean found = false;
            for(int i = 0;i<5;i++){
                if(Animals[i].equals(a)){
                    found = true;
                    break;
                } 
            }
            if(!found){
                System.out.println("Animal not in the Safari");
            }
            else{
                if(taskCount<5){
                    task[taskCount] = t+"( keeper - "+name+") === "+a;
                    System.out.println("task assigned to "+name);
                    animalCount++;
                    taskCount++;
            }
        }
    }
}
