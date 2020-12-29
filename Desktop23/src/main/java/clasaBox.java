import java.util.Scanner;

public class clasaBox {

    private double id;
    private int latime;
    private int lungime;
    private int inaltime;


public clasaBox() {
    System.out.println("Constructorul gol al clasei Box");
    this.id = 0.0;
    this.latime = 0;
    this.inaltime = 0;
    this.lungime = 0;

}
public clasaBox(double id,int lungime,int latime,int inaltime){
    this.id=id;
    this.lungime=lungime;
    this.latime=latime;
    this.inaltime=inaltime;
}
public static void volumulBox(){

    System.out.println("Generati datele cutiei Box");
    Scanner sc=new Scanner(System.in);
   double  id=Math.random()*6+1;
    int latime=sc.nextInt();
    int inaltime=sc.nextInt();
    int lungime=sc.nextInt();
     int  volumul=latime*lungime*inaltime;
    System.out.println("Avem cutia cu numarul " + id +" iar volumul cutiei este "+volumul);
}
}