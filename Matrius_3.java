//Fet per Joel Ferrer
class Matrius_1{
  public static void main(String[] args){
    //Definim i inicializtem algunes de les variables que farem servir
    int[][] array = new int[10][10];
    int rowSum = 0, columnSum = 0;


    //Imprimim la array
    for (byte i = 0; i < 10; i++) {
      for (byte j = 0; j < 10; j++) {
        array[i][j] = (int) (Math.random()*10);
        rowSum = rowSum + array[i][j];
        System.out.printf("%3d",(array[i][j]));
      }
      //Imprimim la columna vertical de sumes
      System.out.println(" | "+rowSum);
      rowSum = 0;
    }

    System.out.println("-------------------------------+");
    //Imprimim la fila horitzontal de sumes
    for (byte i = 0; i < 10; i++) {
      for (byte j = 0; j < 10; j++) {
        columnSum = columnSum + array[j][i];
      }
      System.out.print(" "+columnSum);
      columnSum = 0;
    }
    System.out.print("\n");
  }
}
