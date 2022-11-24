class Shape
{
    private String shapeName; // приватная переменная

    public Shape(String shapeName){
        this.shapeName = shapeName;
    }
    public String getShapeName(){
        return shapeName;
    }// Вернуть название фигуры
}

class Circle extends Shape
{
    public int radius;
    public Circle(String shapeName, int radius){
        super(shapeName);
        this.radius = radius;
    } // Конструктор
    public void setR(int radius){
        this.radius = radius;
    }

    public double getAreaC(){
        return 2*3.14 * radius*radius;
    }
}

class Rectangle extends Shape
{
    public int a;
    public Rectangle(String shapeName, int a){
        super(shapeName);
        this.a = a;
    } // Конструктор
    public void setA(int a){
        this.a = a;
    }
    public double getAreaRec(){
        return a*a;
    }
    public double getPerem(){
        return a*4;
    }
 }



class Triangle extends Shape {
    public int a, h;

    public Triangle(String shapeName, int a, int h) {
        super(shapeName);
        this.a = a;
        this.h = h;
    }
    public void setAT(int a){
        this.a =a;
    }
    public void setHT(int h){
        this.h = h;
    }
    public double getAreaTri(){
        return 0.5*a*h;
    }
    public int getPeremTri(){
        return 3*a;
    }

}
    // Конструктор

//}

/*
class MountainBike extends Bicycle {
public int seatHeight; //новое поле произв. класса //конструктор производного класса
public MountainBike(int gear, int speed,
int startHeight){
// здесь вызов конструктора класса родителя super(gear, speed);
seatHeight = startHeight;
}
// новый метод производного класса
public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }=
// переопределенный метод toString()класса Bicycle
@Override public String toString(){
return (super.toString() + "\nseat height is "
+ seatHeight);
} }
// класс тестер Main
public class Main {
public static void main(String args[]){
// создаем объект родительского класса
44
Bicycle bl = new Bicycle(5,200);
    System.out.println(bl.toString());
    // создаем объект дочернего класса
    MountainBike mb = new MountainBike(3, 100, 25);
    System.out.println(mb.toString());
} }

 */

