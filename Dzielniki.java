import java.util.Scanner;
/**
 * Created by adam on 25.10.16.
 */
public class Dzielniki {
    public static void main(String[] args){
        readNumber();

        findDividers(liczba);
        printDividers();

    }
    public static int readNumber(){
        System.out.println("Podaj liczbę: ");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public static boolean checkDivider(int liczba, int b){
        System.out.println("Podaj dzielnik: ");
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextInt();
        if(liczba%b==0){
            return true;
        }
        else{
            return false;
        }

    }
    public static int findDividers(int x){
        int[] result = new int[10];
        for(int i = 1; i < x/2; i++){

            if(x%i==0){
                result[i-1]=i;
            }
        }
        return result;
    }
    public static String printDividers(){
        System.out.println(result);
    }
}
