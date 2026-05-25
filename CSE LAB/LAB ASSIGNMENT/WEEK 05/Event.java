public class Event {
    private static String [] event = new String[5];
    public static String [] eventDate = new String[5];
    public static int eventCount;
    private String name;
    public String date;
    public static void allEventInfo(){
        System.out.println("Total Events: "+eventCount);
        System.out.println("EventDetails");
        if(eventCount>0){
            for(int i = 0;i<eventCount;i++){
                System.out.println("Event "+(i+1));
                System.out.println("Name: "+event[i]);
                System.out.println("Date: "+eventDate[i]);
            }
        }
    } 
    public String getName(){
        return name;
    }
    public Event(String e,String d){
        name = e;
        date = d;
        if(eventCount<5){
            event[eventCount] = e;
            eventDate[eventCount] = d;
            eventCount++;
        }
    }
    public String  details(){
        return "Name: "+this.getName()+"\nDate: "+date;
    }
}
