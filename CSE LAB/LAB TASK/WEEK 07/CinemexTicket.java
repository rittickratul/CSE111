public class CinemexTicket extends MovieTicket {
    public String MovieID;
    public boolean isPaid = false;
    public String genre;
    public static int totalTickets;
    public CinemexTicket(String n,String t,String g,String d){
        super(n,t,d,seatPrices[0]);
        genre = g;
        totalTickets++;
        seat = seatTypes[0];
    }
}
