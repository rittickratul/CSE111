public class Manager extends Employee{
    public double totalSalary;
    public double bonus;
    public Manager(String n,double s,int t,int b){
        super(n, s, t);
        bonus = b;
    }
    public void calculateSalary(){
        if(getHoursWorked()>40){
            totalSalary = getBaseSalary()+(getBaseSalary()*bonus/100);
        }
    }
    public void requestIncrement(int a){
        if(getHoursWorked()>100){
            setBaseSalary(getBaseSalary()+a);
            System.out.println("$"+a+" Increment approved.");
        }
        else if(getHoursWorked()<=100 && getHoursWorked()>80){
            setBaseSalary(getBaseSalary()+a*.5);
            System.out.println("$"+a/2+" Increment approved.");
        }
        else{
            System.out.println("Increment denied.");
        }
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus: "+bonus+"%");
        System.out.println("Final Salary: $"+totalSalary);
    }
}
