/**
 * Created by adam on 14.11.16.
 */
public class BubbleSort {
    public static void main(String[] args){
        int[] numbers = new int[] {4, 2, 0, 2, 10, 1, 9, 12, 3, 5};

        printNumbers(numbers);
    }
    public static void swap(int[] values){
        for(int j=0; j<values.length-1;j++) {
            int temp;
            temp = values[j + 1];
            values[j + 1] = values[j];
            values[j] = temp;


        }

    }
    public static boolean isGreaterThan(int value1, int value2){
            if (value1 > value2) {
                return true;
            }
            else {
                return false;
            }


    }

    public static void sort(int[] mess){
        for(int j=0;j<mess.length-1;j++) {
            if (isGreaterThan(mess[j], mess[j+1])) {
                swap(mess);

            }
        }
    }
    public static void printNumbers(int[] sorted) {
        sort(sorted);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);

        }
    }

}
