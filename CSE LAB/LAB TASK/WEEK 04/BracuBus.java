public class BracuBus {
    public String route;
    public int capacity;
    public int count;
    public BracuStudent [] sn ;
    public BracuBus(String r) {
        route = r;
        capacity = 2;
        sn = new BracuStudent[capacity];
    }
    public BracuBus(String r, int c) {
        route = r;
        capacity = c;
        sn = new BracuStudent[capacity];
    }
    public void board() {
        System.out.println("No passenger");
    }
    public void board(BracuStudent s1) {
        if (count < capacity) {
            if (s1.pass == true) {
                if (s1.getLocation() == route) {
                    sn[count] = s1;
                    System.out.println(s1.name + " boarded the bus.");
                    count++;
                } else {
                    System.out.println("You got on the wrong bus!");
                }
            } else {
                System.out.println("You don't have a bus pass!");
            }
        } else {
            System.out.println("Bus is full!");
        }
    }

    public void board(BracuStudent s1, BracuStudent s2) {
        board(s1);
        board(s2);
    }
    public void showDetails() {
        System.out.println("Bus Route: " + route);
        System.out.println("Passenger Count: " + count + " (Max: " + capacity + ")");
        System.out.println("Passengers on Board: ");
        if(count!=0){
            for(int i =0;i<count;i++){
                System.out.print(sn[i].name +" ");
            }
        }
    }
}
