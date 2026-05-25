public class MoneyTracker {
    public String name ;
    public double balance ;
    public double expence;
    public double income;
    public MoneyTracker(){
        System.out.println("A new money tracker has been launched.");
    }
    public void createTracker(String name){
        this.name = name;
        this.balance = 1;
    }
    public void income(double credit){
        this.income = credit;
        this.balance+=credit;
        System.out.println("Balance Updated");

    }
    public void expense(double debit){
        if(debit>this.balance){
        System.out.println("Not enough balance.");
        }
        else{
            this.balance -= debit;
            this.expence = debit;
            if(this.balance==0){
                System.out.println("You're broke!");
            }
            else{
            System.out.println("Balance Updated");
            }
        }
        
    }
      public String info(){
        return "Name: " + name + "\n"+ "Current Balance: "+balance;
    }
    public void showHistory(){
        System.out.println("Last added: "+ income);
        System.out.println("Last spent: "+ expence);
    }
}
