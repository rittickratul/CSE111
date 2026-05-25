public class Bike extends Vehicle{
    public String model;
    public boolean sidecar;
    public Bike(String b, String m ,int y, int w,boolean s){
        super(b, y);
        model = m;
        setWheels(w);
        sidecar = s;
    }
    public void doAWheelie() {
        if (sidecar = true ) {
            System.out.println(this.getBrand() + ":" + this.model + " is doing Wheelie!!");
        } else {
            System.out.println("Wheelie Failed. " + this.getBrand() + ":" + this.model + " has SideCar");
        }
    }
    public String toString(){
        return "Bike "+super.toString()+", Model: "+model+", Sidecar: "+sidecar;
    }

}
