public class Teacher {
   public String name;
   public String initial;
   public Course [] allCourse = new Course[3];
   int count = 0;
   public Teacher(String nm,String in){
    name = nm;
    initial = in;
    System.out.println("A new teacher has been created");
   } 
   public void addCourse(Course c){
    if(count<allCourse.length){
        allCourse[count] = c;//this is passing the reference
        count++;
    }
   }
   public void printDetail(){
    System.out.println("Name: "+ name);
    System.out.println("Initial: "+ initial);
    System.out.println("List of Courses: ");
    for(int i = 0;i<count;i++){
        //We have to call getCourse as Course class variables are private
        System.out.println(allCourse[i].getCourse());
    }
   }
}
