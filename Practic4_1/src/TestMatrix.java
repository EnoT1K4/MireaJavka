public class TestMatrix {
    public static void main(String[] args) {
        Matrix a = new Matrix(4, 4);
        a.fillRandom();
        a.print("A (random filled matrix)");
        Matrix b = new Matrix(new double[][]{{1, 2, 1, 2}, {2, 1, 2, 1}, {1, 2, 1, 2}, {2, 1, 2, 1}});
        b.print("B (manually filled matrix)");
        Matrix c = a.add(b);
        c.print("C = A + B");
        Matrix d = c.multiply(2);
        d.print("D = C * 2");
    }
}
