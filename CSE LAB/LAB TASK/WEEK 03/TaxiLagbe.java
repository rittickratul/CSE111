// not solved
public class TaxiLagbe {
    String taxinumber;
    String location;
    String[] arr = new String[4];
    int count;
    int sum;
    public TaxiLagbe(String taxinumber, String location) {
        System.out.println("A new taxi has been created");
        this.taxinumber = taxinumber;
        this.location = location;

    }
    public void addPassenger(String name, int fair) {
        if (count < arr.length) {
            arr[count] = name;
            this.sum += fair;
            count++;
        } else {
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }

    public void addPassenger(String name1, int fair1, String name2, int fair2) {
        addPassenger(name1, fair1);

    }
}
