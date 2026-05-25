public class Trainer {
    public String name;
    public static int TrainerNo;
    public int id;
    public int count;
    public double avg;
    public static Pokemon [] pk = new Pokemon[7];
    public Trainer(String n){
        name = n;
        TrainerNo++;
        id = TrainerNo;
        System.out.println("Trainer ID: "+id+" Name: "+name+" - created");
    }
    public void catchPokemon(Pokemon p){
        if(count<7){
            pk[count] = p;
            System.out.println(name+" caught: "+p.getName());
            count++; 
        }
    }
    public void viewPokeDex(){
        double totalpoints = 0;
        System.out.println(name+"'s Trainer code: T"+id);
        for(int i = 0;i<count;i++){
            totalpoints+=pk[i].getHP();
            System.out.println(pk[i].getName()+": "+pk[i].getHP()+" points");
        }
        avg = totalpoints/count;
        System.out.println("Average of HP: "+avg);
    }
    public static void battle(Trainer t1,Trainer t2){
        if(t1.avg>t2.avg){
            System.out.println(t1.name+" wins");
        }
        else{
            System.out.println(t2.name+" wins");
        }
    }
    //Extra
    // public static void pokeFight(Pokemon p1,Pokemon p2){
    //     if(p1.getHP()>p2.getHP()){
    //         System.out.println(p1.getName()+" wins");
    //     }
    //     else{
    //         System.out.println(p2.getName()+" wins");

    //     }
    // }
}
