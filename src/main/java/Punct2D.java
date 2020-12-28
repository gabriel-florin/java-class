import java.util.Scanner;

public class Punct2D {
    // implementeaza o clasa Punct2D care sa contina:
    //un constructor care primeste doua numere reale(float) ce reprezinta coordonatele
    //o metoda modificaCoordonate ce primeste doua numere reale si modifica cele doua coordonate ale punctului
    //o functie de afisare a unui punct care va afisa punctul in formatul urmator(x,y).

    private static float coordonate1;
    private static float coordonate2;


    public Punct2D(float coordonate1, float coordonate2) {
        System.out.println("Constructorul clasei Punct2D");

        this.coordonate1 = 0f;
        this.coordonate2 = 0f;
        // this.c = a + b;


    }

    public void setCoordonate1(float coordonate1) {
        this.coordonate1 = coordonate1;
    }

    public void setCoordonate2(float coordonate2) {
        this.coordonate2 = coordonate2;
    }

    public float getCoordonate1() {
        return this.coordonate1;
    }

    public float getCoordonate2() {
        return this.coordonate2;
    }


  /*  public static void modificaCoordonate(float latitudine,float longitudine){

        this.coordonate1 = coordonate1;
        this.coordonate2= coordonate2;
        // this.c = a + b;


         Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti cele doua puncte ");
         latitudine=scanner.nextFloat();
         longitudine=scanner.nextFloat();

         if (latitudine !=0){
             latitudine=coordonate1+latitudine;

         }if (longitudine!=0){
             longitudine=coordonate2+longitudine;
        }
         else
            System.out.println("Numerele introduse nu sunt reale");



            }

        }
*/
        public static void modificaCoordonate() {
           ;
          //  this.coordonate1 = coordonate1;
            //this.coordonate2 = coordonate2;
            // this.c = a + b;


            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti cele doua puncte ");

            try {


                float latitudine = scanner.nextFloat();


                float longitudine = scanner.nextFloat();


                if (latitudine != 0) {
                    latitudine = coordonate1 + latitudine;
                    System.out.println("Latitudinea este " + latitudine);

                }
                if (longitudine != 0) {
                    longitudine = coordonate2 + longitudine;
                    System.out.println("Longitudinea este " + longitudine);
                } else
                    System.out.println("Numerele introduse nu sunt reale");
            }
            catch (Exception e) {
                System.out.println("Codul nu a rulat datorita exceptiei "  +e.getMessage());
            }
            System.out.println("Acum e in regula!");


        }
    }

