public class SmartSecurityCamera extends SmartDevice{
    public int storage;
    public static int poweroncount;
    public SmartSecurityCamera(String n,int b,int s){
        super(n, b);
        storage = s;
    }
    public void powerOn() {
        super.powerOn();
        poweroncount++;
    }
    public void record(boolean r){
        if(storage <=64 && storage>1 ){
        if(r = true){
            System.out.println("[IR SENSORS ACTIVE]");
            System.out.println("Recording standard footage.");
        }
    }
        else{
            if(poweroncount>1){
                System.out.println("Error: "+deviceName+"-Cam storage full.");
                System.out.println("Recording disabled.");
            }
        }
    } 
    public void record(){
        if(storage <=64 && storage>1 ){
        System.out.println("Recording standard footage.");
        }
        else{
            if(poweroncount>1){
                System.out.println("Error: "+deviceName+"-Cam storage full.");
                System.out.println("Recording disabled.");
            }
        }
    }
    public void formatCard(String s){
        if(s.equals("ADMIN123")){
            System.out.println("REQUEST: Format SD Card initiated. \nAuth Success. Wiping data.\nSUCCESS: Storage restored to "+storage+"GB." );
        }
        else{
            System.out.println("REQUEST: Format SD Card initiated. \nAccess DENIED: Incorrect Pin ");
        }
    }

}
