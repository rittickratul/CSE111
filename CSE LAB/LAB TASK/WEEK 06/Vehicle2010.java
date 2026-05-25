public class Vehicle2010 extends Vehicle{
    public void moveLowerLeft(){
        super.moveDown();// its better to write super calling a parent class method
        super.moveLeft();
    }
    public void moveUpperRight(){
        super.moveRight();
        super.moveUp();
    }
    public void moveLowerRight(){
        super.moveRight();
        super.moveDown();
    }
}