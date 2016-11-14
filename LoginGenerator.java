/**
 * Created by adam on 14.11.16.
 */
public class LoginGenerator {

    public static void main(String[] args){

        String[] studentNames =  {
                "Budynek Piotr",
                "Chalupa Krystyna",
                "Wiezowiec Jan",
                "Szkieletor Andrzej",
                "Domek Marianna"};
        login(studentNames);

    }
    public static void login(String[] x){
        for (String element:x
             ) {
            String[] osoba = element.split("\\s+");
            String nazwisko = osoba[0].toString().toLowerCase();
            String imie = osoba[1].toString().toLowerCase();
            System.out.println(imie.substring(0,3) + nazwisko.substring(0,2)+"@student.agh.edu.pl");


        }

    }
}
