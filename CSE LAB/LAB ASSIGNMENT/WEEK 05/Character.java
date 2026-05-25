public class Character {
    public static int count;
    public static int kidsCount;
    public static int teenCount;
    public static int adultCount;
    public String name ;
    public int id;
    public String group;
    public int health;
    public static int totalHealth;
    public static double avg;
    public static int strong ;
    public static String strongestCharacter;
    public Character(String n,int h){
        name = n;
        group = "Teen";
        health = h;
        totalHealth+=h;
        count+=1;
        id=count;
        if(strong<h){
            strong=h;
            strongestCharacter = n; 
        }
        if(group.equals("Kid")){
            kidsCount++;
        }
        else if(group.equals("Addult")){
            adultCount++;
        }
        else if(group.equals("Teen")){
            teenCount++;
        }
    }
    public Character (String n, String g,int h){
        name = n;
        group = g;
        health = h;
        totalHealth+=h;
        count+=1;
        id=count;
        if(strong<h){
            strong=h;
            strongestCharacter =n; 
        }
        if(g.equals("Kid")){
            kidsCount++;
        }
        else if(g.equals("Addult")){
            adultCount++;
        }
        else if(g.equals("Teen")){
            teenCount++;
        }
    }
    public void printDetails(){
        System.out.println("ID: "+id+", Name: "+name);
        System.out.println("Group: "+group); 
        System.out.println("Health: "+health);
    }
    public static void  printStats(){
        if(count==0){
            avg = 0;
        }
        else{
        avg = totalHealth/count;
        }
        System.out.println("Total Charectctors: "+count);
        System.out.println("Kids: "+kidsCount);
        System.out.println("Teens: "+teenCount);
        System.out.println("Addults: "+adultCount);
        System.out.println("Average Health: "+avg);
        if(count>0){
        System.out.println("Strongest Character:\n"+strongestCharacter+" (Health "+strong+")");
        }
        else{
        System.out.println("Strongest Character: None");
        }
    }
}
