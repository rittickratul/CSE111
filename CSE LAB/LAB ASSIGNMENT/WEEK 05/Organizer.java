public class Organizer {
    public Event [] org = new Event[5];
    public int orgCount;
    public String organizer;
    public Organizer(){
        System.out.println("Please provide the organizer's name");
    }
    public Organizer(String n){
        organizer = n;
    }
    public void organizeEvent(Event e){
        if(orgCount<5){
            org[orgCount] = e;
            System.out.println(organizer+" successfully organized "+e.getName());
            orgCount++;
        }
    }
    public void searchEventByDate(String d){
        boolean found = false;
        int indx = 0;
        for(int i = 0;i<orgCount;i++){
            if(org[i].date.equals(d)){
                found = true;
                indx = i;
                break;
            }
        }
        if(!found){
            System.out.println("No event is scheduled for 21/12/24");
        }
        else{
            System.out.println(org[indx].getName());
        }
    }
}
