public class MobilePhone {
    public int Capacity;
    public String arr1[];
    public int arr2[];
    public int count = 0;
    public void setContactCapacity(int Capacity) {
        this.Capacity = Capacity;
        arr1 = new String[Capacity];
        arr2 = new int[Capacity];
    }
    public void details() {
        System.out.println("Total Contacts: " + count);
        System.out.println("Contact List: ");
        for (int i = 0; i < count; i++) {
            System.out.println(arr1[i] + " :" + arr2[i]);
        }
    }
    public void addContact(String name, int id) {
        if (Capacity > count) {
            arr1[count] = name;
            arr2[count] = id;
            System.out.println("The contact of " + arr1[count] + " is added");
            count++;
        } else {
            System.out.println("Storage Full!!");
        }
    }
    public void makeCall(int id) {
        for (int i = 0; i < count; i++) {
            if (arr2[i] == id) {
                System.out.println("Calling " + arr1[i] + " . . .");
                return;
            }
        }
        System.out.println("Calling " + id + " . . .");
    }
}
