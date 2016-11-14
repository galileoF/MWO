/**
 * Created by adam on 14.11.16.
 */
public class BubbleSort {
    public static void main(String[] args){
        int[] numbers = new int[] {4, 2, 0, 2, 10, 1, 9, 12, 3, 5};

        printNumbers(numbers);
    }
    public static void swap(int[] valuesInArray){
        for(int j=0; j<valuesInArray.length-1;j++) {
            int temp;
            temp = valuesInArray[j + 1];
            valuesInArray[j + 1] = valuesInArray[j];
            valuesInArray[j] = temp;


        }

    }
    public static boolean isGreaterThan(int[] values){
        for(int j=0; j<values.length-1;j++) {
            if (values[j] > values[j + 1]) {

            }
        }
        return true;

    }

    public static void sort(int[] mess){
        if(isGreaterThan(mess)){
            swap(mess);

        }
    }
    public static void printNumbers(int[] sorted) {
        sort(sorted);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);

        }
    }

}
