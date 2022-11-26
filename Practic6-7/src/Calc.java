public class Calc implements MathCalculate {
    public int a;
    public int b;
    public int lenght;

    public void step(int a, int b) {
        for(int i = 1; i<b;i++){
            a*=a;
        }
        System.out.println(a);

    }

    public int module(int a) {
        if (a >= 0) {
            return a;
        }
        return a*(-1);
    }
    public double getLen(int lenght){
        return lenght * PI *2;
    }
}
