public class Electronics extends Product{
    public int warenty;
    public Electronics(String it,double p,int w){
        super(it,p);
        warenty = w;
    }
    public void displayInfo() {
        System.out.println("Electronics: "+productName+", price: "+price+", Warenty: "+warenty+" months");
      }
      public void displayInfo(boolean b){
        if(b ==true){
        System.out.println("Electronics: "+productName+", price: "+price+", Warenty: "+warenty+" months");
        }
        else{
        System.out.println("Electronics: "+productName+", Warenty: "+warenty+" months");

        }
      }
}
