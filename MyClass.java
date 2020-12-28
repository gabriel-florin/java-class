import java.util.Scanner;

public class MyClass {

    //Testati diferenta de viteza introdusa de creearea de noi obiecte.Masurati diferenta intre folosirea de
    //newInteger (2+3) si 2+3, dupa modelul de mai jos:

   // private long run() {
        long start = System.nanoTime();

        //introdu aici codul tau pt a testa diferenta de viteza la rulare a programului
     //   Integer f = new Integer(2 + 3);


    // return System.nanoTime() - start;

    //}




    private int a;
    private int b;
    private int c;


public MyClass(int a,int b ) {

    this.a = a;
    this.b = b;
    this.c = a + b;

}
public void arataCaractere() {
    System.out.println("Initializarea incheiata si avem valorile :a= " + a + " la b avem " + b + " si c-ul va fi suma lor fiind "
            + c);

}

    public static void palindromCheck() {
        String original, reverse = ""; // Objects of String class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = scanner.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        if (original.equalsIgnoreCase(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");


}



    static void permu(int fixed,String s) {

        char[] chr=s.toCharArray();
        if(fixed==s.length())
            System.out.println(s);
        for(int i=fixed;i<s.length();i++) {
            char c=chr[i];
            chr[i]=chr[fixed];
            chr[fixed]=c;
            permu(fixed+1,new String(chr));
        }
      //  System.out.println("Permutarile stringului/numarului ales vor fi :" );

    }
    public static void caractereleAscii() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti linia ce va fi testata:");
        String linia = scanner.nextLine();

        System.out.println("Printeaza caracterul la "+linia.charAt(1));


}

}
