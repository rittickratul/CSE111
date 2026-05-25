public class Clothing extends Product{
    public String size;
    public Clothing(String it,double p,String s){
        super(it,p);
        size = s;
    }
    public void displayInfo() {
        System.out.println("Clothing: "+productName+", price: "+price+", Size: "+size);
        
      }
}