public class Employee {
    public String Name;
    public double  Salary = 30000;
    public String Designation ="junior";
    public double tax ;
    public void newEmployee(String Name){
        this.Name = Name;
    }
    public void promoteEmployee(String Designation){
        this.Designation = Designation;
        if(Designation.equals("junior")){
            this.Salary = this.Salary ; 
        } 
        else if (Designation.equals("senior")){
            this.Salary = this.Salary + 25000;
            System.out.println(Name+" has been promoted to "+Designation);
            System.out.println("New Salary:  "+Salary);
        }
        else if (Designation.equals("lead")){
            this.Salary = this.Salary + 50000;
            System.out.println(Name+" has been promoted to "+Designation);
            System.out.println("New Salary:  "+Salary);
        }
        else{
            this.Salary = this.Salary + 75000;
            System.out.println(Name+" has been promoted to "+Designation);
            System.out.println("New Salary:  "+Salary);
        }
    }
    public void calculateTax(){
        if(Salary<=30000 && Designation.equals("junior")){
            System.out.println("No need to pay tax");
        }
        else if (Salary>30000 && Salary<=50000) {
            tax = Salary*.1;
            System.out.println(Name+" tax ammount: "+tax);
        }
        else{
            tax = Salary*.3;
            System.out.println(Name+" tax ammount: "+tax);
        }
    }
    public void displayInfo(){
        System.out.println("Employee Name: "+ Name);
        System.out.println("Employee Salary: "+ Salary+" Tk");
        System.out.println("Employee Designation: "+ Designation);
    }
}
