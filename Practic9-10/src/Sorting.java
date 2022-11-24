public class Sorting {
    public static void selectionSort(Comparable[] list) {
        int min;
        Comparable temp;
        for (int index = 0; index < list.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++) {
                if (list[scan].compareTo(list[min]) < 0) {
                    min = scan;
                    temp = list[min];
                    list[min] = list[index];
                    list[index] = temp;
                }
            }
        }
    }
    void merge (int array1[], int length1, int array2[], int length2, int result[]) {
        int i1 = 0, i2 = 0, ir = 0;

        while (i1 < length1 && i2 < length2) {
            if (array1[i1] <= array2[i2]) {
                result[ir] = array1[i1];
                i1 = i1 + 1;
            } else {
                result[ir] = array2[i2];
                i2 = i2 + 1;
            }
            ir = ir + 1;
        }
        while (i1 < length1) {
            result[ir] = array1[i1];
            i1 = i1 + 1;
            ir = ir + 1;
        }
        while (i2 < length2) {
            result[ir] = array2[i2];
            i2 = i2 + 1;
            ir = ir + 1;
        }
    }
}
