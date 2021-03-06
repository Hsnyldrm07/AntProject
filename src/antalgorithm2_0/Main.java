
package antalgorithm2_0;

public class Main {

    public static void main(String[] args) {
       World world=new World(7,'a','g',3); 
      // parametry świata: liczba punktów, home, food,
      //                   liczba punktów wyboru dla mrówek
      // Uwaga: Minimalna liczba punktów wyboru to dwa.
      // Przy dwóch punktach wyboru może wystąpić zapętlenie,
      // zwłaszcza w sytuacji, gdy mrówki wracają do mrowiska.
      // Należy wtedy powtórzyć badanie.
      world.inicjuj();
      Mrowisko m=new Mrowisko(world,15,1); // parametry mrowiska: nazwa świata,
      // liczba mrówek, ilość pozostawianego feromonu przez mrówkę
      System.out.println("---------- stan poczatkowy");
      m.pokaz();                          // mrowisko - stan początkowy
      world.pokaz(); System.out.println();// świat    - stan początkowy
      for(int i=1;i<=8;i++){
        System.out.println("---------- "+ i +" cykl ----------"); 
       m.move(); m.pokaz();
       world.pokaz(); System.out.println();
      }
    }
}
    