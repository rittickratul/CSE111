public class Team {
  public String country_name;
  public Player [] ply = new Player[11];
  public int count = 0;
  public Team(){

  }
  public Team(String cn){
    country_name = cn;
  }
    public void updateName(String cn){
        country_name = cn;
    }
    public void addPlayer(Player pl){
       if(count <ply.length){
        ply[count] = pl;
        count++;
       }
    }  
    public void printDetail(){
        System.out.println("Team: "+country_name);
        for(int i =0;i<count;i++){
        System.out.println("Name: "+ply[i].getName());
        System.out.println("Age: "+ply[i].getAge()+", Total matches: "+ply[i].getMatch());
        }
    }
}
