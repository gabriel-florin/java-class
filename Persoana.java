



public class Persoana {




  //  System.out.print("Introduceti numele,prenumele si varsta persoanei:");
   private String nume;
   private   String prenume;
   private   int varsta;

   public Persoana(){
       System.out.println("Constructorul gol al clasei *Persoana*");
       this.nume="Niciunul";
       this.prenume="Lipsa";
       this.varsta=0;

   }
   public Persoana(String nume,String prenume,int varsta){
       this.nume=nume;
       this.prenume=prenume;
       this.varsta=varsta;
       System.out.println("Initializare reusita!");
   }

   public void setNume(String nume){
       this.nume=nume;
   }
   public void setPrenume(String prenume){
       this.prenume=prenume;
   }
   public void setVarsta(int varsta){this.varsta=varsta; }


   public String getNume(){
      return this.nume;
   }
   public  String getPrenume(){
       return this.prenume;
   }
   public int getVarsta(){
       return this.varsta;
   }
   public void showChars(){
       System.out.println("Persoana definita se numeste " + this.nume+this.prenume + " si este in varsta de " +this.varsta+"de ani");
   }

    public static void Program(String nume,String prenume,int varsta) {

       if (varsta<25){
           System.out.println("This person is going to the mall");
       }
       else if (varsta>25&varsta<30){
           System.out.println("This person is gone party tonight");
       }
       else if (varsta>30&varsta<40){
           System.out.println("This person is going to the theatre");
       }
       else if (varsta>40){
            System.out.println("Is gone stay home tonight");
        }
       else
           System.out.println("Varsta nu exista");

   }

    }

