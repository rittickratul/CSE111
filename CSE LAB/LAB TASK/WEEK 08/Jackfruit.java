public class Jackfruit extends Fruit{
    private String name = "Jackfruit";
    public Jackfruit(){
        super(false,"Jackfruit");
    }
    public String getName(){
        return name;
    }
    public String toString(){
        if(hasFormalin()==true){
            return "Jackfruit are bad for you";
        }
        else{
            return "Jackfruit are good for you";
        }
    }
}