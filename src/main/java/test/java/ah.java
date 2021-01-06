import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class ah {

    public static void main(String[] args) {

        // Scanner scanner=new Scanner(System.in);
        //aici avem un program care ne arata data la momentul compilarii
        Date today = new Date();
        arataData(today);

        //program care determina lungimea unui string
        lungime();

        //program care verifica daca o variabila este palindrom
         MyClass.palindromCheck();

         //program pentru efectuarea de permutari a unui string/numar
         MyClass.permu(0,"ana");

         Punct2D punct = new  Punct2D();
         punct.modificaCoordonate();

        //ascii caractere
        MyClass.caractereleAscii();

        //aici avem un program care simuleaza niste cutii cu cod id si volumul calculat pe formula
        // h*L*l
        clasaBox.volumulBox();

        long start = System.nanoTime();
        System.out.println("Arata mi viteza de rulare " + start);

        MyClass clasaUnu = new MyClass(21, 34);
        clasaUnu.arataCaractere();

        //program pt a vedea cea mai varstnica dintre persoane
        Persoana persOne = new Persoana("Marculescu", " Gabriel-Florin ", 33);
        persOne.showChars();

        Persoana persTwo = new Persoana("Amariei ", "Maria Ionela ", 31);
        persTwo.showChars();
        Persoana persThree=new Persoana("Amariei","Radu",23);

        if (persOne.getVarsta()>persTwo.getVarsta()&persOne.getVarsta()>persThree.getVarsta()){
            System.out.println("Varsta persoanei unu este mai mare dacat varsta persoanei doi si trei");
        }
        else if (persTwo.getVarsta()>persOne.getVarsta()&persTwo.getVarsta()>persThree.getVarsta()){
            System.out.println("Persoana a doua este mai in varsta decat persoana unu si trei");
        }
        else
            System.out.println("Persoana a treia este cea mai in varsta");


        //program pt a vedea programul de activitati in functie de varsta
        Persoana.Program("Anei","Elena",61);
        Persoana.Program("Barsan","Ilie",47);
        Persoana.Program("Balta","Paul-Iulian",35);
    }

    public static void arataData(Date inputDate) {
        System.out.println("Data de azi este " + inputDate);
    }

    public static void lungime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cuvantul:");
        String cuvant = scanner.nextLine();
        System.out.println("Lungimea cuvantului este " + cuvant.length());
        return;
}}






