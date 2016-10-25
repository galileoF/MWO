import java.util.Scanner;

/**
 * Created by adam on 23.10.16.
 */
public class BusinessCard {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=scanner.next();
        System.out.println("Enter your surname: ");
        String surname=scanner.next();
        System.out.println("Enter your phone number: ");
        int tel=scanner.nextInt();
        System.out.println("Enter your city of residence: ");
        String city=scanner.next();


        String firstLine = "* " + name + " " + surname + " *";
        String secondLine = "* " + tel + " adres: " + city + " *" ;
        String stars="";
        if(secondLine.length() > firstLine.length()){
            for(int i=0; i<secondLine.length();i++){
                stars += "*";
            }
        }
        else{
            for(int i=0; i<firstLine.length();i++){
                stars += "*";
            }
        }

        System.out.println(stars);

        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(stars);


    }
}
