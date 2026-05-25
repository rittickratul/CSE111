 public class Mango extends Fruit{
    private String name = "Mango";
    public Mango(){
        super(true,"Mango");
    }
    public String getName(){
        return name;
    }
    public String toString(){
        if(hasFormalin()==true){
            return "Mangos are bad for you";
        }
        else{
            return "Mangos are good for you";
        }
    }
}