import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


public class ah {


    public static void main(String[] args) {


        // Scanner scanner=new Scanner(System.in);
        //aici avem un program care ne arata data la momentul compilarii
        arataData();

        //program care determina lungimea unui string
        lungime();

        //program care verifica daca o variabila este palindrom
       MyClass.palindromCheck();

       //program pentru efectuarea de permutari a unui string/numar
        MyClass.permu(0,"ana");

        Punct2D.modificaCoordonate();

        //ascii caractere
        MyClass.caractereleAscii();


        long start = System.nanoTime();
        System.out.println("Arata mi viteza de rulare " + start);


        MyClass clasaUnu = new MyClass(21, 34);
        clasaUnu.arataCaractere();


        Persoana persOne = new Persoana("Marculescu", " Gabriel-Florin ", 33);
/*        persOne.setNume("Marculescu");
        persOne.setPrenume("Gabriel-Florin");
        persOne.setVarsta(33);
*/
        persOne.showChars();

        Persoana persTwo = new Persoana("Amariei ", "Maria Ionela ", 31);
        persTwo.showChars();



    /*   persTwo.setNume(null);
       persTwo.setPrenume(null);
       persTwo.setVarsta(0);
*/
        //      System.out.println("Persoana definita se numeste " + persOne.getNume()+persOne.getPrenume() + "si este in varsta de " +persOne.getVarsta());
        //   System.out.println("Cealalta persoana " + persTwo.getNume()+ "prenumele este "+persTwo.getPrenume()+ "si are ani " +persTwo.getVarsta());


    }

    public static void arataData() {
        Date date = new Date();


        System.out.println("Data de azi este " + date);

    }

    public static void lungime() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cuvantul:");
        String cuvant = scanner.nextLine();
        System.out.println("Lungimea cuvantului este " + cuvant.length());
        return;


    }

}






