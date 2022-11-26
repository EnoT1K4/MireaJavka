import java.util.*;
public class GenerateRandMass {
    private int N;

    private int[] arr = new int[10];


    public static void Sort(int[] arr) {
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами
             */
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

    }


    public void GenerateMath(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //элементу массива присваивается случайное число от 0 до 99
            arr[i] = (int) (Math.random() * 100);
        }
    }

    public void GenerateRand(int[] arr){
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            arr[i] = random.nextInt(100);
            System.out.println(arr[i]);

        }

    }

}