public class Concert extends Audience{
    public static String [] artist = new String[5];
    public static int count;
    public static String place;
    public static int ticket;
    public static  String time;
    public int price;
    public Concert(String p,String t){
        place= p;
        time = t;
    }
    public  void buyTicket(String z){
        if(z.equals("A")){
            price+=500;
            ticket++;
        }
        else if(z.equals("B")){
            price+=1000;
            ticket++;
        }
        else{
           price+=2000;
            ticket++; 
        }
        System.out.println("Total price: "+price);
    }
    public  void buyTicket(String z,int q){
        if(z.equals("A")){
            price+=500*q;
            ticket+=q;
        }
        else if(z.equals("B")){
            price+=1000*q;
            ticket+=q;
        }
        else{
           price+=2000*q;
            ticket+=q; 
        }
        System.out.println("Total price: "+price);
    }
    public  void buyTicket(){
        price+=2000;
        ticket+=1;
        System.out.println("Total price: "+price);
    }
    public void showDetails(){
        System.out.println("Venue: "+place);
        System.out.println("Showtime: "+time);
        System.out.println("Artist: ");
        for(int i = 0;i<count;i++){
                System.out.println("-"+artist[i]);
            }
        System.out.println("Tickets sold in this concert: "+ticket);
    }
    public void addArtist(String a){
        if(count<5){
            artist[count++] = a;
        }
    }
    public static void showTotalTicketsSold(){
        System.out.println("Total tickets sold (all venues): "+ticket);
    }
}
