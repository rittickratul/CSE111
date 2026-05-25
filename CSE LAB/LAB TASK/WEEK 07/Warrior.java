public class Warrior extends GameCharacter{
    public int streangth;
    public int armor;
    public Warrior(String n,int l,int s,int a,String w){
        super(n,l,w);
        streangth = s;
        armor = a;
        System.out.println("A new warrior has arrived");
    }
    public void calculateDamage(){
        totalDamage = (getLevel()*streangth)+(armor*50);
    }
    public String toString(){
      return getCharacterInfo()+"\nCharacter Type: Warrior"+"\nWeapon: "+weaponType+"\nStrength: "+streangth+", Armor: "+armor+"\nTotal Damage: "+totalDamage;
    }
}