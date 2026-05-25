public class Shop {
    public String name;
    public String[] item;
    public int[] price;
    public int count;
    int c;
    public Shop(String name, int c) {
        this.c = c;
        this.name = name;
        System.out.println(name+" shop created!");
        item = new String[c];
        price = new int[c];
    }
    public Shop(int c) {
        name ="Mega";
        System.out.println(name+" shop created!");
        item = new String[c];
        price = new int[c];
    }
    public void addItem(String item, int price) {
        if (count < c) {
            this.item[count] = item;
            this.price[count] = price;
            count++;
        } 
        else {
            System.out.println(item + " could not be added");
        }
    }
    public void addItem(Shop s, String it) {
        for(int i = 0;i < s.count;i++){
            if(s.item[i].equals(it)){
                //the below 2 statements are of s2 class
                item[count] = it; //this item is added to mega shop from agora
                price[count] = s.price[count];
                count++;
                return;
            }
        }
            System.out.println(it+", not found in "+s.name);
    }
    public void purchase(String it){
        for(int i =0;i<count;i++){
            if(item[i].equals(it)){
                System.out.println("Purchase Complete!");
                return;
            }
        }
        System.out.println(it+ ", is not available in this shop");
    }
    public void info(){
        System.out.println("Shop Name: "+name);
        System.out.println("item details: ");
        if(count == 0){
            System.out.println("No items in shop");
        }
        else{
         System.out.println(count +" / "+c);
            for(int i = 0;i<count ;i++){
                System.out.println(item[i]+" - "+price[i]);
            }
        }
    }
}
