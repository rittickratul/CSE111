public class Car extends Vehicle{
    public String model;
    public int door;
    public boolean ai;
    public Car(String b, String m ,int y,int d, int w,boolean a){
        super(b, y);
        model = m;
        setWheels(w);
        door = d;
        ai = a;
    }
    public void startAutoPilot() {
        if (ai) {
            System.out.println(this.getBrand() + ":" + this.model + " AutoPilot Started");
        } else {
            System.out.println(this.getBrand() + ":" + this.model + " has NO AutoPilot");
        }
    }
    public String toString(){
        return "Car "+super.toString()+", Model: "+model+", Doors: "+door+", Ai: "+ai;
    }
}
