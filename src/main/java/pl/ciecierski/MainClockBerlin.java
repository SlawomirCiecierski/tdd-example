package pl.ciecierski;
import java.time.LocalTime;
import static pl.ciecierski.BerlinClock.getFullTime;




  public class MainClockBerlin {




    public static void main(String[] args) {

      while (true){


        System.out.print(LocalTime.now()+" in BerlinClock -> ");
        System.out.println(getFullTime(LocalTime.now()));

        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }


      }
    }



}
