import java.util.Scanner;
import java.lang.Math;
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
        int firstLineLen = firstLine.length();
        int secondLineLen = secondLine.length();
        int difference=Math.abs(firstLineLen-secondLineLen);
        String space="";
        for(int i=0;i<difference;i++){space+=" ";}
        int greater;
        if(firstLineLen < secondLineLen){
            greater=secondLineLen;
            firstLine = "* " + name + " " + surname + space + " *";
            }
        else{
            greater=firstLineLen;
            secondLine = "* " + tel + " adres: " + city + space + " *" ;
            }
        String stars="";
        for(int i=0;i<greater;i++){stars+="*";}


        System.out.println(stars);
        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(stars);


    }
}
