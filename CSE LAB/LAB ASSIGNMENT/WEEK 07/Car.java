public class Car extends Vehicle {
    public int seat;
    public static int count;
    public static String status;
    public String type = "Regular";
    public static Car [] c = new Car[3];
    public static int carCount; 
    public Car(String n,int p,int s){
        super(n,p);
        seat = s;
        count++;
        status = "Available";
        vehicleId = "CAR00";
        vehicleId+=count;
        System.out.println("Vehicle ID: "+vehicleId+" created");
        if(count<3){
            c [carCount]=this;
            carCount++;
        }
    }
    public void vehicleDetail(){
        super.vehicleDetail();
        System.out.println("Type: "+type+" Car");
        System.out.println("Seats: "+seat);
    }
    public static  void showAllAvailableCars(){
        System.out.println("Total Car: "+count);
        System.out.println("Available Cars: ");
         for(int i = 0;i<carCount;i++){
            if(c[i].status.equals("Available")){
            System.out.println(c[i].vehicleId+" : "+c[i].model);
        }
        }
    }    
    public static void markAsSold(Car c1){
        c1.sold = true ;
        c1.status = "Sold";

    }
    public static void showAllCars(){
        System.out.println("Total Car: "+count);
        for(int i = 0;i<carCount;i++){
            System.out.println(c[i].vehicleId+" : "+c[i].model+" - "+c[i].status);
        }
    }
}