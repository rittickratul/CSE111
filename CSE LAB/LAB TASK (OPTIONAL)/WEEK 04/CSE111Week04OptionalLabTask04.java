
public class CSE111Week04OptionalLabTask04 {

    public static void main(String[] args) {
        Studeant s1 = new Studeant("Akib", 10, 3.29);
        Studeant s2 = new Studeant("Reza", 15, 3.45);
        Studeant s3 = new Studeant("Kabir", 20, 4.0);
        System.out.println("1===========");
        Department cse = new Department("CSE");
        cse.findStudent(-100);
        System.out.println("2===========");
        cse.addStudent(s1, s2, s3);
        System.out.println("3===========");
        cse.details();
        System.out.println("4===========");
        cse.findStudent(15);
        System.out.println("5===========");
        Studeant s4 = new Studeant("Nakib", 15, 3.22);
        cse.addStudent(s4);
        System.out.println("6===========");
        s4.setId(25);
        cse.addStudent(s4);
        System.out.println("7===========");
        cse.details();
        System.out.println("8===========");
        Studeant s5 = new Studeant("Sakib", 30, 2.29);
        cse.addStudent(s5);
        System.out.println("9===========");
        cse.details();
    }
}
