public class Reader {
    public String name = "New user";
    public int capacity = 2;
    String [] arr = new String[capacity];
    public int count = 0;
    public Reader(String name){
        this.name = name;
        System.out.println("A new reader is created!");
    }
    public Reader(String name,int capacity){
        this.name = name;
        this.capacity = capacity;
        this.arr = new String[capacity];
        System.out.println("A new reader is created!");
    }
    public void addBook(String book){
        if(count < capacity){
            arr[count] = book;
            count++;
        }
        else{
            System.out.println("No more capacity");
        }     
    }
    public void updateCapacity(int n){
       this.capacity = n;
       String [] temp = new String[capacity];
       for(int i = 0;i<count;i++){
        temp[i] = arr[i];
        System.out.println("Capacity has changed to "+this.capacity);
       }
       this.arr = temp;
    }
    public void readerInfo(){
        System.out.println("Name: "+name);
        System.out.println("Capacity: "+ capacity);
        System.out.println("Books: ");
        if(count<=0){
            System.out.println("No books added yet");
        }
        else{
            for(int i = 0;i<count;i++){
            System.out.println("Book "+ (i+1)+ " : "+ arr[i]);
            }
        }
    }
   
}
