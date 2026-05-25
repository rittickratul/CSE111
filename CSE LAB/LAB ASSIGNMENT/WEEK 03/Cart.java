public class Cart {
    public int n;
    public int capacity = 3;
    public double[] arr1 = new double[capacity];
    public String[] arr2 = new String[capacity];
    public int count;
    public double discount; 
    public void create_cart(int n) {
        this.n = n;
    }
    public void addItem(String name, double price) {
        if (count < capacity) {
            arr1[count] = price;
            arr2[count] = name;
            count++;
            System.out.println(name + " added to cart " + n);
            System.out.println("You have " + count + " item(s) in your cart now");
        } else {
            System.out.println("You already have " + capacity + " items in your cart");
        }
    }
    public void addItem (double price,String name) {
        if (count < capacity) {
            arr1[count] = price;
            arr2[count] = name;
            count++;
            System.out.println(name + " added to cart " + n);
            System.out.println("You have " + count + " item(s) in your cart now");
        } else {
            System.out.println("You already have " + capacity + " items in your cart");
        }
    }
    public void giveDiscount(double n){
        this.discount = n;
    }
    public void cartDetails(){
        System.out.println("Your cart "+"(c"+n+"): ");
        double totalPrice = 0;
        for(int i = 0;i<count;i++){
            System.out.println(arr2[i]+ " - "+ arr1[i]);
            totalPrice += arr1[i];
        }
        System.out.println("Discount Applied: "+ discount+ "%");
        totalPrice -= (totalPrice*discount)/100.0;
        System.out.println("Total price: "+ totalPrice);
    }
}
