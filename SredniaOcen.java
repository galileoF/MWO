import java.util.Scanner;
/**
 * Created by adam on 25.10.16.
 */
public class SredniaOcen {
    public static void main(String[] args){

        System.out.println("Podaj ilosc ocen: ");
        Scanner scanner = new Scanner(System.in);
        int iloscOcen = scanner.nextInt();
        int[] marks = new int[iloscOcen];

        System.out.println("Podaj oceny : ");
        for(int i=0;i<iloscOcen;i++){
            marks[i] = scanner.nextInt();
        }

        System.out.println(average(marks));

    }
    public static double average(int[] marks){
        int sum = 0;

        for(int i=0; i<marks.length; i++){
            sum += marks[i];
        }

        return sum/(double)marks.length;
    }

}
