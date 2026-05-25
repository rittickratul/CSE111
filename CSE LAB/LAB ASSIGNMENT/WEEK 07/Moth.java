public class Moth extends Caterpillar {
    public Moth(String f,int a){
        super(f,a);
    } 
    public void transform(){
        System.out.println("Caterpillar transforms into Moth");
    }
    public void eat(int f){
        energy += 2.5*f ;
        energy-=2.5;
        System.out.println("Moth lost energy due to nocturnal activity"); 
    }
    public void showDetails() {
    System.out.println("Food: " + food);
    System.out.println("Age: " + age);
    System.out.println("Energy: " + energy+" joules");
  }
}
