import java.sql.SQLOutput;

public class Clase1 {
    public static void main(String[] args) {
        Ultramarines titus = new Ultramarines();

        titus.performExterminatus();
        String battleCry = ("For the emperor!!!");
        System.out.println(battleCry);
        String RoubuteGuilliman, MarneusCalgar;
        RoubuteGuilliman = "I am the primarc if the ultramarines";
        MarneusCalgar = " I am the chapter master of the ultra marines";
        System.out.print("Rise");
        System.out.print(" son of Guillaman");
    }
}
class Ultramarines{
    void performExterminatus(){
            System.out.println("Die heretics!!!!");
    }
}