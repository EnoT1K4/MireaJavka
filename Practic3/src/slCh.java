import java.util.*;
public class slCh {
    private int[] array = new int[4];

    public slCh(int[] array) {
        this.array = array;
    }

    public int[] genMass(int[] array) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(10, 99);
            System.out.println(array[i]);
        }
        return array;
    }
     public  String provMass(int[] array){
        if((array[0]<array[1]) && (array[1]< array[2]) && (array[2] < array[3])){
            return "All ok";
        }
        return "All not OK";
     }
}




