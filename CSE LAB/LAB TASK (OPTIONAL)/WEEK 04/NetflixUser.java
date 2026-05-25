public class NetflixUser {
    public String name ;
    public String type;
    public Movie [] detail = new Movie[3];
    public int count;
    public NetflixUser (String n){
        name = n;
        type = "Free";
        System.out.println("New user account created!");
    }
    public NetflixUser (String n,String t){
        name = n;
        type = t;
        System.out.println("New user account created!");
    }
    public void addToFavourites(Movie m){
        if(type.equals("Free")){
            System.out.println("Cannot add movies to favourites.");
            System.out.println("Please upgrade to Netflix Premium.");
        }
        else{
            if(count<3){
                detail[count] = m;
                System.out.println("Movie added to favourites.");
                count++;
            }
            else{
                System.out.println("Cannot add new movies. Favourites list is full.");
            }
        }
    }
    public void showFavourites(){
        if(type.equals("Free")){
            System.out.println("No available favourites. Please upgrade to Netflix Premium.");
        }
        else{
            System.out.println("Showing "+name+"'s Favourites:");
            for(int i = 0;i<count;i++){
                System.out.println(detail[i].name+", "+detail[i].genre+", "+detail[i].runTime);
            }
        }
    }
    public void upgradePlan(){
        if(type.equals("Premium")){
            System.out.println("You already have Netflix Premium!");
        }
        else{
        type = "Premium";
        System.out.println("Welcome to Netflix Premium!");
        }
    }
}
