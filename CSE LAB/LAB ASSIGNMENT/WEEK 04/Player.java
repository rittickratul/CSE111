public class Player {
    public String name;
    public String [] villaneName = new String[5];
    public int hp;
    public int count;
    public Player(String name){
        this.name = name;
        hp = 100;
        System.out.println(this.name+" joined the game");
        System.out.println("HP: "+this.hp);
    }
    public Player(String name, int hp){
        this.name = name;
        this.hp = hp;
        System.out.println(this.name+" joined the game");
        System.out.println("HP: "+this.hp);
    }
    public void defeatVillain(Player p1){
        defeatVillain(p1.name,p1.hp);
    }
    public void defeatVillain(String nm ,int h){
       if(count<villaneName.length){
         if(h<=hp){
            villaneName[count] = nm;
            hp+=h;
            System.out.println("defeated "+ nm);
            count++;
        }
        else{
            System.out.println("failed to defeat "+ nm);
        }
       }
    }
    public void defeatVillain(int boost,String nm ,int h){
        hp = hp*boost;
        System.out.println("HP with " + boost + "x: "+hp);
        defeatVillain(nm, h);
    }
    public void viewInfo(){
        System.out.println("Player Name: "+name);
        System.out.println("Current HP: "+hp);
        if(count>0){
            System.out.println("Defeated: ");
            for(int i = 0;i<villaneName.length;i++){
                if(villaneName[i]!=null){
                  System.out.print(villaneName[i]+", ");
                }
            }
            System.out.println();
        }
    }
}
