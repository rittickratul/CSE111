public class Product {
    public static String [] product = new String[3];
    public static int [] quantity = new int[3];
    public static int count;
    public Product(String n,int q){
        if(count<3){
            product[count] = n;
            quantity[count] = q;
            System.out.println("Stored: "+n);
            count++;
        }
        else{
            System.out.println("Storage is full! Cannot add "+n);
        }
    }
    public static void buy(String p,int q){
        for(int i = 0; i<count; i++){
            if(product[i].equals(p)){
                if(quantity[i]>=q){
                    quantity[i]-=q;
                    System.out.println("Product Sold");
                    return;
                }
                else{
                    System.out.println("Quantity low");
                    return;
                }
            }
        } 
        System.out.println("Product not found");
    }
    public static void displayProducts(){
        System.out.println("=== Stored Products ===");
        for(int i = 0; i<count; i++){
            System.out.println(product[i]+" - Qty: "+quantity[i]);
        }
    }
}
