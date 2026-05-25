class TraceTask {
 public static int x = 3;
 public int y = 5;
 public int z = 2;
 public TraceTask(int z) {
   this.z = z;
   x += 2;
   this.y = x - this.z;
 }
 public void methodA(int x) {
   this.y = x + this.y + TraceTask.x;
   x = this.z + 4;
   TraceTask.x = this.y - x;
   System.out.println(x + " " + this.y + " " + TraceTask.x);
 }
 public int methodB(TraceTask t, int z) {
   int y = 2;
   t.z = this.z + y;
   t.methodA(y);
   this.x = t.y + this.z;
   System.out.println(this.z + " " + t.z + " " + y);
   return this.x;
 }
}

 
public class CSE111Week05OptionalTask02 {
    public static void main(String[] args) {
        
         TraceTask t1 = new TraceTask(4);
        TraceTask t2 = new TraceTask(2);
        t1.methodA(3);
        int res = t2.methodB(t1, 5);
        System.out.println(res + " " + TraceTask.x + " " + t1.z);

    }
}
