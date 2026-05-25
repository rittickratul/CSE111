public class PremiumRide extends Ride{
    public boolean surge ;
    public boolean discount ;
    public static int count;
    private  String id;
    public int charge  = 50;
    public double total;
    public PremiumRide(int d,boolean b){
        super(d);
        surge = b;
        count++;
        id =count+" - "+getDistance(); 
        discount = false;
    }
    public String toString(){
        return super.toString()+"\nID: "+id + "\nService Charge: "+charge+" Tk\n"+"Surge: "+surge+"\nDiscount: "+discount;
    }
    public String getId(){
        return id;
    }
    public double calculateFare(){
        total+=super.calculateFare()+charge;
        if(surge){
            total+=total*.2;
            discount = false;
        }
        else{
            discount = true ;
        }
        return total;
    }
    public double calculateFare(int d){
        return super.calculateFare()-d+charge;
    }
}
