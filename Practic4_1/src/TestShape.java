public class TestShape {
    public static void main(String[] args) {
        Shape sh = new Shape("Rectangle");
        System.out.println(sh.getShapeName());
        Rectangle rec = new Rectangle("Rect", 4);
        System.out.println(rec.getPerem());
        Triangle tr = new Triangle("Triangle", 10, 4);
        tr.setAT(4);
        System.out.println(tr.getShapeName());
        System.out.println(tr.getPeremTri());
        System.out.println(tr.getPeremTri());

    }
}
