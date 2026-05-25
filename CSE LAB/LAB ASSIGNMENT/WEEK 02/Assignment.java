public class Assignment {
    public int tasks;
    public String difficulty;
    public boolean submission = false;
    public void printDetails(){
        System.out.println("Numeber of tasks: "+tasks);
        System.out.println("Difficulty level: "+difficulty);
        System.out.println("Submission required: "+submission);
    }
    public String makeOptional(){
        if(submission==true){
            return "Assignment will not require submission";      
        }
        else{
            return "Submission is already not required";
        }
    }
}
