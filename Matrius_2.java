//Fet per Joel Ferrer
import java.util.Scanner;

class Matrius_1{
  public static void main(String[] args){
    //Definim i inicialitzem la variable que farem servir per a introduir dades
    Scanner input = new Scanner(System.in);
    //Definim i inicializtem algunes de les variables que farem servir
    int size = 0;
    int[][] array;
    boolean check = false;
    //Solicitem la entrada de dades
    System.out.print("Entra la mida n de la matriu (n x n). ");
    System.out.print("Per raons de visualització, recomenem un valor no superior a 59: ");
    //Comprovem que les dades son correctes
    while(!check){
      try{
        size = input.nextInt();
        check = true;
        while (size <= 0){
          System.out.print("El valor ha de ser superior a 0: ");
          size = input.nextInt();
        }
      }catch (Exception ex){
        System.out.print("Recorda que ha de ser un nombre enter! ");
        input.next();
        System.out.print("Entra la mida n de la matriu (n x n): ");
      }
    }
    //Inicialitzem la array
    array = new int[size][size];
    //La imprimim i calculem les posicións
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        array[i][j] = i + j;
        System.out.printf("%4d",(array[i][j]));
      }
      System.out.println();
    }
  }
}
