public interface
Movable {
    void MoveUp();

    void MoveDown();

    void MoveRight();

    void MoveLeft();

}
class MovablePoint implements Movable{
    public static double x;
    public static double y;
    public int xSpeed;
    public int ySpeed;

    public MovablePoint(double x, double y,int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed =  xSpeed;
        this.ySpeed =  ySpeed;

    }
    public MovablePoint(){
        this.x = 0.0;
        this.y = 0.0;
        this.xSpeed =  1;
        this.ySpeed =  1;

    }

    public static double getX() {
        return x;
    }
    public static double getY(){
        return y;
    }

    public void MoveUp() {
        y+= ySpeed;

    }


    public void MoveDown() {
        y-= ySpeed;

    }


    public void MoveRight() {
        x+= xSpeed;


    }


    public void MoveLeft() {
        x -= xSpeed;

    }
    public void ChangeSpeed(int xSpeed, int ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

}
class MovableCircle implements Movable{


    public MovablePoint point = new MovablePoint();
    public int r;
    public int xSpeed;
    public int ySpeed;

    public MovableCircle(){
        point = new MovablePoint();
        r = 10;
    }


    public void ChangeSpeed(int xSpeed, int ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void MoveUp() {
        point.MoveUp();

    }


    public void MoveDown() {
        point.MoveDown();

    }


    public void MoveRight() {
        point.MoveRight();


    }


    public void MoveLeft() {
        point.MoveLeft();


    }

}
class MovableRectangle implements Movable{
    public MovablePoint TopLeft;
    public MovablePoint DownRight;
//    public int xSpeed;
//    public int ySpeed;

    public MovableRectangle(){
        TopLeft = new MovablePoint(0.0,0.0,1,1);
        DownRight = new MovablePoint(2.0,1.0,1,1);
    }





    public void MoveUp() {
        TopLeft.MoveUp();
        DownRight.MoveUp();

    }


    public void MoveDown() {
        TopLeft.MoveDown();
        DownRight.MoveDown();
    }


    public void MoveRight() {
        TopLeft.MoveRight();
        DownRight.MoveRight();

    }


    public void MoveLeft() {
        TopLeft.MoveLeft();
        DownRight.MoveLeft();
    }
}

class Main{
    public static void main(String[] args) {
        Movable d = new MovablePoint();
        d.MoveLeft();
        MovablePoint d1 = new MovablePoint(2.0,3.0,4,5);
        d1.ChangeSpeed(0,0);
        d1.MoveUp();
        MovableCircle d2 = new MovableCircle();
        d2.ChangeSpeed(3,4);
        d2.MoveUp();
        MovableRectangle d3 = new MovableRectangle();
        d3.MoveUp();
        d3.MoveLeft();
    }
}
