public class Tennis_Tournament extends Tournament{
    public String tournamentName = "Default";
    public int players;
    public Tennis_Tournament(String n, int p){
        tournamentName = n;
        players= p;
    }
    public String info(){
        return getName()+" Tournament Name "+tournamentName+"\nPlayers: "+players;
    }
}