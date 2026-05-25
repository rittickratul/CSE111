public class Toy {
    public String name;
    public String old;
    public int price;
    public Toy(String name ,int price ){
        this.name = name;
        this.price = price;
        System.out.println("A new toy has been made! ");
    }
    public void updatePrice(int price){
        this.price = price;
    }
    public void updateName(String name){
        old = this.name;
        System.out.println("Changing old name: "+ old);
        this.name = name;
        System.out.println("new name: "+ this.name);
    }
    public void showPrice(){
        System.out.println("Price: "+ price+" Taka");
    }
}
