public class Borrower {
    public static int book_count[] = {3, 3, 3};
    public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
    public String name;
    public int count;
    public String [] books = new String[9]; 
    public static void bookStatus(){
        System.out.println("Available Books: ");
        for(int i = 0;i<3;i++){
            System.out.println(book_name[i]+": "+book_count[i]);
        }
    }
    public Borrower(String n){
        name = n;
    }
    public static int remainingBooks(String b){
        for(int i = 0;i<3;i++){
            if(book_name[i].equals(b)){
                return book_count[i];
            }
        }
        return 0;
    }
    public void borrowBook(String b){
        if(count<books.length){
            for(int i = 0;i<3;i++){
                if(book_name[i].equals(b)){
                    if(remainingBooks(b)>0){
                        books[count] = b;
                        book_count[i]-=1;
                        count++; 
                    }
                    else{
                        System.out.println("The book is not available");
                        return;
                    }
                }
            }
        }
    }
    public void borrowerDetails(){
        System.out.println("Name: "+name);
        System.out.println("Books borrowed: ");
        for(int i = 0;i<count;i++){
            System.out.println(books[i]);
        }
    }
}
