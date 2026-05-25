public class Pokemon {
    public String name;
    public Pokemon(String n){
        name = n;
    }
    public void attack(){
        System.out.println("Pikachu attacks with a basic move!");
    }public void attack(String n){
        System.out.println("Pikachu uses "+n+"!");
    }public void attack(String n ,int p){
        System.out.println("Pokemon uses "+n+"  with power " +p+"!");
    }
}