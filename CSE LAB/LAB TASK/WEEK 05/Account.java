public class Account {
    public static String bankName = "Badda Bank";
    public static int count = 0;
    public static double totalBalance = 0;
    private double balance; 
    public String name ;
    public String location;
    public Account(String n ,String l){
        name = n;
        location = l;
        count++;
    }
    public void setBalance(double b){
        balance+=b;
        totalBalance+=b;
    }
    public double getBalance(){
        return balance;
    }
    public void printInfo(){
        System.out.println("Name: "+ name+", address: "+location);
        System.out.println("Balance: "+getBalance()+" Taka");
    }
}
