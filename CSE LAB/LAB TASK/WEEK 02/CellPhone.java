public class CellPhone {
    public String model = "unknown";
    public String[] contacts = new String[3];
    public int count = 0;
  public void storeContact(String contact) {
        if (count < contacts.length) {
            contacts[count] = contact;
            count++;
            System.out.println("contact stored ");
        } else {
            System.out.println("Memory full ");
        }
    }
    public void printDetails() {
        System.out.println("phone model " + model);
        System.out.println("contacts stored " + count);
        if (count > 0) {
            System.out.println("Stored contacts: ");

            for (int i = 0; i < count; i++) {
                System.out.println(contacts[i]);
            }
        }
    }
}
