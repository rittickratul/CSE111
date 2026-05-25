public class Library {
    public int capacity;
    public int count;
    public String[] arr;
    public Library(int cap) {
        capacity = cap;
        System.out.println("A library has been created with capacity " + capacity);
        arr = new String[capacity];
    }
    public void addBook(String a) {
        if (count < arr.length) {
            arr[count] = a;
            System.out.println("Book " + arr[count] + " added to library");
            count++;
        } else {
            System.out.println("Exceeds maximum capacity. You can't add more than " + capacity + " books");
        }
    }
    public void printDetail() {
        System.out.println("Maximum Capacity: " + arr.length);
        System.out.println("Total Books: " + count);
        System.out.println("Book list: ");
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }
}
