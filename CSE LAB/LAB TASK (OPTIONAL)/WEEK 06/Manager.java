public class Manager extends SportsPerson{
    public int win;
    public Manager(String c,String n,String r,int w){
        super(c, n, r);
        win = w;
        earningPerMatch = (win*1000);
    }
     public void printDetails(){
        System.out.println(getNameTeam()+" ");
        System.out.println("Team Role: "+role);
        System.out.println("Total Win: "+win);
        System.out.println("Match Earning: "+earningPerMatch+"k");
    }
}
