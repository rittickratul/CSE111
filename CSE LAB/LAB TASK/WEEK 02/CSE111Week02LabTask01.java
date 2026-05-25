public class CSE111Week02LabTask01 {
    public static void main(String[] args) {
        University u1 = new University();
        University u2 = new University();
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u1.name);
        System.out.println(u1.country);
        System.out.println(u2.name);
        System.out.println(u2.country);
        System.out.println("================");
        u1.name = "Imperial College London";
        u1.country = "England";
        u1.name = "BRAC University";
        u1.country = "Bangladesh";
        System.out.println(u1.name);
        System.out.println(u1.country);
        System.out.println(u2.name);
        System.out.println(u2.country);
    }
}
