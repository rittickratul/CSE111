public class Cricket_Tournament extends Tournament{
    public String tournamentName = "Default";
    public int team;
    public String type = "No type";
    public Cricket_Tournament(){
    }
    public Cricket_Tournament(String t,int te,String ty){
        tournamentName = t;
        team = te;
        type = ty;
    }
    public String info(){
        return getName()+" Tournament Name "+tournamentName+"\nNumber of Teams: "+team+"\nType: "+type;
    }
}