public class CheckingAccount extends Account {
    public static int count;
    public CheckingAccount(){
        super();
        count++;
    }
    public CheckingAccount(double d){
        super(d);
        count++;
    }
}
