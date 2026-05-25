class A{
  public int x = 3, y = 5, sum = 9; 
  public int methodA(int temp, int x){
    this.x += (x++) + temp;
    if(temp % 5 == 2){
      sum += (this.y++) + temp;
    }
    else{
      sum += 3;
      if(y > 5) ++y;
    }
    System.out.println(this.x + " " + y + " " + sum);
    return this.x;
  } 
  public void methodB(int y){
    int temp = (y++) + this.y;
    this.y = (++temp) + methodA(temp, y) + x;
    sum = y + (++this.x) + (temp++);
    System.out.println(x + " " + y + " " + (sum++));
  }  
  public void methodC(int y){
    y = (this.x++) + sum + 3;
    System.out.println(x + " " + y + " " + sum);
  }
}
public class CSE111Week02LabAssignment06 {
    public static void main(String[] args) {
         A a1 = new A();
         a1.methodA(2, 4);
         a1.methodB(3);
         A a2 = new A();
         a2.methodC(7);
         a1.methodB(3);
    }
}
