public class CarDriver extends GenericDriver{
    public String type;
    public static String [] restrictedAreas = new String[3];
    public static int count;
    public CarDriver(String n){
        super(n);
        type = "Premium";
    }
    public String toString(){
        if(type.equals("Not Premium")){
            return getName()+"'s driver profile is Not Premium";
        }
        else{
            return getName()+"'s driver profile is Premium";
        }
    }
    public static void restrictedAreas(String a){
        if(count<3){
            restrictedAreas[count++] = a;
        }
    }
    public void fightRestriction(String[] locations) {
        for (int i = 0; i < locations.length; i++) {
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (locations[i].equals(restrictedAreas[j])) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println(getName() + " cannot enter " + locations[i]);
            } else {
                System.out.println(getName() + " can enter " + locations[i]);
            }
        }
    }
}
