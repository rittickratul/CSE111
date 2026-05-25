public class Developer extends Employee{
    public String lan;
    public double  totalSalary;
    public Developer(String n,double s,int t,String b){
        super(n, s, t);
        lan = b;
    }
    public void calculateSalary(){
        if(lan.equals("Java")){
            totalSalary+=getBaseSalary()+700;
        }
        else{
            totalSalary=getBaseSalary()
            ;
        }
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Language: "+lan);
        System.out.println("Final Salary: $"+totalSalary);
    }
}
