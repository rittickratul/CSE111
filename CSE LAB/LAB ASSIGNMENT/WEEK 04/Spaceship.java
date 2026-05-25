public class Spaceship {
    public String name;
    public int capacity;
    public int currentWeight = 0;
    public Cargo [] detail = new Cargo[100];
    int count;
    public Spaceship(String n,int c){
        name = n;
        capacity = c;
    }
    public void loadCargo(Cargo c){
        int extended = 0;
        if(count<detail.length){
        if(currentWeight+c.getWeight()<capacity){
            detail[count] = c;
            currentWeight+=c.getWeight();
            count++; 
        }
        else{
            extended = currentWeight+c.getWeight();
            System.out.println("Warning: Unable to load "+ c.getName() +" inside "+this.name+" . Exceeds capacity by "+(extended-capacity));
        }
      }
    }
    public void displayDetails(){
        System.out.println("Spaceship Name: " + this.name);
        System.out.println("Capacity: "+capacity);
        System.out.println("Current Cargo Weight: "+currentWeight);
        System.out.print("Cargo: ");
        for(int i =0;i<count;i++){
            System.out.print(detail[i].getName()+" ");
        }
            System.out.println();
    }
}
