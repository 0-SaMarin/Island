import java.util.ArrayList;

public class Interface {
    public static void main(String[] args) {
//        ArrayList <Bird>
    }

    public interface CanFly {
        boolean canFly = true;

        String flying = "estoy volando";
    }

    public class Bird implements CanFly{
         private String name;
         private String race;

         public Bird(String name, String race) {
              this.name = name;
              this.race = race;
         }

         boolean canFly = true;

         String flying = "estoy volando";
    }

    public class BlueJay extends Bird implements CanFly{

        public BlueJay(String name, String race) {
            super(name, race);
        }
    }
}
