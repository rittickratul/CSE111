public class Mage extends GameCharacter{
    public int intelegence;
    public int mana;
    public Mage(String n,int l,int in,int m,String w){
      super(n,l,w);
      intelegence = in;
      mana = m;
      System.out.println("A new mage came to live");
    }
    public void calculateDamage(){
      totalDamage = (getLevel()*intelegence)+(mana*50);
    }
     public String toString(){
        return getCharacterInfo()+"\nCharacter Type: Mage"+"\nWeapon: "+weaponType+"\nIntelegence: "+intelegence+",Mana: "+mana+"\nTotal Damage: "+totalDamage;
    }
}
