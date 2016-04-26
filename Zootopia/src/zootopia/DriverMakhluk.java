package zootopia;
import java.util.Random;
/**
* @author Cendhika Imantoro / 13514037
*/
public class DriverMakhluk {
  
  public static void main(String[] args) {

    Random rand = new Random();
    int worldsize = 3;
    int temp;
    Makhluk P;
    int i;

    for (i = 0; i < 16; i++)
    {
        temp = rand.nextInt(8);

        if (temp == 0)
        {
            P = new Elang(worldsize);
            System.out.print("Elang : ");
        }
        else if (temp == 1)
        {
            P = new Garuda(worldsize);
            System.out.print("Garuda : ");
        }
        else if (temp == 2)
        {
            P = new Rajawali(worldsize);
            System.out.print("Rajawali : ");
        }
        else if (temp == 3)
        {
            P = new Pelikan(worldsize);
            System.out.print("Pelikan : ");
        }
        else if (temp == 4)
        {
            P = new Cicak(worldsize);
            System.out.print("Cicak : ");
        }
        else if (temp == 5)
        {
            P = new Kadal(worldsize);
            System.out.print("Kadal : ");
        }
        else if (temp == 6)
        {
            P = new Katak(worldsize);
            System.out.print("Katak : ");
        }
        else
        {
            P = new Belut(worldsize);
            System.out.print("Belut : ");
        }

        System.out.print("ID(" + P.getID() + ") ");
        System.out.print("Karakter(" + P.getChar() + ") ");
        System.out.print("Kekuatan(" + P.getKekuatan() + ") ");
        System.out.println("Posisi(" + P.getPosisi().getX() + ", "
                + P.getPosisi().getY() + ")");
    }
  }
}
