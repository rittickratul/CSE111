public class Movie {
    public String title;
    public String director;
    public double rating;
    public String n1 ;
    public String n2 ;
    public String n3 ;
    public void setMovieDetails(String title,String director,double rating){
        this.title = title;
        this.director = director;
        this.rating = rating;
    }
     public void setMovieDetails(String title,String director){
        this.title = title;
        this.director = director;
    }
    public void updateRating(double rating){
        this.rating = rating;
    }
    //  public void setMovieDetails(String title,String n1){
    //     this.title = title;
    //     this.n1 = n1;
    //  }

    public void addActors(String n1,String n2){
        this.n1 = n1;
        this.n2 = n2;
        System.out.println("Added actor "+ n1 +" added to "+ title);
        System.out.println("Added actor "+ n2 +" added to "+ title);

    }
    public void addActors(String n3){
        this.n3 = n3;
        System.out.println("Added actor "+ n3 +" added to "+ title);
    }
    public void addActors(String n1,String n2,String n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        System.out.println("Added actor "+n1+" added to "+ title);
        System.out.println("Added actor "+n2+" added to "+ title);
        System.out.println("Added actor "+n3+" added to "+ title);
    }
    public void showInfo(){
        System.out.println("Title: " + title);
        System.out.println("Director: " +director );
        System.out.println("Rating " + rating);
        System.out.println("Actors: "+ n1+", "+ n2+", "+ n3);
    }
}
