/**
 * Created by adam on 14.11.16.
 */
public class BubbleSort {
    public static void main(String[] args){
        int[] numbers = new int[] {4, 2, 0, 2, 10, 1, 9, 12, 3, 5};

        sort(numbers);
        printNumbers(numbers);
    }
    public static void swap(int a, int b){
        int c;
        c = b;
        b = a;
        a = c;

        }



    public static boolean isGreaterThan(int a, int b){
            if (a > b) {
                return true;
            }
            else {
                return false;
            }


    }

    public static int[] sort(int[] mess){
        for(int i=0;i<mess.length;i++){
        for(int j=0;j<mess.length-1;j++) {
            if (isGreaterThan(mess[j], mess[j+1])) {
                //swap(mess[j], mess[j+1]);
                int tmp;
                tmp = mess[j+1];
                mess[j+1]=mess[j];
                mess[j]=tmp;
            }

        }

    }
    return mess;
    }
    public static void printNumbers(int[] sorted) {

        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);

        }
    }

}
