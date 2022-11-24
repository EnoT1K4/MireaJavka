interface  Drawable {
    void  draw ();
}

class  Rectangle implements Drawable {
    public void draw () {
        System.out.println("Рисование прямоугольника\n" );
    }}
class  Circle implements Drawable {
    public void draw(){
        System.out.println("Рисование круга\n" );
    }
}

class Main1 {
    public static void main (String args []) {
        Drawable d = new Circle ();

        d.draw ();
        Drawable d1 = new Rectangle();
        d1.draw();
    }}