public class Book {
    public String title;
    public String genre;
    public String author ="Unknown";
    public int page;
    public void createBook(String title){
        this.title = title;
    }
    public void createBook(String title,String author){
        this.author = author;
        this.title = title;
    }
    public void createBook(String title,String author,String genre ){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
    public void customizeGenre(String genre){
        this.genre = genre;
        System.out.println("Updated genre of "+ this.title+ " to "+ this.genre);
    }
    public void customizePages(int page){
        this.page = page;
        System.out.println("Updated pages of "+ this.title+ " to "+ this.page+" pages");
    }
    public void displayDetails(){
        System.out.println("Title: "+ title +", Author: "+ author +", Genre: "+ genre +", pages: "+page );
    }
}
