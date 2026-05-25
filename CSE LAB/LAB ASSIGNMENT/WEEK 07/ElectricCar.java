public class ElectricCar extends Vehicle{
    public int cap;
    public static int vcount;
    public static String status;
    public String type = "Electrical";
    public ElectricCar(String n,int p,int c){
        super(n,p);
        vcount++;
        cap = c;
        status = "Available";
        vehicleId="EVO000";
        System.out.println("Vehicle ID: "+vehicleId+" created");
    }
    public void vehicleDetail(){
        super.vehicleDetail();
        System.out.println("Type: "+type+" Car");
        System.out.println("Battery Capacity: "+cap);
    }
    public static void markAsSoldEV(ElectricCar e){
        e.sold = true;
        status = "Sold";
    }
}
