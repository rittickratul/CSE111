public class Player extends  SportsPerson{
    public int goal;
    public int match;
    public double ratio;
    public Player(String c,String n,String r, int g,int m){
        super(c, n, r);
        goal = g;
        match = m;
        earningPerMatch = (goal*1000)+(match*10);
    }
    public void calculateRatio(){
        ratio = goal*1.0/match;
    }
    public void printDetails(){
        System.out.println(getNameTeam()+" ");
        System.out.println("Team Role: "+role);
        System.out.println("Total Goal: "+goal+", Total Played: "+match);
        System.out.println("Goal Ratio: "+ratio);
        System.out.println("Match Earning: "+earningPerMatch+"k");

    }
}
