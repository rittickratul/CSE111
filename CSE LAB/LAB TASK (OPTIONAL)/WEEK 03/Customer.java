// not solved
public class Customer{
    public String name;
    public int capacity = 4;
    public String [] item = new String[capacity];
    public int [] price = new int[capacity];
    public int count = 0;
    public int total = 0;
    public void createCustomer(String name){
        this.name = name;
    }
    public void addItem(String item,int price){
        if(count<capacity){
            this.item[count] = item;
            System.out.println(item+" added to cart");
            this.price[count] = price;
            count++;
        }
        else{
            System.out.println("Cart is full");
        }
    }
    public void addItem(String item1,int price1,String item2,int price2){
        addItem(item1,price1);
        addItem(item2, price2);
    }
    public void addItem(String item){
        if(count<capacity){
            this.item[count] = item;
            System.out.println(item+" added to cart");
            count++;
        }
        else{
            System.out.println("Cart is full"); 
        }
    }
    public void calculatePrice(){
        for(int i = 0;i<count;i++){
            this.total+=price[i];
        }
        System.out.println("Total: "+ total);
    }
    public void showCart(){
        if(total!=0){
            System.out.println("Customer: "+name);
            for(int i =0;i<count;i++){
                System.out.println("item: "+item[i]+" Price: "+price);
            }
        }
        else{
            System.out.println("Customer: "+name);
        }
    }
}