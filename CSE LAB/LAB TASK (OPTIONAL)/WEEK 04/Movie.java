public class Movie {
    public String name;
    public String genre;
    public String runTime;
    public Movie(String n,String g,String r){
        name = n;
        genre = g;
        runTime = r;
    }
    public Movie(String n,String g){
        name = n;
        genre = g;
        runTime = "Unknown";
    }
}
