class Foo {
    String name = "foo";
    public void call1() {
        System.out.println("Foo 1");
    }
    public void call2() {
        call1();
        System.out.println("Foo 2");
    }
}
class Bar extends Foo {
    public void call2() {
        System.out.println("Bar 2");
    }
    public void call3() {
        System.out.println("Bar 3");
    }
}
class Buzz extends Bar {
    String name = "Buzz";
    public void call1() {
        System.out.println("Buzz 1");
    }
    public void call4() {
        call3();
        System.out.println("Buzz 4");
    }
}
class Bux extends Foo {
    String name = "Bux";
    public void call1() {
        System.out.println("Bux 1");
    }
    public void call3() {
        System.out.println("Bux 3");
    }
}
public class CSE111Week08OptionalLabTask03 {
    public static void main(String[] args) {
        Foo foo1 = new Foo();
        Bar bar1 = new Bar();
        Bux bux1 = new Bux();
        Foo foo2 = new Buzz();
        Bar bar2 = new Buzz();
        Object obj1 = new Foo();
        //==================================
        // bar1.call1();
        // foo2.call1();
        // foo2.call2();
        //bar2.call3();
        // System.out.println(bar1.name);
        // System.out.println(bar2.name);
        // System.out.println(((Buzz) bar2).name);
        // ((Buzz) bar1).call4();
        // ((Bar) foo1).call3();
        //((Foo) bux1).call1();
        //((Bux) foo1).call1();
        // bux1.call1();
        // bux1.call2();
        // ((Foo) foo2).call2();
        // ((Buzz) obj1).call3();
        // ((Buzz) obj1).call2();
        // ((Bux) foo2).call2();
        // ((Buzz) obj1).call1();
        // System.out.println(foo2.name);
        // System.out.println(((Bux) foo2).name);
    }
}
