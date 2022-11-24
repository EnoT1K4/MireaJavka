
import java.util.*;

public class PolGen {
    public Vector<Integer> Chet = new Vector<Integer>();
    private int n;
    private int[] array = new int[n];

    public PolGen(int n, int[] array){
        this.n = n;
        this.array = array;
    }

    public int[] genMass(int n, int[] array){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(0, n);
            System.out.println(array[i]);
        }
        return array;
    }
   public Vector<Integer> chetMass(int[] array){
        for(int i =0;i < array.length; i++){
            if(array[i]%2==0){ Chet.addElement(array[i]);}
        }
        return Chet;
    }
}
